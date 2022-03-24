package com.yzy.pattern.decorate;

public class SauageDecorate extends BatterCakeDecorate{
    public SauageDecorate(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"加一根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+2;
    }
}
