package com.yzy.pattern.composite.transparent;

import com.yzy.pattern.composite.safe.Derictory;

import java.util.ArrayList;
import java.util.List;

public class CoursePacage extends CourseCompent{
    private List<CourseCompent> lists;
    private String name;
    private Integer level;

    public CoursePacage(String name, int level) {
        this.name = name;
        this.level = level;
        lists = new ArrayList<CourseCompent>();
    }

    @Override
    public void addChild(CourseCompent courseCompent) throws Exception {
        lists.add(courseCompent);
    }

    @Override
    public void removeChild(CourseCompent courseCompent) throws Exception {
        lists.remove(courseCompent);
    }

    @Override
    public void print() throws Exception {
        System.out.println(this.name);
        for (CourseCompent courseCompent:lists){
            //控制显示格式
            if(this.level != null){
                for(int  i = 0; i < this.level; i ++){
                    //打印空格控制格式
                    System.out.print("  ");
                }
                for(int  i = 0; i < this.level; i ++){
                    //每一行开始打印一个+号
                    if(i == 0){ System.out.print("+"); }
                    System.out.print("-");
                }
            }
            //打印名称
            courseCompent.print();
        }

    }
}
