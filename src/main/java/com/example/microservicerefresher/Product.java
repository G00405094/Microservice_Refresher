package com.example.microservicerefresher;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Positive
    private long id;
    @NotBlank
    private String name;
    @Positive
    private double price;
}
