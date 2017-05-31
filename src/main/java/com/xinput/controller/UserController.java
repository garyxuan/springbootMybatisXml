package com.xinput.controller;

import com.xinput.entity.User;
import com.xinput.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/user/{id}",method= RequestMethod.GET)
    public User findUser(@PathVariable("id")Long id){
        User user = userService.getUserById(id);
        return user;
    }
}
