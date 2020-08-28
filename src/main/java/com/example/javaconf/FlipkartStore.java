package com.example.javaconf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Flipkart001")
public class FlipkartStore {
    private String storeId;

    @Value("Flipkart001")
    public void setStoreID(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreID() {
        return storeId + " Koramangala 3rd Block";
    }
}