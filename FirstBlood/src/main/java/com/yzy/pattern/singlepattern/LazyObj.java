package com.yzy.pattern.singlepattern;

public class LazyObj {
    public static LazyObj lazyObj = null;

    private LazyObj() {
    }

    public static LazyObj getInstance(){
        if(lazyObj == null){
            lazyObj = new LazyObj();
        }
        return lazyObj;
    }

}
