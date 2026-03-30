package com.productapp.spring_mvc_productjdbc.service;

import com.productapp.spring_mvc_productjdbc.model.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    void updateProduct(Product product);

    Product getById(int prodId);
    void deleteProduct(int prodId);

    List<Product> getAllProducts();

    List<Product> getByBrand(String brand);

    List<Product> getByBrandAndCategory(String brand, String category);

    List<Product> getByLesserPrice(double price);

    List<Product> getByCategory(String category);
}
