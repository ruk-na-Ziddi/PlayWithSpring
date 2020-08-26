package com.example.spring;

public class MainTraditionalWay {

    public static void main(String[] args) {
        Store amazonStore = new AmazonStore();
        amazonStore.setStoreID("Amazon_0001");

        Store flipkartStore = new FlipkartStore();
        flipkartStore.setStoreID("Flipkart_001");

        // Injecting dependencies using setter
        Product miltonWaterBottle = new WaterBottle();
        miltonWaterBottle.setName("Milton 1L");
        miltonWaterBottle.setPrice(200);
        miltonWaterBottle.setStore(amazonStore);

        // Injecting dependencies using constructor
        Product pigeonWaterBottle = new WaterBottle("Pigeon 1L", 250, amazonStore);

        Product onePlus7T = new Mobile();
        onePlus7T.setName("One Plus 7T");
        onePlus7T.setPrice(34000);
        onePlus7T.setStore(flipkartStore);

        miltonWaterBottle.displayInfo();
        pigeonWaterBottle.displayInfo();
        onePlus7T.displayInfo();
    }

}
