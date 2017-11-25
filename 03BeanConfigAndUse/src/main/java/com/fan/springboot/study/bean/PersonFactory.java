package com.fan.springboot.study.bean;

import com.fan.springboot.study.bean.Farmer;
import com.fan.springboot.study.bean.Person;
import com.fan.springboot.study.bean.Worker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by maobuji on 2017/11/22.
 */
@Configuration
public class PersonFactory {
    // @Bean属性默认产生方法名的bean，但可以通过names属性更改

    @Bean(name = "farmerPerson")
    public Person getFarmerPerson() {
        return new Farmer();
    }

    @Bean(name = {"worker","wrokerPerson"})// 支持指定别名
    @Scope("prototype")// 指定作用域
    public Person getWorkerPerson() {
        return new Worker();
    }

    @Bean(name = "TeacherPerson")// 支持指定别名
    public Person getTeacherPerson() {
        return new Teacher();
    }
}
