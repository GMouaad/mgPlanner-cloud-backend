package com.mgsair.mgplanner.objectives.controllers

import com.mgsair.mgplanner.objectives.models.Objective
import com.mgsair.mgplanner.objectives.persistence.ObjectivesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate
import java.time.Instant
import java.util.*

@RestController
@RequestMapping("/api/objectives")
class ObjectivesController(
    val applicationContext: ApplicationContext,
    val objectivesRepository: ObjectivesRepository
) {

    private val gs_prefix = ""

    @Autowired
    private lateinit var restTemplate: RestTemplate

    @GetMapping("/")
    fun getAllObjectives() {
        objectivesRepository.findAll()
    }

    @GetMapping("/{id}")
    fun getObjective(@PathVariable id: Long): ResponseEntity<Objective> {
        val objective = objectivesRepository.findById(id).get()
        return ResponseEntity.ok(objective)
    }

    @PostMapping("/create")
    fun createObjective(@RequestBody objective: Objective) : ResponseEntity<Objective>  {

        if (objective.id == null) {
            objective.id = Instant.now().nano.toLong()
        }
        objective.creationDate = Calendar.getInstance().time
        objectivesRepository.save(objective)
        return ResponseEntity.ok(objective)
    }

    @DeleteMapping("/{id}")
    fun deleteObjective(@PathVariable id: Long) {
        objectivesRepository.deleteById(id)
    }

}