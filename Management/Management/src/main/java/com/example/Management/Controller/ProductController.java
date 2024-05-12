package com.example.Management.Controller;

import com.example.Management.Entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {
    @GetMapping(value = "/getProducts")
    public String getValues(){
        return "api is working";
    }
    @GetMapping(value = "/login")
    public String showRegistrationForm() {
        return "login";
    }
    @PostMapping()

}
