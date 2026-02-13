package com.productapp.service;

import com.productapp.model.Product;
import jdk.jfr.Category;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    void updateProduct(int prodId, double price);

    Product getById(int prodId);
    void deleteProduct(int prodId);

    List<Product> getAllProducts();

    List<Product> getByBrand(String brand);

    List<Product> getByBrandAndCategory(String brand, String category);

    List<Product> getByLesserPrice(double price);

    List<Product> getByCategory(String category);
}
