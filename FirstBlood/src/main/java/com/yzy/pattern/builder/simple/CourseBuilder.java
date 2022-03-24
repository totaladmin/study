package com.yzy.pattern.builder.simple;

public class CourseBuilder {
    private Course course = new Course();

    public CourseBuilder addName(String name){
        course.setName(name);
        return this;
    }
    public CourseBuilder addPpt(String ppt){
        course.setPpt(ppt);
        return this;
    }

    public Course builder(){
        return  course;
    }

}
