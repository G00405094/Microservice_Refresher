package com.example.microservicerefresher;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productlist = new ArrayList<Product>();

    public List<Product> getProductList() {
        return productlist;
    }
    public Product addProduct(Product product) {
        productlist.add(product);
        return product;
    }

    public Product removeProduct(Long id) {
        for (Product product : productlist)
        if(product.getId() == id) {
            productlist.remove(product);
            return product;
        }
        return null;
    }
    public Product updateProduct(long id, Product productUpdated) {
        for (Product product : productlist)
            if(product.getId() == id) {
                product.setName(productUpdated.getName());
                product.setPrice(productUpdated.getPrice());
                return product;
            }
        return null;
    }
}
