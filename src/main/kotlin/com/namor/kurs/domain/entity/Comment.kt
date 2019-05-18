package com.namor.kurs.domain.entity

import org.springframework.data.rest.core.annotation.RestResource
import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "comment")
data class Comment (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @ManyToOne
    @JoinColumn(name = "\"user\"")
    @RestResource(exported = false)
//    @Column(name = "\"user\"")
    val user: User,

    val film: Int,
    val text: String,

    val date: Timestamp = Timestamp(System.currentTimeMillis())
)
