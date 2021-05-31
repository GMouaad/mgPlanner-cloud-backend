package com.mgsair.mgplanner.habits

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class HabitsApplication {

    @Bean
    fun getRestTemplate() : RestTemplate {
        return RestTemplate()
    }

    fun main(args: Array<String>) {
        runApplication<HabitsApplication>(*args)
    }
}


