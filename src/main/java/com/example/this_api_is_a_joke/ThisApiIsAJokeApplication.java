package com.example.this_api_is_a_joke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ThisApiIsAJokeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThisApiIsAJokeApplication.class, args);
    }

    @GetMapping
    public String hello(){
        return "Hello world";
    }
}
