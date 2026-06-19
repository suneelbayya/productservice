package ecommerce.springboot.microservice.productservice.controller;

import ecommerce.springboot.microservice.productservice.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/productservice")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public String createProduct() {
        return "Product created successfully";
    }

    @GetMapping("/fetchAllProducts")
    public List<Product> fetchAllProducts() {
        return productService.fetchAllProducts();
    }

}