package com.example.microservicerefresher;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Product_Controller {
    private ProductService productService;
    private ProductClient productClient;
    @Autowired
    public Product_Controller(ProductService productService, ProductClient productClient) {
        this.productService = productService;
        this.productClient = productClient;
    }

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
    public List<Product> getProductList()
    {
        return productService.getProductList();
    }


    @PostMapping("/confirm")
    public String confirmProduct(@Valid @RequestBody Product product){
        String confirm = productClient.someDetails(product);
        return confirm;
    }
   @PostMapping
    public Product addProduct(@Valid @RequestBody Product product)
    {
        return productService.addProduct(product);
    }


    @DeleteMapping ("/remove/{id}")
    public Product removeProduct(@PathVariable long id)
    {
        return productService.removeProduct(id);
    }

    @PutMapping ("/update/{id}")
    public Product updateProduct(@PathVariable long id, @Valid @RequestBody Product product){
        return productService.updateProduct(id, product);
    }
}
