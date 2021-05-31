package com.mgsair.mgplanner.todos

import com.google.cloud.spring.data.datastore.repository.config.EnableDatastoreRepositories
import org.springframework.context.annotation.Configuration
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
@EnableDatastoreRepositories("com.mgsair.mgplanner.todos.persistence")
class appConfiguration {
}