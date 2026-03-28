package com.productapp.spring_mvc_productjdbc.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private String prodName;
    private Integer prodId;
    private String prodBrand;
    private String prodCategory;
    private double prodPrice;

    public Product() {
    }

    public Product(String prodName, String brand, String category, double prodPrice) {
        this.prodName = prodName;
        this.prodBrand = brand;
        this.prodCategory = category;
        this.prodPrice = prodPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodName='" + prodName + '\'' +
                ", prodId=" + prodId +
                ", prodBrand='" + prodBrand + '\'' +
                ", prodCategory='" + prodCategory + '\'' +
                ", prodPrice=" + prodPrice +
                '}';
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getProdBrand() {
        return prodBrand;
    }

    public void setProdBrand(String prodBrand) {
        this.prodBrand = prodBrand;
    }

    public String getProdCategory() {
        return prodCategory;
    }

    public void setProdCategory(String prodCategory) {
        this.prodCategory = prodCategory;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }
}
