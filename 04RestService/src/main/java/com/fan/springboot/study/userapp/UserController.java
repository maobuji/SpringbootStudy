package com.fan.springboot.study.userapp;

import com.fan.springboot.study.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by maobuji on 2017/11/26.
 */
@RestController
public class UserController {
        @Autowired
        UserService userService;

       @RequestMapping(value="/addUser")
       @ResponseBody
       public User queryUser(){

           userService.findUser()

           return user;

       }

}

