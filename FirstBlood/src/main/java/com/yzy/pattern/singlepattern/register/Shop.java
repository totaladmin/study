package com.yzy.pattern.singlepattern.register;

public class Shop {
    private String shopName;
    private int price;

    public Shop(){

    }

    public Shop(String shopName, int price) {
        this.shopName = shopName;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.shopName+this.price;
    }
}
