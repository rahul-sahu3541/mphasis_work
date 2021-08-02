package com.mphasis.entpapp.controller;

import com.mphasis.entpapp.models.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {
    @RequestMapping("/products")
    public List<Product> greet(){
        return Arrays.asList(new Product(1,"pencil",4),new Product(2,"eraser",2),new Product(3,"Scale",5));

    }
}
