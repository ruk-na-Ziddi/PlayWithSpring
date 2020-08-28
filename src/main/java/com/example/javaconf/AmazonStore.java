package com.example.javaconf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Amazon001")
public class AmazonStore {
    private String storeID;

    public String getStoreID() {
        return storeID;
    }

    @Value("Amazon001")
    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }
}
