package com.yzy.pattern.proxy.mhjdkproxy.client;


public class Zhangsan implements Person {
    @Override
    public void findLove() {
        System.out.println("择偶：肤白貌美大长腿");
    }

    @Override
    public void baoxian() {
        System.out.println("zhangsan 30万");
    }


}
