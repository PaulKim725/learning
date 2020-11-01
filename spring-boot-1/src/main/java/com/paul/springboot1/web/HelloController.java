package com.paul.springboot1.web;

import com.paul.springboot1.config.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @Autowired
    private Person person;

    @GetMapping(value = "/hello")
    public String hello(){
        System.out.println(person.getName());
        System.out.println(person.getAge());
        return "Hello World";
    }
}
