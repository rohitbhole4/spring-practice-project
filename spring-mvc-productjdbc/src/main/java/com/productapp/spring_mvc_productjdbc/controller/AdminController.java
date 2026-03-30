package com.productapp.spring_mvc_productjdbc.controller;

import com.productapp.spring_mvc_productjdbc.model.Product;
import com.productapp.spring_mvc_productjdbc.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdminController {

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("wrong","");
        return "login";
    }

    public ProductServiceImpl service;
    @Autowired
    public void setService(ProductServiceImpl service) {
        this.service = service;
    }

    @RequestMapping("/admin")
    public String admin(String username, String password, Model model){
        if (username.equals("admin") && password.equals("admin")){
            List<Product> pList = service.getAllProducts();
            model.addAttribute("prodList",pList);
            return "admin";
        } else{
            model.addAttribute("wrong","Invalid Id/password");
            return "login";
        }
    }

    @RequestMapping("/addForm")
    public String showAddForm(Model model){
        model.addAttribute("product",new Product());
        return "addForm";
    }

    @RequestMapping("/editForm")
    public String showEditForm(){
        return "editForm";
    }

    @RequestMapping("/deleteForm")
    public String showDeleteForm(){
        return "deleteForm";
    }

    @RequestMapping("/logout")
    public String logout(Model model){
        List<Product> pList = service.getAllProducts();
        model.addAttribute("prodList", pList);
        return "index";
    }
}
