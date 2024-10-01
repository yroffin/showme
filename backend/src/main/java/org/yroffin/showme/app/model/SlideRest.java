package org.yroffin.showme.app.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.extern.jackson.Jacksonized;

@Data
@Jacksonized
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlideRest {
    private @NonNull String id;
    @JsonProperty("class")
    private String klass;
    @JsonProperty("data-x")
    private String dataX;
    @JsonProperty("data-y")
    private String dataY;
    @JsonProperty("data-z")
    private String dataZ;
    @JsonProperty("data-autoplay")
    private String dataAutoplay;
    @JsonProperty("data-scale")
    private String dataScale;
    @JsonProperty("data-rotate")
    private String dataRotate;
    @JsonProperty("data-rotate-x")
    private String dataRotateX;
    @JsonProperty("data-rotate-y")
    private String dataRotateY;
    @JsonProperty("data-rotate-z")
    private String dataRotateZ;
    private String renderer;
    private String content;
}
