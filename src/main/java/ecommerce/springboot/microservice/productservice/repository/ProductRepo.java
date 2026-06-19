package ecommerce.springboot.microservice.productservice.repository;

import ecommerce.springboot.microservice.productservice.entity.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepo {

    public List<Product> retrieveProducts() {
         List<Product> productList = Arrays.asList(
                new Product("id1", "name1", 100.50, Arrays.asList("USA", "India"), "High"),
                new Product("id2", "name2", 200.50, Arrays.asList("India"), "Low")
        );
         return productList;
    }
}
