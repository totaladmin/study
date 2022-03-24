package com.yzy.pattern.singlepattern.container;


import com.yzy.pattern.singlepattern.register.Shop;

public class ContainerSingleTest {
    public static void main(String[] args) throws Exception {
        Object o =
                ContainerSingle.getInstance("com.gupaoedu.design.singlepattern.register.Shop");
        Object o2 =
                ContainerSingle.getInstance("com.gupaoedu.design.singlepattern.register.Shop");

        ThreadLocal<Shop> threadLocal = new ThreadLocal<Shop>(){
            @Override
            protected Shop initialValue() {
                return super.initialValue();
            }
        };
        threadLocal.get();


        System.out.println(o == o2);
    }
}
