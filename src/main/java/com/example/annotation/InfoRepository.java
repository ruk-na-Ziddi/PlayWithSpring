package com.example.annotation;

import org.springframework.beans.factory.annotation.Value;

public class InfoRepository {
    private String type;

//    @Value("quantum world")
    public void setType(String type) {
        this.type = type;
    }

    public void getInfo() {
        System.out.println("**************** Reading Information from : >>>" + type);
    }
}
