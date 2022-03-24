package com.yzy.pattern.simplefactory;

public class JavaCourse implements Icourse{

    @Override
    public void record() {
        System.out.println("java课程");
    }
}
