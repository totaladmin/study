package com.yzy.pattern.proxy.staticproxy;


public class Meipo implements Person{
    private Person person;

    public Meipo(Person person) {
        this.person = person;
    }

    @Override
    public void findLove() {
        before();
        person.findLove();
        after();

    }

    public void before() {
        System.out.println("开始物色人选");
    }

    public void after() {
        System.out.println("相亲成功");
    }
}
