package com.fan.springboot.study.bean;

import com.fan.springboot.study.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import org.junit.Assert;

/**
 * Created by maobuji on 2017/11/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class PersonFactoryTest {

    @Autowired
    private WebApplicationContext context;


    @Test
    public void getFarmerPerson() throws Exception {
        Person p1 = context.getBean("farmerPerson", Person.class);
        Person p2 = context.getBean("farmerPerson", Person.class);
        Assert.assertTrue(p1.equals(p2));
    }

    @Test
    public void getWorkerPerson() throws Exception {
        Person p1 = context.getBean("wrokerPerson", Person.class);
        Person p2 = context.getBean("wrokerPerson", Person.class);
        Assert.assertTrue(!p1.equals(p2));
    }

}