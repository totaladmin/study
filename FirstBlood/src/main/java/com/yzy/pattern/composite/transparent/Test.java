package com.yzy.pattern.composite.transparent;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;

public class Test {

    public static void main(String[] args) throws Exception {
        Course c = new Course("c",100);
        Course java = new Course("java",200);
        Course h5 = new Course("h5",200);
        Course xiaoshuo = new Course("xiaoshuo",200);

        CoursePacage coursePacage = new CoursePacage("编程",2);
        coursePacage.addChild(c);
        coursePacage.addChild(java);
        coursePacage.addChild(h5);

        CoursePacage root = new CoursePacage("All",1);
        root.addChild(xiaoshuo);
        root.addChild(coursePacage);

        root.print();

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.getConnection();



    }
}
