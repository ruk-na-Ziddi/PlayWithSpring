package com.example.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationConfig.xml");
        InfoService infoService = applicationContext.getBean("infoService", InfoService.class);

        infoService.showInfo();

        applicationContext.close();
    }
}

// auto wire only happens for bean, it is not possible for primitive types
// type, name and qualifier
