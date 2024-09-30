package org.yroffin.showme.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yroffin.showme.app.model.StyleSheetRest;
import org.yroffin.showme.app.service.StaticService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/static")
public class StaticController {
    protected static final Logger LOG = LoggerFactory.getLogger(StaticController.class);

    @Autowired
    StaticService staticService;

    @GetMapping("/css/{name}")
    public String upsert(@PathVariable(value = "name") String name,
            HttpServletResponse response) {
        StyleSheetRest found = staticService.findStyleSheetById(name);

        if (found == null) {
            response.setStatus(404);
            return "";
        }

        /*
         * Write the response headers
         */
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);

        return found.getContent();
    }

    @PostMapping("/css/{name}")
    public String upsert(@PathVariable(value = "name") String name, @RequestBody String content,
            HttpServletResponse response) {
        StyleSheetRest found = staticService.updateStyleSheetById(name, content);

        if (found == null) {
            response.setStatus(500);
            return "";
        }

        /*
         * Write the response headers
         */
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);

        return found.getContent();
    }
}
