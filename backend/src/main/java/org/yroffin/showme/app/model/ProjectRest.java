package org.yroffin.showme.app.model;

import java.util.List;

import lombok.Data;
import lombok.NonNull;

@Data
public class ProjectRest {
    public ProjectRest() {
    }

    public ProjectRest(String name) {
        this.name = name;
    }

    private @NonNull String name;

    private HeadRest head;
    private MetaRest meta;

    private List<SlideRest> slides;
    private List<TextRest> resources;
}
