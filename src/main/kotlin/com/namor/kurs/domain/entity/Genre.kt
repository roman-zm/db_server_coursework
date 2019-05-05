package com.namor.kurs.domain.entity

import java.util.*
import javax.persistence.*

@Table(name = "genre")
@Entity
data class Genre(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String,
    val description: String,
    @ManyToMany(mappedBy = "genres", fetch = FetchType.LAZY)
    val films: Set<Film>?
) {
    override fun hashCode() = Objects.hash(
            id, name, description
    )
}