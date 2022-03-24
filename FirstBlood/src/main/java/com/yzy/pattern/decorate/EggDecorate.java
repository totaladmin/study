package com.yzy.pattern.decorate;

public class EggDecorate extends BatterCakeDecorate{
    public EggDecorate(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"加一个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }
}
