package com.yzy.pattern.simplefactory;

import java.util.Calendar;

public class Test {

    public static void main(String[] args) throws Exception {
        Simplefactory simplefactory = new Simplefactory();

        Icourse icourse = simplefactory.create(JavaCourse.class);

        icourse.record();

        Calendar.getInstance();
        

    }
}
