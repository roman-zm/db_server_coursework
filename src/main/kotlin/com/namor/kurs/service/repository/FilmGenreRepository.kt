package com.namor.kurs.service.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import com.namor.kurs.domain.entity.FilmGenre
import com.namor.kurs.domain.entity.FilmGenreId
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

interface FilmGenreRepository : JpaRepository<FilmGenre, Int> {
    fun findAllByFilm(@Param("film") film: Int): List<FilmGenre>
//    fun findAllByIdFilm(@Param("film") film: Int): List<FilmGenre>
//    fun findAllByFimGenre_Film(@Param("film") film: Int): List<FilmGenre>

//    @Query(value = "SELECT genre FROM public.filmgenre WHERE film = :film" )
//    @Query("SELECT genre FROM FilmGenre WHERE film = :film", nativeQuery = true)
//    fun getAllGenresByFilm(@Param("film") film: Int): Set<Int>
}