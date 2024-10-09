package org.yroffin.showme.app.service.watcher;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.jline.utils.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;
import org.yroffin.showme.app.model.DataMessage;
import org.yroffin.showme.app.model.ProjectRest;
import org.yroffin.showme.app.service.ProjectService;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

@Service
@EnableAsync
public class QueueService {
    protected static final Logger LOG = LoggerFactory.getLogger(QueueService.class);

    @Autowired
    ProjectService projectService;

    private BlockingQueue<DataMessage> queue = new LinkedBlockingDeque<>();

    public void add(DataMessage item) {
        LOG.debug("Add {}", item);
        queue.add(item);
    }

    public DataMessage get() throws InterruptedException {
        DataMessage msg = queue.take();
        LOG.debug("Get {}", msg);
        return msg;
    }

    private boolean running = true;

    /**
     * folder walker
     * 
     * @param path
     * @param watcher
     * @param recursive
     * @param output
     * @param wildcard
     * @return
     * @throws IOException
     */
    private List<String> walk(String path, WatchService watcher, boolean recursive, List<String> output,
            Pattern pattern) throws IOException {
        File root = new File(path);
        File[] list = root.listFiles();

        // register this directory for watching
        Path dir = Paths.get(root.getAbsolutePath());
        dir.register(watcher, StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
        LOG.info("Register {}", root.getAbsolutePath());

        if (list == null)
            return output;
        for (File f : list) {
            if (f.isDirectory()) {
                if (recursive) {
                    walk(f.getAbsolutePath(), watcher, recursive, output, pattern);
                }
            } else {
                if (pattern.matcher(f.getName()).matches()) {
                    output.add(f.getAbsoluteFile().getAbsolutePath());
                }
            }
        }
        return output;
    }

    @Async("threadPoolTaskExecutor")
    @SuppressWarnings("rawtypes")
    public void produce(String folder, String wildcard, boolean recursive) throws NoSuchAlgorithmException {
        LOG.info("Produce messages");
        try (// Create a WatchService instance
                WatchService watcher = FileSystems.getDefault().newWatchService()) {

            List<String> folders = this.walk(folder, watcher, recursive, new ArrayList<String>(),
                    Pattern.compile(wildcard));
            for (String file : folders) {
                add(new DataMessage(file).computeMD5());
            }

            // Process events
            while (running) {
                WatchKey key = watcher.take();
                key.pollEvents();
                key.reset();

                LOG.info("scan {}", folder);
                for (String file : folders) {
                    add(new DataMessage(file).computeMD5());
                }

                if (!running) {
                    break;
                }
            }
        } catch (IOException | InterruptedException e) {
            LOG.error("Error while scanning {} => {}", folder, e);
        }
    }

    @Async("threadPoolTaskExecutor")
    public void consume() throws InterruptedException, IOException {
        LOG.info("Consume messages");
        while (true) {
            DataMessage data = get();
            LOG.info("Message {}", data);
            Path path = Paths.get(data.getFilename());
            String content = Files.lines(path).collect(Collectors.joining("\n"));
            this.createWithYaml(content);
        }
    }

    public ProjectRest createWithYaml(String stream) {
        ProjectRest body = null;
        try {
            body = new ObjectMapper(new YAMLFactory())
                    .readValue(stream, ProjectRest.class);
        } catch (IOException e) {
            Log.warn("While parsing yaml {}", e.getMessage());
        }
        if (body != null) {
            return projectService.create(body.getName(), body);
        }
        return null;
    }

}
