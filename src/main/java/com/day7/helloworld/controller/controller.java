package com.day7.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class controller {
    
    @GetMapping("/hello")
    public String hello() {
        return "hello world!";
    }
    
}
