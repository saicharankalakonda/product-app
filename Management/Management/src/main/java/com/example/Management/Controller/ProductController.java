package com.example.Management.Controller;

import com.example.Management.Entity.Product;
import com.example.Management.repositry.ProductRepo;
import com.example.Management.repositry.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    ProductRepo prodRepo;
    @GetMapping(value = "/getProducts")
    public String getValues(){
        return "api is working";
    }
    @GetMapping(value = "/getAll")
    public List<Product> showRegistrationForm() {
        return prodRepo.findAll();
    }

    @PostMapping(value="/post")
    public Product postProducts(@RequestBody Product p){
        prodRepo.save(p);
        return p;
    }
}
