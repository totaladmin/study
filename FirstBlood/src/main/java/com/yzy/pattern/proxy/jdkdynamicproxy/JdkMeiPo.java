package com.yzy.pattern.proxy.jdkdynamicproxy;

import com.yzy.pattern.proxy.staticproxy.Meipo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkMeiPo implements InvocationHandler {
    private Person person;

    public Person getInstance(Person person){
        this.person = person;
        Class clazz = person.getClass();
        return (Person)Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.person,args);
        after();
        return result;
    }

    public void before(){
        System.out.println("么慌，开始物色");
    }

    public void after(){
        System.out.println("相亲成功");
    }
}
