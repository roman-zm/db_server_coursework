package com.namor.kurs.domain.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "filmgenre")
@Entity
data class FilmGenre(
        @Id val id: Int,
        val genre: Int,
        val film: Int
)

