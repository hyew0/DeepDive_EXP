package com.example.di.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceA {

    private final ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public void printGetMessage() {
        System.out.println(serviceB.getMessage());
    }
}
