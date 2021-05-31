package com.mgsair.mgplanner.objectives

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
open class ObjectivesApplication {

    @Bean
    open fun getRestTemplate(): RestTemplate {
        return RestTemplate()
    }


    fun main(args: Array<String>) {
        runApplication<ObjectivesApplication>(*args)
    }

}