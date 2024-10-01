package org.yroffin.showme.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import org.yroffin.showme.app.repository.jpa.TextJpa;

public interface TextRepository extends CrudRepository<TextJpa, String> {
    @SuppressWarnings("null")
    Optional<TextJpa> findById(@NonNull String name);
}
