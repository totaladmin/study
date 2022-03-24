package com.yzy.pattern.composite.safe;

public class Test {

    public static void main(String[] args) {
        File xx = new File("xx.exe");
        File zz = new File("zz.exe");

        File ww = new File("ww.exe");
        File yy = new File("yy.exe");

        Folder work =new Folder("work");
        work.add(ww);
        work.add(yy);
        work.setLevel(2);

        Folder root =new Folder("D:/");
        root.add(xx);
        root.add(zz);
        root.add(work);


        root.setLevel(1);

        root.show();

    }
}
