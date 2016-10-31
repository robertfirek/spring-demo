package com.example.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.spring"})
public class ApplicationSpring {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationSpring.class);
        MessagePrinter printer = applicationContext.getBean(MessagePrinter.class);
        printer.printMessage();
    }

    @Bean
    public PersonService personService(){
        return new PersonService("Firek");
    }
}
