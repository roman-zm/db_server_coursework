package com.namor.kurs.domain.entity

import java.io.Serializable
import javax.persistence.*

@Table(name = "filmgenre")
@Entity
//@IdClass(FilmGenreId::class)
data class FilmGenre(
        @Id val id: Int,
        val genre: Int,
        val film: Int
)

@Embeddable
data class FilmGenreId(
        @Column(name = "genre") val genre: Int,
        @Column(name = "film") val film: Int
): Serializable