package org.yroffin.showme.app.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Jacksonized
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetaRest {
    @JsonProperty("transition-duration")
    private String transitionDuration;
    @JsonProperty("width")
    private String width;
    @JsonProperty("height")
    private String height;
    @JsonProperty("max-scale")
    private String maxScale;
    @JsonProperty("min-scale")
    private String minScale;
    @JsonProperty("perspective")
    private String perspective;
    @JsonProperty("autoplay")
    private String autoplay;
}
