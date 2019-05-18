package com.namor.kurs

import com.namor.kurs.domain.entity.*
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer

@Configuration
class ExposeEntityIdRestConfiguration : RepositoryRestConfigurer {

    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration) {
        config.exposeIdsFor(
                User::class.java,
                Film::class.java,
                Administrator::class.java,
                Genre::class.java,
                Purchase::class.java,
                Rating::class.java,
                Comment::class.java
        )
    }
}
