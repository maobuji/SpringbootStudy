package com.fan.springboot.study;

import com.fan.springboot.study.bean.Person;
import com.fan.springboot.study.util.StaticContextUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by maobuji on 2017/11/21.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class);
        // 可以这样用，但是不推荐
        StaticContextUtil.setApplicationContext(applicationContext);
        Person p = (Person) StaticContextUtil.getBean("farmerPerson");
        System.out.print(p.getName());
    }
}
