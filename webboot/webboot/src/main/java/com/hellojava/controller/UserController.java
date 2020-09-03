package com.hellojava.controller;

import com.hellojava.entity.User;
import com.hellojava.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/loginHandler")
    public String loadUser(User user){
        boolean bool=userService.loadUser(user);
        System.out.println(bool);
        return bool?"redirect:loadGoods":"error";
    }
}
