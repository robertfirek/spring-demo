package com.example.spring;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

    public String getMessage() {
        return "Spring service message";
    }
}
