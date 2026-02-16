package com.productapp.spring_mvc_product.dao;

import com.productapp.spring_mvc_product.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product p = new Product();
        p.setProdId(rs.getInt("prodId"));
        p.setProdName(rs.getString("prodName"));
        p.setProdBrand(rs.getString("prodBrand"));
        p.setProdPrice(rs.getDouble("prodPrice"));
        p.setProdCategory(rs.getString("prodCategory"));
        return p;
    }
}
