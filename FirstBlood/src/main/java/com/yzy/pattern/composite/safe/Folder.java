package com.yzy.pattern.composite.safe;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Derictory{

    private List<Derictory> lists;
    private Integer level;

    public Folder(String name) {
        this.name = name;
        this.lists = new ArrayList<Derictory>();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void add(Derictory o){
        lists.add(o);
    }

    public void remove(Derictory o){
        lists.remove(o);
    }

    @Override
    public void show() {
        System.out.println(this.name);
        for (Derictory derictory:lists){
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
            derictory.show();
        }

    }
}
