package com.productapp.spring_mvc_product.controller;

import com.productapp.spring_mvc_product.model.Product;
import com.productapp.spring_mvc_product.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @RequestMapping("/")
    public String showIndex(Model model){
        System.out.println("-------------------------index");

        List<Product> pList = service.getAllProducts();
        model.addAttribute("prodList",pList);
        return "index";
    }

    @RequestMapping("/showForm")
    public String showForm(Model model){
        System.out.println("--------------------------------showForm");


        model.addAttribute("product",new Product());

        return "addProduct";
    }

    private ProductServiceImpl service;

    @Autowired
    public void setService(ProductServiceImpl service) {
        this.service = service;
    }

    @RequestMapping("/saveProduct1")
    public String saveProduct(@RequestParam("prodName")String prodName,
                              @RequestParam("prodPrice")double prodPrice,
                              @RequestParam("prodBrand")String prodBrand,
                              @RequestParam("prodCategory")String prodCategory,Model model){
        System.out.println("--------------------------------saveProduct");

        Product p = new Product();
        p.setProdName(prodName);
        p.setProdPrice(prodPrice);
        p.setProdBrand(prodBrand);
        p.setProdCategory(prodCategory);


        model.addAttribute("product",p);

        service.addProduct(p);

        List<Product> pList = service.getAllProducts();
        model.addAttribute("prodList",pList);
        return "index";
    }

    @RequestMapping("/saveProduct")
    public String saveProduct(Product p ,Model model){

        service.addProduct(p);

        List<Product> pList = service.getAllProducts();
        model.addAttribute("prodList",pList);
        return "index";

    }
}
