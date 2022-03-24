package com.yzy.pattern.composite.transparent;

public abstract class CourseCompent {
    public void addChild(CourseCompent courseCompent) throws Exception {
        throw new Exception("不支持添加操作");
    }

    public void removeChild(CourseCompent courseCompent) throws Exception {
        throw new Exception("不支持删除操作");
    }

    public void print() throws Exception {
        throw new Exception("不支持打印操作");
    }




}
