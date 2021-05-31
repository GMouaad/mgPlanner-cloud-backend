package com.mgsair.mgplanner.habits.models

import com.google.cloud.spring.data.datastore.core.mapping.Field
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import java.util.*

data class Habit (
    @Id
    @Field(name = "habit_id")
    var id: Long?,
    var title: String = "",
    var goal: Int,
    var objective_id: Long? = null,
    var frequency: String?,
    var achieved: Int?=0,
    @CreatedDate
    var creationDate: Date?,
    var achieved_on: Date? = null
)