package com.example.spring_advanced;

import com.example.spring_advanced.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    private final MessageService service;

    @Autowired
    public MessagePrinter(@Qualifier("advanced") MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
