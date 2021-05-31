package com.mgsair.mgplanner.objectives.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class RootController {

    @GetMapping("/")
    fun api() : ResponseEntity<String> {
        return ResponseEntity.ok("This is the api path")
    }
}