package com.example.microservicerefresher;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Product_Controller {

    private List<Product> productlist = new ArrayList<Product>();

    @GetMapping("/hello")
    public String message()
    {
        return "Hello";
    }
    @GetMapping("/hello/{name}")
    public String myName(@PathVariable String name)
    {
        return "Your Name is " + name;
    }

    @GetMapping("/search")
    public String search(@RequestParam String search1,@RequestParam(defaultValue = "") String search2 )
    {
        return search1 + " " + search2;
    }

    @GetMapping
    public List<Product> getProducList()
    {
        return productlist;
    }


    @PostMapping
    public Product addProduct(@Valid @RequestBody Product product)
    {
        productlist.add(product);
        return product;
    }
}
