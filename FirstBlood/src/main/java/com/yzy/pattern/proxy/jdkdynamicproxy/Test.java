package com.yzy.pattern.proxy.jdkdynamicproxy;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) throws Exception {

        JdkMeiPo jdkMeiPo = new JdkMeiPo();

        Zhangsan zhangsan = new Zhangsan();

        Person person = jdkMeiPo.getInstance(zhangsan);

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});

        File file = new File("F:\\$Proxy2.class");

        FileOutputStream fos = new FileOutputStream(file);
        fos.write(bytes);
        fos.flush();;
        fos.close();



        //person.baoxian();

    }
}
