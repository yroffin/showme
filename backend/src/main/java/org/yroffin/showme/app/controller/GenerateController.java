package org.yroffin.showme.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yroffin.showme.app.service.GenerateService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/api/generate")
public class GenerateController {
    protected static final Logger LOG = LoggerFactory.getLogger(GenerateController.class);

    @Autowired
    GenerateService generateService;

    @GetMapping("/{name}")
    public String render(@PathVariable(value = "name") String name, Model model, HttpServletResponse response) {
        String template = generateService.render(name, model);
        if (template == null) {
            response.setStatus(404);
        }

        /*
         * Write the response headers
         */
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);

        if (LOG.isDebugEnabled()) {
            LOG.debug("Render template {} => {}", template, model);
        }
        return template;
    }
}
