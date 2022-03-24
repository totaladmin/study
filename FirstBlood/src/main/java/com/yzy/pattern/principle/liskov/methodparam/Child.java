package com.yzy.pattern.principle.liskov.methodparam;

import java.util.Map;

public class Child extends Base{

/*    @Override
    public void method(HashMap map) {
        System.out.println("子类执行hashmap");
    }*/
    public void method(Map map) {
        System.out.println("子类类执行HashMap");
    }
}
