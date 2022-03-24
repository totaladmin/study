package com.yzy.pattern.singlepattern.register;

public enum EnumSingleObj {
    INSTANCE;

    private Shop shop;

    private EnumSingleObj(){

    }

    public static EnumSingleObj getInstance(){
        return INSTANCE;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
