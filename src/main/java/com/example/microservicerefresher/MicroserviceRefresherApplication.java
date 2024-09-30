package com.example.microservicerefresher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class MicroserviceRefresherApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceRefresherApplication.class, args);
    }

}
