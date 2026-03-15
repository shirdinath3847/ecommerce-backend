package com.example.ecommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/product")
    public Product getProduct() {
        // This simulates getting a product from a database
        return new Product("Running Shoes", 89.99);
    }
}