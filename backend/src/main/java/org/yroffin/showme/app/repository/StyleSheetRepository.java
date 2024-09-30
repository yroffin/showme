package org.yroffin.showme.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import org.yroffin.showme.app.repository.jpa.StyleSheetJpa;

public interface StyleSheetRepository extends CrudRepository<StyleSheetJpa, String> {
    @SuppressWarnings("null")
    Optional<StyleSheetJpa> findById(@NonNull String name);
}
