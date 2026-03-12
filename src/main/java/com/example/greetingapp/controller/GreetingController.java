package com.example.greetingapp.controller;


import com.example.greetingapp.model.GreetingModel;
import com.example.greetingapp.service.GreetingService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PutMapping("/{id}")
    public GreetingModel updateGreeting(@PathVariable Long id, @RequestBody String message) {
        return greetingService.updateGreeting(id, message);
    }
}