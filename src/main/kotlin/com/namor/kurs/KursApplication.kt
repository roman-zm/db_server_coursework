package com.namor.kurs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KursApplication

fun main(args: Array<String>) {
    runApplication<KursApplication>(*args)
}
