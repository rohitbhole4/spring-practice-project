package com.productapp.spring_mvc_product.util;

public class Queries {
    public static final String INSERTQUERY = "INSERT INTO PRODUCT(prodName,prodBrand,prodPrice,prodcategory) VALUES (?,?,?,?)";

    public static final String UPDATEQUERY = "UPDATE PRODUCT SET PRODPRICE=? WHERE PRODID=?";

    public static final String DELETEQUERY = "DELETE FROM PRODUCT WHERE PRODID=?";

    public static final String ALLPRODUCTS = "SELECT * FROM PRODUCT";
}
