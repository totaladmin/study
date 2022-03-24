package com.yzy.pattern.decorate;

public class BaseBatterCake extends BatterCake{

    @Override
    protected String getMsg() {
        return "基础款煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
