package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {
    @GetMapping("/world")
    public String home() {
        return "Привет, мир !";
    }
}
