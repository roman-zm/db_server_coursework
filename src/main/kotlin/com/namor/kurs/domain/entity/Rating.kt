package com.namor.kurs.domain.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "rating")
@Entity
data class Rating(
    @Id val user: String,
    val film: Int,
    val mark: Int
)