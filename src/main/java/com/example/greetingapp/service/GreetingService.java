package com.example.greetingapp.service;

import com.example.greetingapp.model.GreetingModel;
import com.example.greetingapp.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingModel saveGreeting(String firstName, String lastName) {

        String message;

        if (firstName != null && lastName != null) {
            message = "Hello " + firstName + " " + lastName;
        } 
        else if (firstName != null) {
            message = "Hello " + firstName;
        } 
        else if (lastName != null) {
            message = "Hello " + lastName;
        } 
        else {
            message = "Hello World";
        }

        GreetingModel greeting = new GreetingModel(message);

        return greetingRepository.save(greeting);
    }
}