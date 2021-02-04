package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CustomerController {
    @GetMapping("/homePage")
    public String homePage(){
        return "springBootHtml/homePage";
    }
    @GetMapping("/dataEntry")
    public String dataEntry(){
        return "springBootHtml/dataEntry";
    }

    @GetMapping("/orderCoffee")
    public String orderCoffee(){
        return "springBootHtml/orderCoffee";
    }
    @GetMapping("/about_the_roaster")
    public String about_the_roaster(){
        return "springBootHtml/about_the_roaster";
    }
}
