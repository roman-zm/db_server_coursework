package com.namor.kurs

import com.namor.kurs.domain.entity.Administrator
import com.namor.kurs.domain.entity.Film
import com.namor.kurs.domain.entity.Genre
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer

@Configuration
class ExposeEntityIdRestConfiguration : RepositoryRestConfigurer {

    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration) {
        config.exposeIdsFor(
                Film::class.java,
                Administrator::class.java,
                Genre::class.java
        )
    }
}
