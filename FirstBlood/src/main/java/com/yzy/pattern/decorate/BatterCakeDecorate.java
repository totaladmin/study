package com.yzy.pattern.decorate;

public class BatterCakeDecorate extends BatterCake{
    private BatterCake batterCake;

    public BatterCakeDecorate(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    protected String getMsg() {
        return batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return batterCake.getPrice();
    }
}
