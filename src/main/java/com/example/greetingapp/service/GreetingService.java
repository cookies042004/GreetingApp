package com.example.greetingapp.service;

import com.example.greetingapp.model.GreetingModel;
import com.example.greetingapp.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingModel findGreetingById(Long id){
        Optional<GreetingModel> greeting = greetingRepository.findById(id);
        
        if(greeting.isPresent()){
            return greeting.get();
        } else {
            throw new RuntimeException("Greeting not found with id: " + id);
        }
    }
}