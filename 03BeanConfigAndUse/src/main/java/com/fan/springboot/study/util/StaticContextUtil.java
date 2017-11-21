package com.fan.springboot.study.util;

import org.springframework.context.ApplicationContext;

/**
 * Created by maobuji on 2017/11/22.
 */
public class StaticContextUtil {

    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(ApplicationContext applicationContext) {
        StaticContextUtil.applicationContext = applicationContext;
    }
}
