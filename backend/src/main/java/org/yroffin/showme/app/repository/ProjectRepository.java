package org.yroffin.showme.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import org.yroffin.showme.app.repository.jpa.ProjectJpa;

public interface ProjectRepository extends CrudRepository<ProjectJpa, String> {
    @SuppressWarnings("null")
    Optional<ProjectJpa> findById(@NonNull String name);
}
