package org.yroffin.showme.app.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.yroffin.showme.app.model.HeadRest;
import org.yroffin.showme.app.model.MetaRest;
import org.yroffin.showme.app.repository.ProjectRepository;
import org.yroffin.showme.app.repository.TextRepository;
import org.yroffin.showme.app.repository.jpa.ProjectJpa;
import org.yroffin.showme.app.repository.jpa.TextJpa;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class GenerateService {
    protected static final Logger LOG = LoggerFactory.getLogger(GenerateService.class);

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    TextRepository textRepository;

    @Autowired
    MarkdownService markdownService;

    ObjectMapper objectMapper = new ObjectMapper();

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public String render(String name, Model model) {
        Optional<ProjectJpa> p = projectRepository.findById(name);
        if (p.isPresent()) {
            ProjectJpa found = p.get();
            /**
             * head
             */
            HeadRest head = null;
            try {
                head = objectMapper.readValue(found.getHead(), HeadRest.class);
            } catch (JsonProcessingException e) {
                LOG.error("While parsing {} => {}", found.getHead(), e);
            }
            if (head != null) {
                model.addAttribute("head", head);
            }

            /**
             * meta
             */
            MetaRest meta = null;
            try {
                meta = objectMapper.readValue(found.getMeta(), MetaRest.class);
            } catch (JsonProcessingException e) {
                LOG.error("While parsing {} => {}", found.getMeta(), e);
            }
            if (meta != null) {
                model.addAttribute("meta", meta);
            }

            /**
             * slides
             */
            List<LinkedHashMap> slides = new ArrayList<LinkedHashMap>();
            try {
                slides = objectMapper.readValue(found.getSlides(), slides.getClass());
            } catch (JsonProcessingException e) {
                LOG.error("While parsing {} => {}", found.getSlides(), e);
            }

            /**
             * slides
             */
            List<LinkedHashMap> resources = new ArrayList<LinkedHashMap>();
            try {
                resources = objectMapper.readValue(found.getResources(), resources.getClass());
            } catch (JsonProcessingException e) {
                LOG.error("While parsing {} => {}", found.getResources(), e);
            }

            /**
             * transform slides
             */
            for (LinkedHashMap slide : slides) {
                StringBuilder sb = new StringBuilder();
                for (LinkedHashMap part : (List<LinkedHashMap>) slide.get("contents")) {
                    String renderer = (String) part.get("renderer");
                    String content = (String) part.get("content");
                    if (content == null) {
                        content = "";
                    }

                    /**
                     * markdown
                     */
                    if (renderer != null && renderer.compareTo("markdown") == 0) {
                        String markdown = markdownService.render(content);
                        sb.append(markdown);
                    } else {
                        /**
                         * resource
                         */
                        if (renderer != null && renderer.compareTo("resource") == 0) {
                            boolean resourceFound = false;
                            String res = (String) content;
                            for (LinkedHashMap resource : resources) {
                                if (res.compareTo((String) resource.get("name")) == 0) {
                                    sb.append(resource.get("content"));
                                    resourceFound = true;
                                }
                            }
                            if (!resourceFound) {
                                sb.append("No such entity: [" + (String) content + "]");
                            }
                        } else {
                            /**
                             * text
                             */
                            if (renderer != null && renderer.compareTo("text") == 0) {
                                Optional<TextJpa> entity = textRepository.findById((String) content);
                                if (entity.isPresent()) {
                                    sb.append(entity.get().getContent());
                                } else {
                                    sb.append("No such entity: [" + (String) content + "]");
                                }
                            } else {
                                // render as is
                                sb.append(content);
                            }
                        }
                    }
                }
                slide.put("content", sb.toString());
            }
            model.addAttribute("slides", slides);
            return "impress";
        }
        return "not-found";
    }
}
