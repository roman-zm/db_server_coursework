package com.namor.kurs.domain.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "purchase")
@Entity
data class Purchase(
    @Id val user: String,
    val film: Int
)

