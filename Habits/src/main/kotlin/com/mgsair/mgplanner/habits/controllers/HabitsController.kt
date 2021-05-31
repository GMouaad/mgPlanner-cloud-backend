package com.mgsair.mgplanner.habits.controllers

import com.mgsair.mgplanner.habits.models.Habit
import com.mgsair.mgplanner.habits.persistence.HabitsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate
import java.time.Instant
import java.util.*

@RestController
@RequestMapping("/api/habits")
class HabitsController(
    val applicationContext: ApplicationContext,
    val habitsRepository: HabitsRepository
) {

    private val gs_prefix = ""

    @Autowired
    private lateinit var restTemplate: RestTemplate

    @GetMapping("/")
    fun getAllHabits() {
        habitsRepository.findAll()
    }

    @GetMapping("/{id}")
    fun getHabit(@PathVariable id: Long): ResponseEntity<Habit> {
        val habit = habitsRepository.findById(id).get()
        return ResponseEntity.ok(habit)
    }

    @PostMapping("/create")
    fun createHabit(@RequestBody habit: Habit): ResponseEntity<Habit> {

        if (habit.id == null) {
            habit.id = Instant.now().nano.toLong()
        }
        habit.creationDate = Calendar.getInstance().time
        habitsRepository.save(habit)
        return ResponseEntity.ok(habit)
    }

    @DeleteMapping("/{id}")
    fun deleteHabit(@PathVariable id: Long) {
        habitsRepository.deleteById(id)
    }
}