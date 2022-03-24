package com.yzy.pattern.singlepattern;

public class LazySinglePattern {
    private LazySinglePattern() {
        if(LazyHolder.singlePattern != null){
            System.out.println("实例已被构建"+ LazyHolder.singlePattern);
            throw new RuntimeException("实例已被构建");
        }
    }

    public static LazySinglePattern getInstance(){
        return LazyHolder.singlePattern;
    }

    private static class LazyHolder{
        private static LazySinglePattern singlePattern = new LazySinglePattern();
    }
}
