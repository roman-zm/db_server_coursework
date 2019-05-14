package com.namor.kurs.domain.entity

import javax.persistence.*

@Table(name = "purchase")
@Entity
data class Purchase(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    @Column(name = "\"user\"")
    val user: String,
    val film: Int
)

