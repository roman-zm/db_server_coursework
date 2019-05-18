package com.namor.kurs.domain.entity

import java.io.Serializable
import javax.persistence.*

@Table(name = "rating")
@Entity
@IdClass(RatingId::class)
data class Rating(
        @Column(name = "\"user\"")
        @Id val user: String,
        @Id val film: Int,
        val mark: Int
)


data class RatingId(
        @Column(name = "\"user\"")
        val user: String = "",
        val film: Int = 0
): Serializable