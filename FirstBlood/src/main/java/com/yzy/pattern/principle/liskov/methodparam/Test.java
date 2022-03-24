package com.yzy.pattern.principle.liskov.methodparam;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        Child base = new Child();
        HashMap hashMap = new HashMap();

        //Map map = new HashMap();

        base.method(hashMap);

    }

}
