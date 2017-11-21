package com.fan.springboot.study.config;

import com.fan.springboot.study.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.Assert;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Administrator on 2017/11/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)

public class AppConfigTest {

    @Autowired
    AppConfig appConfig;

    @Test
    public void testConfig() {
        assertArrayEquals(new String[]{"test"}, new String[]{appConfig.getType()});
    }


}