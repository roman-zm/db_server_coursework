package com.namor.kurs.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.namor.kurs.domain.entity.Film;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource(rel = "content")
public interface FilmRepository extends JpaRepository<Film, Integer> {

}