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
        if (prodBrand.equals("")){

            List<Product> pList = service.getAllProducts();
            model.addAttribute("prodList",pList);

        }else {

            List<Product> pList = service.getByBrand(prodBrand);
            model.addAttribute("prodList",pList);
        }

       // model.addAttribute("product",new Product());
        return "index";
    }

    @RequestMapping("/addProduct")
    public String addProduct(Product product,Model model){

        service.addProduct(product);
        List<Product> pList = service.getAllProducts();
        model.addAttribute("prodList",pList);
        model.addAttribute("msg","Product Added.");
        return "admin";
    }

    @RequestMapping("/getById")
    public String getById(String prodId, Model model){

        Product product = service.getById(Integer.parseInt(prodId));
        model.addAttribute("product",product);
        return "updateForm";
    }

    @RequestMapping("/updateProduct")
    public String updateProduct(Product product, Model model){

        service.updateProduct(product);
        List<Product> pList = service.getAllProducts();
        model.addAttribute("prodList",pList);
        model.addAttribute("msg","Product Updated.");
        return "admin";
    }

    @RequestMapping("/deleteProduct")
    public String deleteProduct(String prodId, Model model) {

        service.deleteProduct(Integer.parseInt(prodId));
        List<Product> pList = service.getAllProducts();
        model.addAttribute("prodList", pList);
        model.addAttribute("msg", "Product Deleted.");
        return "admin";
    }

}


