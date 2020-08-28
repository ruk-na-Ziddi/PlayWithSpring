package com.example.javaconf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
    private FlipkartStore store;

    public void showDetail() {
        System.out.println("Mobile is sold at : " + store.getStoreID());
    }

    @Autowired
    public void setStore(FlipkartStore store) {
        this.store = store;
    }
}
