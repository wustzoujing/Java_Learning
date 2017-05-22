package com.test.PrintDemo;

/**
 * Created by zoujing on 2017/5/11.
 */
public class FormatTest1 {

    public static void main(String[] args) {
        int x = 5;
        double y = 3.141592;

        // 一般方式
        System.out.println("x = " + x + ", y = " + y);
        // printf()方式
        System.out.printf("x = %d, y = %f\n", x, y);
        // format()方式
        System.out.format("x = %d, y = %f\n", x, y);
    }
}
