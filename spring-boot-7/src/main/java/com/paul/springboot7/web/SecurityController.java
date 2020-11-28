package com.paul.springboot7.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/hello")
    public String hello(){
        return "hello spring security.";
    }
}
