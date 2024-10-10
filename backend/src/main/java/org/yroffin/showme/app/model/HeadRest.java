package org.yroffin.showme.app.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Jacksonized
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HeadRest {
    private String title;
    private String description;
    private String author;
    private List<StyleSheetRest> stylesheets;
    private List<ScriptRest> scripts;
}
