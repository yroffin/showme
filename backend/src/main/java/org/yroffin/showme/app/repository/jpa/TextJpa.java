package org.yroffin.showme.app.repository.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "TEXT")
@Data
public class TextJpa {
    @Id
    private String name;
    private String content;
}
