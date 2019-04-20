package com.namor.kurs.domain.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "administrator")
@Entity
data class Administrator(
        @Id
        @Column(name = "login")
        val login: String,
        val fio: String,
        val sex: String
)
