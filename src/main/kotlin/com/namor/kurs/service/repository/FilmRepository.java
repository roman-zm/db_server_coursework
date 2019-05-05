package com.namor.kurs.service.repository;

import com.namor.kurs.domain.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(rel = "content")
public interface FilmRepository extends JpaRepository<Film, Integer> {

}