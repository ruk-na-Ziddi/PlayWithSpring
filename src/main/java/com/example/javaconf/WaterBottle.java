package com.example.javaconf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WaterBottle {
    private AmazonStore store;

    @Autowired
    public void setStore(AmazonStore store) {
        this.store = store;
    }

    public void showDetail() {
        System.out.println("Water Bottle is sold at : " + store.getStoreID());
    };
}
