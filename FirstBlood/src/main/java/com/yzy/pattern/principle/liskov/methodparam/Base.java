package com.yzy.pattern.principle.liskov.methodparam;

import java.util.HashMap;

public class Base {
    public void method(HashMap map){
        System.out.println("父类执行hashmap");
    }
}
