package ecommerce.springboot.microservice.productservice.controller;

import ecommerce.springboot.microservice.productservice.entity.Product;
import ecommerce.springboot.microservice.productservice.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> fetchAllProducts()
    {
        return productRepo.retrieveProducts()
                .stream()
                .filter(product -> product.getProductAvailableIn().contains("USA"))
                .toList();
    }
}
