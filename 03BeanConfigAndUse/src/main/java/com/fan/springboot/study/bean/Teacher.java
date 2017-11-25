package com.fan.springboot.study.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by maobuji on 2017/11/25.
 */
public class Teacher extends Person implements InitializingBean, DisposableBean {

    public String getName() {
        return null;
    }


    public void destroy() throws Exception {

    }

    public void afterPropertiesSet() throws Exception {


    }
}
