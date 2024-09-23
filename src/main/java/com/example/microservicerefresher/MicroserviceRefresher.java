package com.example.microservicerefresher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceRefresher {

    @GetMapping("/hello")
    public String message()
    {
        return "Hello";
    }
}
