package com.namor.kurs.service.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.rest.core.annotation.RestResource
import com.namor.kurs.domain.entity.Comment

@RestResource(rel = "content")
interface CommentRepository : JpaRepository<Comment, Int> {
    fun getAllByFilmOrderByDate(film: Int): List<Comment>
}