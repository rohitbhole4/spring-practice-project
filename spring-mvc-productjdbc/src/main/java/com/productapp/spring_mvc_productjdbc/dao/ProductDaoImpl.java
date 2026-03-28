package com.productapp.spring_mvc_productjdbc.dao;

import com.productapp.spring_mvc_productjdbc.model.Product;
import com.productapp.spring_mvc_productjdbc.util.Queries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl implements IProductDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(Product product) {

        Object[] prodArr = {product.getProdName(),product.getProdBrand(),product.getProdPrice(),product.getProdCategory()};
        jdbcTemplate.update(Queries.INSERTQUERY,prodArr);
    }

    @Override
    public void update(int prodId, double price) {

        int a = jdbcTemplate.update(Queries.UPDATEQUERY,price,prodId);
        System.out.println("no of record updated : ------------------------- : "+a);

    }

    @Override
    public Product findById(int prodId) {
        return null;
    }

    @Override
    public void delete(int prodId) {
        int a = jdbcTemplate.update(Queries.DELETEQUERY,prodId);
        System.out.println("record deleted :-------------------- "+a);
    }

    @Override
    public List<Product> findAllProducts() {
        RowMapper<Product> pMapper = new ProductMapper();

        return jdbcTemplate.query(Queries.ALLPRODUCTS,pMapper);
    }

    @Override
    public List<Product> findByBrand(String brand) {

        RowMapper<Product> pMapper = new ProductMapper();

        return jdbcTemplate.query(Queries.PRODUCTSBYBRAND,pMapper,brand);
    }

    @Override
    public List<Product> findByBrandAndCategory(String brand, String category) {
        return List.of();
    }

    @Override
    public List<Product> findByLesserPrice(double price) {
        return List.of();
    }

    @Override
    public List<Product> findByCategory(String category) {
        return List.of();
    }
}
