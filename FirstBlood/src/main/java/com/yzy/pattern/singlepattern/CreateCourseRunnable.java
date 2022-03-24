package com.yzy.pattern.singlepattern;

public class CreateCourseRunnable implements Runnable {
    @Override
    public void run() {
        LazyObj obj = LazyObj.getInstance();
        System.out.println(Thread.currentThread().getName()+"       "+obj);
    }
}
