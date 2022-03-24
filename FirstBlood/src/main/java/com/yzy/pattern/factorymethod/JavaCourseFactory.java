package com.yzy.pattern.factorymethod;


import com.yzy.pattern.simplefactory.Icourse;
import com.yzy.pattern.simplefactory.JavaCourse;

public class JavaCourseFactory implements IcourseFactory{
    @Override
    public Icourse create() {
        return new JavaCourse();
    }
}
