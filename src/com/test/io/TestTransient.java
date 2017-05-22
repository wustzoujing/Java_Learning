package com.test.io;

import java.io.*;

/**
 * Created by zoujing on 2017/5/12.
 */
public class TestTransient {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        A a = new A(23,"zoujing");
        System.out.println(a);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/zoujing/Desktop/TestTransient.txt"));
        oos.writeObject(a);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/zoujing/Desktop/TestTransient.txt"));
        a = (A)ois.readObject();
        System.out.println(a);

    }

}

class A implements Serializable{
    int a;
    //修饰的变量不参与序列化
    transient String b;
    public A(int a,String b){
        this.a = a;
        this.b = b;
    }
    public String toString(){
        return "a = "+a+",b = "+b;
    }
}
