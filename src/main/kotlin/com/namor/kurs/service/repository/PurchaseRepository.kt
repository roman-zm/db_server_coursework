package com.namor.kurs.service.repository

import com.namor.kurs.domain.entity.Purchase
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param

interface PurchaseRepository : JpaRepository<Purchase, Int> {
    fun getByFilmAndUser(
            @Param(value = "film") film: Int,
            @Param(value = "user") user: String
    ): Purchase
}