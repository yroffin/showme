package org.yroffin.showme.app.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yroffin.showme.app.model.TextRest;
import org.yroffin.showme.app.repository.TextRepository;
import org.yroffin.showme.app.repository.jpa.TextJpa;

@Service
public class StaticService {
    protected static final Logger LOG = LoggerFactory.getLogger(StaticService.class);

    @Autowired
    TextRepository textRepository;

    public Optional<TextRest> findTextById(String name) {
        Optional<TextJpa> p = textRepository.findById(name);
        if (p.isPresent()) {
            TextJpa found = p.get();
            TextRest text = new TextRest();
            text.setName(name);
            text.setContent(found.getContent());
            return Optional.of(text);
        }
        return Optional.of(null);
    }

    public Optional<TextRest> updateTextById(String name, String content) {
        TextRest output = new TextRest();
        Optional<TextJpa> entity = textRepository.findById(name);
        if (entity.isPresent()) {
            TextJpa result = entity.get();
            result.setContent(content);
            result = textRepository.save(result);
            output.setName(name);
            output.setContent(result.getContent());
            return Optional.of(output);
        } else {
            TextJpa result = new TextJpa();
            result.setName(name);
            result.setContent(content);
            result = textRepository.save(result);
            output.setName(name);
            output.setContent(result.getContent());
            return Optional.of(output);
        }
    }
}
