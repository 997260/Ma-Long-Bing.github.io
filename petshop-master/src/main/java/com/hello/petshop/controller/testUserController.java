package com.hello.petshop.controller;

import com.hello.petshop.entity.TestUser;
import com.hello.petshop.service.TestIUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testUserController {
    @Autowired
    private TestIUserService testuserService;

    @RequestMapping("/loginHandler")
    public String loadUser(TestUser testUser){
//        System.out.println(1);
//        boolean bool=testuserService.loadUser(testUser);
//        System.out.println(bool);
//        return bool?"succeed":"index";
          boolean bool = testuserService.loadUser();
          return bool?"succeed":"index";
    }
}
