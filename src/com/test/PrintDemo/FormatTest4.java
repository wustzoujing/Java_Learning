package com.test.PrintDemo;

/**
 * Created by zoujing on 2017/5/11.
 */
public class FormatTest4 {

    public static void main(String[] args) {
        int age = 22;
        String name = "zoujing";

        String info = String.format("My name is %s and my age is %d", name, age);
        System.out.println(info);
    }
}