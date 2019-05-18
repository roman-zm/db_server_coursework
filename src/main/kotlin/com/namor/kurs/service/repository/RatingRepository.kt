package com.namor.kurs.service.repository

import com.namor.kurs.domain.entity.Rating
import com.namor.kurs.domain.entity.RatingId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface RatingRepository : JpaRepository<Rating, RatingId> {
    fun getByUserAndFilm(user: String, film: Int): Rating

    @Query("select avg(r.mark) from rating r where film = :film", nativeQuery = true)
    fun getAverageForFilm(@Param("film") film: Int): Float

    fun countAllByFilm(film: Int): Int
}

