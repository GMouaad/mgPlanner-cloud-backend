package com.mgsair.mgplanner.objectives.persistence

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository
import com.mgsair.mgplanner.objectives.models.Objective

//@RepositoryRestResource(collectionResourceRel = "objectives", path = "api/objectives") // remove spring-boot-starter-data-rest if the end-points are not needed
interface ObjectivesRepository : DatastoreRepository<Objective, Long>{

}