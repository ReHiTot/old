package io;

import pojo.Dog;

import java.io.*;

public class ObjectStreamTest {
//    public static



    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Dog dog=new Dog("小黑",10);
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\XUNIJI\\3.txt"));
//        oos.writeObject(dog);
//        oos.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\XUNIJI\\3.txt"));
        Object o = ois.readObject();
        Dog dog=(Dog)o;
        System.out.println(o.getClass());
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        ois.close();
    }

}
