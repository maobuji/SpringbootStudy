package com.fan.springboot.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhang on 2017/11/20.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/test")
    public String sayHello(String firstName, String secondName) {
        return "Hello," + firstName + " " + secondName + "!";
    }
}
