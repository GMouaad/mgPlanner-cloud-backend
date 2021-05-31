package com.mgsair.mgplanner.objectives.models

import com.google.cloud.spring.data.datastore.core.mapping.Field
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import java.util.*

data class Objective(
    @Id
    @Field(name = "objective_id")
    var id: Long?,
    var title: String = "",
    var goal: Int,
    var achieved: Int? = 0,
    var progress: Int? = 0,
    var isDone: Boolean? = false,
    @CreatedDate
    var creationDate: Date?,
    var achieved_on: Date? = null
)
