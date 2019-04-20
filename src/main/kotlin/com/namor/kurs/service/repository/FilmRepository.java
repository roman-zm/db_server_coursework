package com.namor.kurs.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.namor.kurs.domain.entity.Film;

public interface FilmRepository extends JpaRepository<Film, Integer> {

}