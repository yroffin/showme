package org.yroffin.showme.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import org.yroffin.showme.app.repository.jpa.Project;

public interface ProjectRepository extends CrudRepository<Project, String> {
    Optional<Project> findById(@NonNull String name);
}
