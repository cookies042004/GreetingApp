package com.example.greetingapp.controller;

import java.util.List;

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

    @GetMapping("/all")
    public List<GreetingModel> getAllGreetings() {
        return greetingService.getAllGreetings();
    }
}