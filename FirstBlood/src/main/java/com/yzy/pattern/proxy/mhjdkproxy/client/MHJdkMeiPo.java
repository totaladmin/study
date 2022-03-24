package com.yzy.pattern.proxy.mhjdkproxy.client;

import com.yzy.pattern.proxy.mhjdkproxy.proxy.MHClassLoader;
import com.yzy.pattern.proxy.mhjdkproxy.proxy.MHInvocationHandler;
import com.yzy.pattern.proxy.mhjdkproxy.proxy.MHProxy;

import java.lang.reflect.Method;


public class MHJdkMeiPo implements MHInvocationHandler {
    private Person person;

    public Person getInstance(Person person) throws Exception {
        this.person = person;
        Class clazz = person.getClass();
        return (Person) MHProxy.newProxyInstance(new MHClassLoader(),clazz.getInterfaces(),this);
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
