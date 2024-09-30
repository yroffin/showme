package org.yroffin.showme.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.yroffin.showme.app.model.HeadRest;
import org.yroffin.showme.app.model.MetaRest;
import org.yroffin.showme.app.model.SlideRest;
import org.yroffin.showme.app.repository.ProjectRepository;
import org.yroffin.showme.app.repository.jpa.ProjectJpa;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class GenerateService {
    protected static final Logger LOG = LoggerFactory.getLogger(GenerateService.class);

    @Autowired
    ProjectRepository projectRepository;

    ObjectMapper objectMapper = new ObjectMapper();

    @SuppressWarnings("unchecked")
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
            List<SlideRest> slides = new ArrayList<SlideRest>();
            try {
                slides = objectMapper.readValue(found.getSlides(), slides.getClass());
            } catch (JsonProcessingException e) {
                LOG.error("While parsing {} => {}", found.getSlides(), e);
            }

            model.addAttribute("slides", slides);
            return "impress";
        }
        return "not-found";
    }
}
