package com.example.greetingapp.service;

import com.example.greetingapp.repository.GreetingRepository;

import org.springframework.stereotype.Service;


@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String deleteGreeting(Long id) {

        if (greetingRepository.existsById(id)) {
            greetingRepository.deleteById(id);
            return "Greeting deleted successfully";
        } else {
            throw new RuntimeException("Greeting not found with id: " + id);
        }
    }
}