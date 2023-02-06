package com.example.SpringDependencyInjectionExamples.controllers;

import com.example.SpringDependencyInjectionExamples.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
