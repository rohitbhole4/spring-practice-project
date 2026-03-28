package com.productapp.spring_mvc_productjdbc.service;

import com.productapp.spring_mvc_productjdbc.dao.ProductDaoImpl;
import com.productapp.spring_mvc_productjdbc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements IProductService{

        @Autowired
        private ProductDaoImpl productDao;
        @Override
        public void addProduct(Product product) {

        productDao.save(product);
    }

        @Override
        public void updateProduct(int prodId, double price) {
        productDao.update(prodId,price);
    }

        @Override
        public Product getById(int prodId) {
        return null;
    }

        @Override
        public void deleteProduct(int prodId) {

        productDao.delete(prodId);
    }

        @Override
        public List<Product> getAllProducts() {
        return productDao.findAllProducts();
    }

        @Override
        public List<Product> getByBrand(String brand) {
        return productDao.findByBrand(brand);
    }

        @Override
        public List<Product> getByBrandAndCategory(String brand, String category) {
        return List.of();
    }

        @Override
        public List<Product> getByLesserPrice(double price) {
        return List.of();
    }

        @Override
        public List<Product> getByCategory(String category) {
        return List.of();
    }

}
