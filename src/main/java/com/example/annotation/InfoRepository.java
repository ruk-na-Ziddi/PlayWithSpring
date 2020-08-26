package com.example.annotation;

public class InfoRepository {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public void getInfo() {
        System.out.println("**************** Reading Information from : >>>" + type);
    }
}
