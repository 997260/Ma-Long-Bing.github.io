package com.hello.petshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testViewController1 {
    @RequestMapping("/login.html")
    public String loginView(){
        return "login";
    }
}
