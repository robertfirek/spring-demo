package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    private final MessageService service;
    private final PersonService personService;

    @Autowired
    public MessagePrinter(MessageService service, PersonService personService) {
        this.service = service;
        this.personService = personService;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage() + " " + personService.name() );
    }
}
