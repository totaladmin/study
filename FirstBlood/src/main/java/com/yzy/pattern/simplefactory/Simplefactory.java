package com.yzy.pattern.simplefactory;

public class Simplefactory {

    public Icourse create(Class classzz) throws Exception{
        if(classzz != null){
            return (Icourse)classzz.newInstance();
        }
        return null;
    }
}
