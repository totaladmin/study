package com.yzy.pattern.singlepattern;

import java.io.Serializable;
import java.lang.reflect.Constructor;

public class Test implements Serializable {
    public static void main(String[] args) throws Exception {

/*        Thread thread = new Thread(new CreateCourseRunnable());
        Thread thread2 = new Thread(new CreateCourseRunnable());

        thread.start();
        thread2.start();

        System.out.println("执行完毕！");*/

/*        LazySinglePattern singlePattern = LazySinglePattern.getInstance();
        System.out.println(singlePattern);*/

        Class clzz = LazySinglePattern.class;

        Constructor c = clzz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Object o = c.newInstance();
        Object o2 = LazySinglePattern.getInstance();
        System.out.println(o);
        System.out.println(o2);

    }
}
