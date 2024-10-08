package com.example.microservicerefresher;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "external-service", url = "http://localhost:8081")
public interface ProductClient {
    @PostMapping("/confirm")
    String someDetails(@RequestBody Product product);
}
