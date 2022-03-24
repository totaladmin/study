package com.yzy.pattern.composite.transparent;

public class Course extends CourseCompent{

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void print() throws Exception {
        System.out.println("课程名："+this.name+" " +"售价:"+this.price+"元");
    }
}
