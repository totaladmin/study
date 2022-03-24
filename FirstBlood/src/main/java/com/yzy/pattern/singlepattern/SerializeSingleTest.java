package com.yzy.pattern.singlepattern;


import com.yzy.pattern.singlepattern.serialize.SerializeObj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeSingleTest {

    public static void main(String[] args) throws Exception {

        SerializeObj obj = SerializeObj.getInstance();
        SerializeObj obj2 =null;
        FileOutputStream fos= new FileOutputStream("test");
        ObjectOutputStream obs = new ObjectOutputStream(fos);

        obs.writeObject(obj);
        obs.flush();
        obs.close();

        FileInputStream fis = new FileInputStream("test");
        ObjectInputStream ois = new ObjectInputStream(fis);

        obj2 =(SerializeObj) ois.readObject();
        ois.close();

        System.out.println(obj == obj2);

    }
}
