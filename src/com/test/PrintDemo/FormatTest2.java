package com.test.PrintDemo;
import java.util.Formatter;
/**
 * Created by zoujing on 2017/5/11.
 */
public class FormatTest2 {

    public static void main(String[] args) {
        String name = "zoujing";
        int age = 22;

        Formatter formatter = new Formatter(System.out);
        formatter.format("My name is %s, and my age is %d ", name, age);
        formatter.close();
    }
}
