package com.example.greetingapp.service;

import java.util.List;

import com.example.greetingapp.model.GreetingModel;
import com.example.greetingapp.repository.GreetingRepository;

import org.springframework.stereotype.Service;


@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public List<GreetingModel> getAllGreetings() {
        return greetingRepository.findAll();
    }
}