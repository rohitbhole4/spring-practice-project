package com.productapp.spring_mvc_productjdbc.controller;

import com.productapp.spring_mvc_productjdbc.model.Product;
import com.productapp.spring_mvc_productjdbc.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {


    private ProductServiceImpl service;

    @Autowired
    public void setService(ProductServiceImpl service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String home(Model model){
        List<Product> pList = service.getAllProducts();
        model.addAttribute("prodList",pList);
        model.addAttribute("product",new Product());
        return "index";
    }

    @RequestMapping("/search")
    public String getByBrand(Model model,String prodBrand){
        System.out.println(prodBrand+" 7777777777777777777777");
        List<Product> pList = service.getByBrand(prodBrand);
        model.addAttribute("prodList",pList);
        model.addAttribute("product",new Product());
        return "index";
    }
}
