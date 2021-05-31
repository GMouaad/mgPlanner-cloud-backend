package com.mgsair.mgplanner.habits.persistence

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository
import com.mgsair.mgplanner.habits.models.Habit

//@RepositoryRestResource(collectionResourceRel = "habits", path = "api/habits")  // remove spring-boot-starter-data-rest if the end-points are not needed
interface HabitsRepository : DatastoreRepository<Habit, Long> {

}