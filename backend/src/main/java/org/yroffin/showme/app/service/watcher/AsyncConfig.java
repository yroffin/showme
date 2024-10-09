package org.yroffin.showme.app.service.watcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.yroffin.showme.app.ShowmeShell;

@Configuration
public class AsyncConfig {
    protected static final Logger LOG = LoggerFactory.getLogger(AsyncConfig.class);

    @Autowired
    private QueueService queueService;

    @Bean(name = "threadPoolTaskExecutor")
    public ThreadPoolTaskExecutor taskExecutor() {
        LOG.info("Initialize thread pool");
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5); // Set the core pool size
        executor.setMaxPoolSize(10); // Set the maximum pool size
        executor.setThreadNamePrefix("Async-"); // Set the thread name prefix
        executor.initialize();
        return executor;
    }

    @Bean
    public CommandLineRunner FileWatcher() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                // Perform startup tasks here
                queueService.produce(ShowmeShell.args.folder(), ShowmeShell.args.wildcard(),
                        ShowmeShell.args.recursive());
                queueService.consume();
            }
        };
    }
}