package com.yzy.pattern.proxy.mhjdkproxy.proxy;

import java.lang.reflect.Method;

public interface MHInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
