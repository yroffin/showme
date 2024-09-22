package org.yroffin.showme.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yroffin.showme.app.model.ProjectModel;
import org.yroffin.showme.app.service.ProjectService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping("/{name}")
    public ProjectModel findById(@PathVariable(value = "name") String name, HttpServletResponse res) {
        ProjectModel result = projectService.findById(name);
        if (result == null) {
            res.setStatus(404);
        }
        return result;
    }

    @PostMapping("/{name}")
    public ProjectModel create(@PathVariable(value = "name") String name, HttpServletResponse res) {
        ProjectModel created = projectService.create(name);
        return created;
    }

    @GetMapping("")
    public List<ProjectModel> findAll() {
        List<ProjectModel> list = projectService.findAll();
        return list;
    }
}
