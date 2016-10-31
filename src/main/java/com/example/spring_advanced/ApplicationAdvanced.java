package com.example.spring_advanced;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.spring_advanced"})
public class ApplicationAdvanced {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationAdvanced.class);
        MessagePrinter printer = applicationContext.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
