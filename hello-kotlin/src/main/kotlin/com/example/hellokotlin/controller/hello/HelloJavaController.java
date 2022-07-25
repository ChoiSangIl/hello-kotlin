package com.example.hellokotlin.controller.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJavaController {
    @GetMapping("hello/java")
    private String helloJava(){
        return "hello java";
    }
}
