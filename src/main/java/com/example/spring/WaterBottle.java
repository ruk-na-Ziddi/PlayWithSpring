package com.example.spring;

public class WaterBottle implements Product {
    private String name;
    private int price;
    private Store store;

    public WaterBottle() {};

    public WaterBottle(String name, int price, Store store) {
        this.name = name;
        this.price = price;
        this.store = store;

        System.out.println("*****************Calling constructor to inject dependencies for : " + name);
    };

    @Override
    public void setName(String name) {
        this.name = name;
        System.out.println("*****************Calling setter to inject dependencies for : " + name);
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setStore(Store store) {
        this.store = store;
    }

    public void displayInfo() {
        System.out.println("Water Bottle " + name + " is available at store " + store.getStoreID() + " priced at " + calculateSellPrice() + " Rs." );
    }

    @Override
    public int calculateSellPrice() {
        return price;
    }
}
