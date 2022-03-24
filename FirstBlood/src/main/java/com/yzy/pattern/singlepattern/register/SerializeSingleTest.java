package com.yzy.pattern.singlepattern.register;

public class SerializeSingleTest {

    public static void main(String[] args) throws Exception {

        /*EnumSingleObj obj = EnumSingleObj.getInstance();
        EnumSingleObj obj2 =null;
        obj.setObject(new Object());
        FileOutputStream fos= new FileOutputStream("test");
        ObjectOutputStream obs = new ObjectOutputStream(fos);

        obs.writeObject(obj);
        obs.flush();
        obs.close();

        FileInputStream fis = new FileInputStream("test");
        ObjectInputStream ois = new ObjectInputStream(fis);

        obj2 =(EnumSingleObj) ois.readObject();
        ois.close();

        System.out.println(obj == obj2);*/

/*        Class clzz = EnumSingleObj.class;

        Constructor c = clzz.getDeclaredConstructor(String.class,int.class);
        c.setAccessible(true);
        Object o = c.newInstance("test",123);
        Object o2 = EnumSingleObj.getInstance();
        System.out.println(o);
        System.out.println(o2);*/

        EnumSingleObj obj = EnumSingleObj.getInstance();
        obj.setShop(new Shop("haitai",1));

        EnumSingleObj obj2 = EnumSingleObj.getInstance();

        System.out.println(obj.getShop());
        System.out.println(obj2.getShop());

        


    }
}
