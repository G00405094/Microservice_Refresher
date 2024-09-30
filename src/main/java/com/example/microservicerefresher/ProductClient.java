package com.example.microservicerefresher;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "external-service", url = "http://localhost:8081")
public interface ProductClient {

}
