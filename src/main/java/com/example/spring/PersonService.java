package com.example.spring;

import org.springframework.stereotype.Component;

@Component
public class PersonService {
    private String name;

    public PersonService(String name) {
        this.name = name;
    }

    public String name() {
        return this.name;
    }
}
