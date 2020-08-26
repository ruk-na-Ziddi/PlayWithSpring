package com.example.spring;

public class FlipkartStore implements Store {
    private String storeId;

    @Override
    public void setStoreID(String storeId) {
        this.storeId = storeId;
    }

    @Override
    public String getStoreID() {
        return storeId + " Koramangala 3rd Block";
    }
}
