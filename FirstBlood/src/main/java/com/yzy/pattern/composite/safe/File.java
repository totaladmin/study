package com.yzy.pattern.composite.safe;

public class File extends Derictory{
    public File(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
