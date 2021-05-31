package com.mgsair.mgplanner.todos.persistence

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository
import com.mgsair.mgplanner.todos.models.TodoTask

//@RepositoryRestResource(collectionResourceRel = "todos", path = "api/todos")  // remove spring-boot-starter-data-rest if the end-points are not needed
interface TodosRepository : DatastoreRepository<TodoTask, Long> {

}