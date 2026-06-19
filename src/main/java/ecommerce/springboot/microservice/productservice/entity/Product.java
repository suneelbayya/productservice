package ecommerce.springboot.microservice.productservice.entity;

import lombok.Data;

import java.util.List;

@Data
public class Product {

    private String productId;
    private String productName;
    private double productCost;
    private List<String> productAvailableIn;
    private String productCategory;

    public Product(String productId, String productName, double productCost, List<String> productAvailableIn,String productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productAvailableIn = productAvailableIn;
        this.productCategory = productCategory;
    }

}
