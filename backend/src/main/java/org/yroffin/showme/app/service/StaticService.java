package org.yroffin.showme.app.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yroffin.showme.app.model.StyleSheetRest;
import org.yroffin.showme.app.repository.StyleSheetRepository;
import org.yroffin.showme.app.repository.jpa.StyleSheetJpa;

@Service
public class StaticService {
    protected static final Logger LOG = LoggerFactory.getLogger(StaticService.class);

    @Autowired
    StyleSheetRepository styleSheetRepository;

    public StyleSheetRest findStyleSheetById(String name) {
        Optional<StyleSheetJpa> p = styleSheetRepository.findById(name);
        if (p.isPresent()) {
            StyleSheetJpa found = p.get();
            StyleSheetRest sheet = new StyleSheetRest();
            sheet.setHref(name);
            sheet.setContent(found.getContent());
        }
        return null;
    }

    public StyleSheetRest updateStyleSheetById(String name, String content) {
        StyleSheetJpa toupdate = null;
        Optional<StyleSheetJpa> p = styleSheetRepository.findById(name);
        if (p.isPresent()) {
            toupdate = p.get();
            toupdate.setContent(content);
            toupdate = styleSheetRepository.save(toupdate);
        } else {
            StyleSheetJpa tosaved = new StyleSheetJpa();
            tosaved.setName(name);
            tosaved.setContent(content);
            toupdate = styleSheetRepository.save(tosaved);
        }
        return null;// new StyleSheetRest(name, toupdate.getContent());
    }
}
