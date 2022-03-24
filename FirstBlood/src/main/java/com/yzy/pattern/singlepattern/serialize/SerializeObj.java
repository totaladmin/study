package com.yzy.pattern.singlepattern.serialize;

import java.io.Serializable;

public class SerializeObj implements Serializable {
    public final static SerializeObj obj = new SerializeObj();
    private SerializeObj() {
    }
    public static SerializeObj getInstance(){
        return  obj;
    }

    private Object readResolve(){
        return obj;
    }
}
