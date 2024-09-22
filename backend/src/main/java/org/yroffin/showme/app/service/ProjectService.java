package org.yroffin.showme.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yroffin.showme.app.model.ProjectModel;
import org.yroffin.showme.app.repository.ProjectRepository;
import org.yroffin.showme.app.repository.jpa.Project;

@Service
public class ProjectService {
    private static final Logger LOG = LoggerFactory.getLogger(ProjectService.class);

    @Autowired
    ProjectRepository projectRepository;

    public ProjectModel findById(String name) {
        Optional<Project> p = projectRepository.findById(name);
        if (p.isPresent()) {
            LOG.info("Load by id {}", name);
            return new ProjectModel("name");
        }
        return null;
    }

    public ProjectModel create(String name) {
        Project tosaved = new Project();
        tosaved.setName(name);
        Project saved = projectRepository.save(tosaved);
        return new ProjectModel(saved.getName());
    }

    public List<ProjectModel> findAll() {
        List<ProjectModel> list = new ArrayList<ProjectModel>();
        for (Project entity : projectRepository.findAll()) {
            ProjectModel p = new ProjectModel(entity.getName());
            list.add(p);
        }
        return list;
    }
}
