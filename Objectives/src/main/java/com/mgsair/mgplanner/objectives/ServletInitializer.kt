package com.mgsair.mgplanner.objectives

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.boot.builder.SpringApplicationBuilder
import com.mgsair.mgplanner.objectives.ObjectivesApplication

class ServletInitializer : SpringBootServletInitializer() {

    override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
        return application.sources(ObjectivesApplication::class.java)
    }

}