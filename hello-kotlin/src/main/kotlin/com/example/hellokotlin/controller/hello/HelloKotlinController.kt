package com.example.hellokotlin.controller.hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloKotlinController {
    @GetMapping("/hello/kotlin")
    fun hello():String{
        return "hello kotlin"
    }
}