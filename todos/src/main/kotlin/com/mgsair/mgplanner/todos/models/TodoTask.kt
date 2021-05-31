package com.mgsair.mgplanner.todos.models

import com.google.cloud.spring.data.datastore.core.mapping.Entity
import com.google.cloud.spring.data.datastore.core.mapping.Field
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import java.util.*

@Entity
data class TodoTask(
    @Id
    @Field(name = "todotask_id")
    var id: Long?,
    var title: String = "",
    var category: String = "",
    var isDone: Boolean? = false,
    var priority: Int,
    @CreatedDate
    var creationDate: Date?
)