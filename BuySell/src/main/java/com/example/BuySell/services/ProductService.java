package com.example.BuySell.services;

import com.example.BuySell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products =new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID,"PlayStation 5", "Simple Description", 45000, "Kiev", "vega"));
        products.add(new Product(++ID,"Nokia 3310", "Simple Description", 4000, "Krasnoyarsk", "sega"));

    }

    public List<Product> listProducts() {
        return products;
    }
    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }
    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId() == id);
    }

}
