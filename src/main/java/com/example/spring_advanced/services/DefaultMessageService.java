package com.example.spring_advanced.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component(value = "default")
public class DefaultMessageService implements MessageService {

    public String getMessage() {
        return "Default Spring service message";
    }
}
