package com.yzy.pattern.proxy.cglibproxy;

import org.springframework.cglib.core.DebuggingClassWriter;

public class Test {
    public static void main(String[] args) {
        Zhangsan zhangsan = new Zhangsan();
        CglibMeipo cglibMeipo = new CglibMeipo();

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"F:\\cglib_class");
        Zhangsan zhangsanProxy = (Zhangsan)cglibMeipo.getInstance(Zhangsan.class);

        zhangsanProxy.findLove();

    }
}
