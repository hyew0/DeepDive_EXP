package com.example.hellorestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello-rest-api")
    public String hello() {
        return "Hello world";
    }
}
