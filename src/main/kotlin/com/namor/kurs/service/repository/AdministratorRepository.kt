package com.namor.kurs.service.repository

import com.namor.kurs.domain.entity.Administrator
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

interface AdministratorRepository
    : JpaRepository<Administrator, String> {

    override fun findAll(): List<Administrator>
//    fun findAllByLogin(@Param("login") login: String): List<Administrator>
}