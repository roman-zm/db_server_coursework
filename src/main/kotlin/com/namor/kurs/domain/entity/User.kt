package com.namor.kurs.domain.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "\"user\"")
@Entity
data class User(
    @Id
    @Column(name = "login")
    val login: String,
    val fio: String,
    val sex: Char,
    val email: String
)