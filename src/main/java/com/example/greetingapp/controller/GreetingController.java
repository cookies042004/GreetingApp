package com.example.greetingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.greetingapp.service.GreetingService;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    // Constructor Injection is used to inject the GreetingService dependency but also can be done using @Autowired annotation on the field or setter method.
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting")
    public String getGreeting(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName) {
        return greetingService.getGreetingMessage(firstName, lastName);
    }
}