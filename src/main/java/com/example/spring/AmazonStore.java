package com.example.spring;

public class AmazonStore implements Store {
    private String storeID;

    @Override
    public String getStoreID() {
        return storeID;
    }

    @Override
    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }
}
