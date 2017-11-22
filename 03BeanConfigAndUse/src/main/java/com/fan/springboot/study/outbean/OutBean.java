package com.fan.springboot.study.outbean;

import com.fan.springboot.study.bean.Person;
import com.fan.springboot.study.util.StaticContextUtil;

/**
 * Created by maobuji on 2017/11/22.
 */
public class OutBean {

    public String getFarmer() {
        Person person = (Person) StaticContextUtil.getBean("Farmer");
        return person.getName();

    }

}
