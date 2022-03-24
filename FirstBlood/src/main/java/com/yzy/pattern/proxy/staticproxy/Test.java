package com.yzy.pattern.proxy.staticproxy;

import java.io.BufferedWriter;

public class Test {
    public static void main(String[] args) {
        Zhangsan zhangsan = new Zhangsan();

        Lisi lisi = new Lisi();

        Meipo meipo = new Meipo(lisi);

        meipo.findLove();

    }
}
