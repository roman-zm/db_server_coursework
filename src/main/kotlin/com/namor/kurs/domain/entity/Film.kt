package com.namor.kurs.domain.entity

import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType
import org.springframework.data.rest.core.annotation.RestResource
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "film")
data class Film(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,

        @Column(name = "login_admin")
        val loginAdmin: String,
        val name: String,
        val director: String,
        val year: Int,
        val actors: String,
        val price: Double = 0.0,
        val duration: String,
        @ManyToMany
        @Cascade(CascadeType.REFRESH)
        @JoinTable(
                name = "filmgenre",
                joinColumns = [ JoinColumn(name = "film") ],
                inverseJoinColumns = [ JoinColumn(name = "genre") ]
        )
        @RestResource(exported = false)
        val genres: Set<Genre>
) {
        override fun hashCode() = Objects.hash(
                id, loginAdmin, name, director, year, actors,
                price, duration
        )
}

