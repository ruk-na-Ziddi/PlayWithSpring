package com.example.javaconf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Mobile mobile = applicationContext.getBean("mobile", Mobile.class);
        WaterBottle waterBottle = applicationContext.getBean("waterBottle", WaterBottle.class);

        mobile.showDetail();
        waterBottle.showDetail();
    }
}
