package com.namor.kurs.service.repository;

import com.namor.kurs.domain.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource(rel = "content")
public interface GenreRepository extends JpaRepository<Genre, Integer> {
    @Query(value = "SELECT * FROM genre AS g WHERE g.id in (SELECT fg.genre FROM filmgenre AS fg WHERE fg.film = :film )",
    nativeQuery = true)
    List<Genre> getAllByFilm(@Param("film") int film);
}