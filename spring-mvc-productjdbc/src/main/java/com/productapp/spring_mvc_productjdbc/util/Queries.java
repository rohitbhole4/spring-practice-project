package com.productapp.spring_mvc_productjdbc.util;

public class Queries {
    public static final String INSERTQUERY = "INSERT INTO PRODUCT(prodName,prodBrand,prodPrice,prodcategory) VALUES (?,?,?,?)";

    public static final String UPDATEQUERY = "UPDATE PRODUCT SET prodName=?,prodBrand=?,prodcategory=?,prodPrice=? WHERE PRODID=?";

    public static final String DELETEQUERY = "DELETE FROM PRODUCT WHERE PRODID=?";

    public static final String ALLPRODUCTS = "SELECT * FROM PRODUCT";

    public static final String PRODUCTSBYBRAND = "SELECT * FROM PRODUCT WHERE prodBrand=?";

    public static final String PRODUCTBYID = "SELECT * FROM PRODUCT WHERE prodId=?";
}
