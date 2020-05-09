package com.myCode.controller;

import com.myCode.entity.User;
import com.myCode.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{name}/detail")
    @ResponseBody
    public String showUser(@PathVariable("name") String name){
        User user = userService.getUser(name);
        return user.getName()+" "+user.getAge();
    }
}
