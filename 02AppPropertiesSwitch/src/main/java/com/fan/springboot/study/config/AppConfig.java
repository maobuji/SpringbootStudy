package com.fan.springboot.study.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/11/21.
 */
@Configuration
public class AppConfig {
    @Value("${run.type}")
    private
    String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
