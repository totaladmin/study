package com.yzy.pattern.builder.simple;

public class Test {
    public static void main(String[] args) {
        CourseBuilder builder =new CourseBuilder();
        builder.addName("吾往矣")
                .addPpt("无");

        System.out.println(builder.builder());


    }
}
