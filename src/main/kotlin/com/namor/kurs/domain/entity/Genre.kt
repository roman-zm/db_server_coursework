package com.namor.kurs.domain.entity

import javax.persistence.*

@Table(name = "genre")
@Entity
data class Genre(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String,
    val description: String
)