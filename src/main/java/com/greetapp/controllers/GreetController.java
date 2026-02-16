package com.greetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetController {

    @RequestMapping("/")
    public String home() {
        System.out.println("------------------------------index");
        return "index";
    }


    @RequestMapping("/sayHello")
    public String sayHello(Model model){

        model.addAttribute("message","have a good day!");
        return "views/success";
    }

    @RequestMapping("/welcome")
    public String welcome(Model model){

        model.addAttribute("message","welcome to MVC");
        return "views/success";
    }

    @RequestMapping("/greetUser")
    public String greetUser(Model model){

        model.addAttribute("message","hi-fi");
        return "views/success";
    }
}
