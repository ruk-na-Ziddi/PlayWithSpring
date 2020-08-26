package com.example.spring;

public class Mobile implements Product {
    private String name;
    private int price;
    private Store store;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setStore(Store store) {
        this.store = store;
    }

    @Override
    public void displayInfo() {
        System.out.println("Mobile " + name + " is available at store " + store.getStoreID() + " priced at " + calculateSellPrice() + " Rs." );
    }

    @Override
    public int calculateSellPrice() {
        return price + ((price * 10)/100);
    }
}
