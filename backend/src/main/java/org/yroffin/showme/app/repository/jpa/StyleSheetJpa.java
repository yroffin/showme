package org.yroffin.showme.app.repository.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "STYLE_SHEET")
@Data
public class StyleSheetJpa {
    @Id
    private String name;
    private String content;
}
