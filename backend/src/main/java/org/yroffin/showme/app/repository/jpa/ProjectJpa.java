package org.yroffin.showme.app.repository.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "PROJECT")
@Data
public class ProjectJpa {
    @Id
    private String name;
    private String head;
    private String meta;
    private String slides;
}
