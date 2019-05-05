package com.namor.kurs.service.repository

import org.springframework.data.jpa.repository.JpaRepository
import com.namor.kurs.domain.entity.FilmGenre
import org.springframework.data.repository.query.Param
import org.springframework.transaction.annotation.Transactional

interface FilmGenreRepository : JpaRepository<FilmGenre, Int> {
    fun findAllByFilm(@Param("film") film: Int): List<FilmGenre>

    @Transactional
    fun deleteAllByFilm(@Param(value = "film") film: Int)
//    fun findAllByIdFilm(@Param("film") film: Int): List<FilmGenre>
//    fun findAllByFimGenre_Film(@Param("film") film: Int): List<FilmGenre>

//    @Query(value = "SELECT genre FROM public.filmgenre WHERE film = :film" )
//    @Query("SELECT genre FROM FilmGenre WHERE film = :film", nativeQuery = true)
//    fun getAllGenresByFilm(@Param("film") film: Int): Set<Int>
}