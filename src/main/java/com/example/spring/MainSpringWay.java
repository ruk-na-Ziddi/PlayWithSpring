package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringWay {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("configuration.xml");
        Product miltonWaterBottle = applicationContext.getBean("miltonWaterBottle", Product.class);
        Product pigeonWaterBottle = applicationContext.getBean("pigeonWaterBottle", Product.class);
        Product onePlus7T = applicationContext.getBean("onePlus7TMobile", Product.class);

        miltonWaterBottle.displayInfo();
        pigeonWaterBottle.displayInfo();
        onePlus7T.displayInfo();

        applicationContext.close();
    }

}


// Why String
// IOC
// DI
// XML