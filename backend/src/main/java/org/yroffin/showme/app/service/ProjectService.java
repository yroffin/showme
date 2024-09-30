package org.yroffin.showme.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yroffin.showme.app.model.HeadRest;
import org.yroffin.showme.app.model.MetaRest;
import org.yroffin.showme.app.model.ProjectRest;
import org.yroffin.showme.app.model.SlideRest;
import org.yroffin.showme.app.repository.ProjectRepository;
import org.yroffin.showme.app.repository.jpa.ProjectJpa;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ProjectService {
    protected static final Logger LOG = LoggerFactory.getLogger(ProjectService.class);

    @Autowired
    ProjectRepository projectRepository;

    ObjectMapper objectMapper = new ObjectMapper();

    public ProjectRest findById(String name) {
        Optional<ProjectJpa> p = projectRepository.findById(name);
        if (p.isPresent()) {
            ProjectJpa found = p.get();
            ProjectRest result = new ProjectRest(name);
            return result;
        }
        return null;
    }

    public ProjectRest create(String name, ProjectRest body) {
        ProjectJpa found = null;
        Optional<ProjectJpa> p = projectRepository.findById(name);
        if (!p.isPresent()) {
            found = new ProjectJpa();
        } else {
            found = p.get();
        }
        found = projectRepository.save(this.mapRestToJpa(body, found));
        return this.mapJpaToRest(name, found);
    }

    public List<ProjectRest> findAll() {
        List<ProjectRest> list = new ArrayList<ProjectRest>();
        for (ProjectJpa found : projectRepository.findAll()) {
            ProjectRest result = new ProjectRest(found.getName());
            result.setName(found.getName());
            list.add(result);
        }
        return list;
    }

    private ProjectJpa mapRestToJpa(ProjectRest body, ProjectJpa found) {
        found.setName(body.getName());
        try {
            found.setMeta(objectMapper.writeValueAsString(body.getMeta()));
        } catch (JsonProcessingException e) {
            LOG.error("While parsing {} => {}", body, e);
        }
        try {
            found.setHead(objectMapper.writeValueAsString(body.getHead()));
        } catch (JsonProcessingException e) {
            LOG.error("While parsing {} => {}", body, e);
        }
        try {
            found.setSlides(objectMapper.writeValueAsString(body.getSlides()));
        } catch (JsonProcessingException e) {
            LOG.error("While parsing {} => {}", body, e);
        }
        return found;
    }

    @SuppressWarnings("unchecked")
    private ProjectRest mapJpaToRest(String name, ProjectJpa found) {
        ProjectRest result = new ProjectRest(name);
        /**
         * fix head field
         */
        HeadRest head = null;
        try {
            head = objectMapper.readValue(found.getHead(), HeadRest.class);
        } catch (JsonProcessingException e) {
            LOG.error("While parsing {} => {}", result.getSlides(), e);
        }
        if (head != null) {
            result.setHead(head);
        }
        /**
         * fix meta field
         */
        MetaRest meta = null;
        try {
            meta = objectMapper.readValue(found.getMeta(), MetaRest.class);
        } catch (JsonProcessingException e) {
            LOG.error("While parsing {} => {}", result.getMeta(), e);
        }
        if (meta != null) {
            result.setMeta(meta);
        }
        /**
         * fix slide field
         */
        List<SlideRest> slides = new ArrayList<SlideRest>();
        try {
            slides = objectMapper.readValue(found.getSlides(), slides.getClass());
        } catch (JsonProcessingException e) {
            LOG.error("While parsing {} => {}", result.getSlides(), e);
        }
        result.setSlides(slides);
        return result;
    }
}
