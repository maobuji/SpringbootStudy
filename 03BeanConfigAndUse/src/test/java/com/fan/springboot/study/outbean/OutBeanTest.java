package com.fan.springboot.study.outbean;

import com.fan.springboot.study.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by maobuji on 2017/11/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class OutBeanTest {
    @Test
    public void getFarmer() throws Exception {

        OutBean outBean = new OutBean();

        assertArrayEquals(new String[]{"Worker"}, new String[]{
                outBean.getFarmer()});

    }

}