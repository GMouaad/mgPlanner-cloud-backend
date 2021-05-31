package com.mgsair.mgplanner.todos.controllers

import com.mgsair.mgplanner.todos.models.TodoTask
import com.mgsair.mgplanner.todos.persistence.TodosRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate
import java.time.Instant
import java.util.*

@RestController
@RequestMapping("/api/todos")
class TodosController(
    val applicationContext: ApplicationContext,
    val todosRepository: TodosRepository
) {

    private val gs_prefix = ""

    @Autowired
    private lateinit var restTemplate: RestTemplate

    @GetMapping("/")
    fun getAllTodos() {
        todosRepository.findAll()
    }

    @GetMapping("/{id}")
    fun getTodoTask(@PathVariable id: Long): ResponseEntity<TodoTask> {
        val todoTask = todosRepository.findById(id).get()
        return ResponseEntity.ok(todoTask)
    }

    @PostMapping("/create")
    fun createTodoTask(@RequestBody todoTask: TodoTask): ResponseEntity<TodoTask> {
        if (todoTask.id == null) {
            todoTask.id = Instant.now().nano.toLong()
        }
        todoTask.creationDate = Calendar.getInstance().time
        todosRepository.save(todoTask)
        return ResponseEntity.ok(todoTask)
    }

    @DeleteMapping("/{id}")
    fun deleteTodoTask(@PathVariable id: Long) {
        todosRepository.deleteById(id)
    }

}
