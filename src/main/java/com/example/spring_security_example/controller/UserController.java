package com.example.spring_security_example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/index")
    public String index() {
        return "Index Page , Hello World!";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return  "Dashboard Page , Hello User!";
    }
}
