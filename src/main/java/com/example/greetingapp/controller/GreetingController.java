package com.example.greetingapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    // Get Method
    @GetMapping
    public Map<String, String> getGreeting(){
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello from GET Method");
        return response;
    }

    // Post Method
    @PostMapping
    public Map<String, String> postGreeting(@RequestBody Map<String, String> body){
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello " + body.get("name") + " from POST Method");
        return response;
    }

    // PUT Method
    @PutMapping("/{name}")
    public Map<String, String> putGreeting(@PathVariable String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello " + name + " from PUT method");
        return response;
    }

    // DELETE Method
    @DeleteMapping("/{name}")
    public Map<String, String> deleteGreeting(@PathVariable String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", name + " deleted successfully");
        return response;
    }
}
