package com.example.SpringDependencyInjectionExamples.controllers;

import com.example.SpringDependencyInjectionExamples.services.GreetingService;

public class SetterInjectedController
{
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
