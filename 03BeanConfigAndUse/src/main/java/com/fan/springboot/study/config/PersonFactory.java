package com.fan.springboot.study.config;

import com.fan.springboot.study.bean.Farmer;
import com.fan.springboot.study.bean.Person;
import com.fan.springboot.study.bean.Worker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by maobuji on 2017/11/22.
 */
@Configuration
public class PersonFactory {
    @Bean
    public Person getFarmerPerson() {
        return new Farmer();
    }

    @Bean
    public Person getWorkerPerson() {
        return new Worker();
    }
}
