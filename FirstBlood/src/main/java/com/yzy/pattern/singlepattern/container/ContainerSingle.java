package com.yzy.pattern.singlepattern.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingle {

    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    private ContainerSingle(){

    }

    public static Object getInstance(String name) throws Exception {
        synchronized (ioc){
            if(!ioc.containsKey(name)){
                Object obj =null;
                obj = Class.forName(name).newInstance();
                ioc.put(name,obj);
                return obj;
            }
            return ioc.get(name);
        }
    }

}
