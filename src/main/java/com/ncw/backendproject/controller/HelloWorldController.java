package com.ncw.backendproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("hello")
    public String helloWorld() {
        return "Ni Hao!";
    }
}
