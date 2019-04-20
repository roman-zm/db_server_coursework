package com.namor.kurs.domain.entity

import javax.persistence.*

@Entity
@Table(name = "comment")
data class Comment (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val user: String,
    val film: Int,
    val text: String,
    val date: String = "now()"
)
