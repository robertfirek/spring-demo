package com.example.spring_advanced.services;

import org.springframework.stereotype.Component;

@Component(value = "advanced")
public class AdvancedMessageService implements MessageService{

    public String getMessage() {
        return "Advanced Spring service message";
    }
}
