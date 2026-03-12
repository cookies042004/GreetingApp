package com.example.greetingapp.service;

import java.util.Optional;

import com.example.greetingapp.model.GreetingModel;
import com.example.greetingapp.repository.GreetingRepository;

import org.springframework.stereotype.Service;


@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingModel updateGreeting(Long id, String message){
        Optional<GreetingModel> optionalGreeting = greetingRepository.findById(id);
        
        if(optionalGreeting.isPresent()){
            GreetingModel greeting = optionalGreeting.get();
            greeting.setMessage(message);
            return greetingRepository.save(greeting);
        } else {
            throw new RuntimeException("Greeting not found with id: " + id);
        }
    }
}