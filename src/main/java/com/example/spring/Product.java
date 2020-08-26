package com.example.spring;

public interface Product {
    public void setName(String name);
    public void setPrice(int price);
    public void setStore(Store store);
    public void displayInfo();
    public int calculateSellPrice();
}
