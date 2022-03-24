package com.yzy.pattern.proxy.mhjdkproxy.client;

public class Test {
    public static void main(String[] args) throws Exception {

        MHJdkMeiPo jdkMeiPo = new MHJdkMeiPo();

        Zhangsan zhangsan = new Zhangsan();

        Person person = jdkMeiPo.getInstance(zhangsan);

        person.findLove();



    }
}
