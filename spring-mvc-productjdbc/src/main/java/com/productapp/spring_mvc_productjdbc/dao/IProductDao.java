package com.productapp.spring_mvc_productjdbc.dao;

import com.productapp.spring_mvc_productjdbc.model.Product;

import java.util.List;

public interface IProductDao {
    void save(Product product);

    void update(int prodId, double price);

    Product findById(int prodId);
    void delete(int prodId);

    List<Product> findAllProducts();

    List<Product> findByBrand(String brand);

    List<Product> findByBrandAndCategory(String brand, String category);

    List<Product> findByLesserPrice(double price);

    List<Product> findByCategory(String category);
}
