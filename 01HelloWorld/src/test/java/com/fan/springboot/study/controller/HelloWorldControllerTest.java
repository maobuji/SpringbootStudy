package com.fan.springboot.study.controller;

import com.fan.springboot.study.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhang on 2017/11/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
//@SpringApplicationConfiguration(classes = Application.class)
//@ContextConfiguration(classes=AddressBookConfiguration.class) //直接注入配置类

public class HelloWorldControllerTest {


    @Autowired
    private HelloWorldController helloWorldController;

    @Test
    public void sayHello() throws Exception {

        String reString = helloWorldController.sayHello();
        Assert.assertTrue("Hello,World!".equals(reString));

    }

}