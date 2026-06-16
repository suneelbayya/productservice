package ecommerce.springboot.microservice.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;@RestController
@RequestMapping(path = "/productservice")
public class ProductsController {

    @PostMapping("/addProduct")
    public String createProduct() {
        return "Product created successfully";
    }

    @GetMapping("/fetchAllProducts")
    public String fetchAllProducts() {
        return "Fetched all products successfully";
    }

}