package com.namor.kurs.domain.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "film")
data class Film(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,

        @Column(name = "login_admin")
        val loginAdmin: String,
        val director: String,
        val year: Int,
        val actors: String,
        val price: Double = 0.0,
        val duration: String
)

