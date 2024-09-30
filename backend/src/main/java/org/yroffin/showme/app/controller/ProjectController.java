package org.yroffin.showme.app.controller;

import java.io.IOException;
import java.util.List;

import org.jline.utils.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yroffin.showme.app.model.ProjectRest;
import org.yroffin.showme.app.service.ProjectService;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping("/{name}")
    public ProjectRest findById(@PathVariable(value = "name") String name, HttpServletResponse res) {
        ProjectRest result = projectService.findById(name);
        if (result == null) {
            res.setStatus(404);
        }
        return result;
    }

    @PostMapping("")
    public ProjectRest create(@RequestBody ProjectRest body,
            HttpServletResponse res) {
        ProjectRest created = projectService.create(body.getName(), body);
        return created;
    }

    @PostMapping(value = "", consumes = { "text/yaml", "application/yaml",
            "application/yml" })
    @ResponseBody
    public ProjectRest createWithYaml(@RequestBody Resource resource,
            HttpServletResponse res) {
        ProjectRest body = null;
        try {
            final var inputStream = resource.getInputStream();
            body = new ObjectMapper(new YAMLFactory())
                    .readValue(inputStream, ProjectRest.class);
        } catch (IOException e) {
            Log.warn("While parsing yaml {}", e.getMessage());
        }
        if (body != null) {
            return projectService.create(body.getName(), body);
        }
        return null;
    }

    @GetMapping(value = "")
    public List<ProjectRest> findAll() {
        List<ProjectRest> list = projectService.findAll();
        return list;
    }
}
