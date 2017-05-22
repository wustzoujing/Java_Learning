package com.test.PrintDemo;

/**
 * Created by zoujing on 2017/5/11.
 */
public class FormatTest5 {
    public static String format(byte[] data) {
        StringBuilder builder = new StringBuilder();
        int n = 0;
        for(byte b: data) {
            if (n %16 == 0) {
                builder.append(String.format("%05x: ", n));
            }
            builder.append(String.format("%02x ", b));
            n ++;
            if (n % 16 == 0) {
                builder.append("\n");
            }
        }
        builder.append("\n");
        return builder.toString();
    }

    public static void main(String[] args) {
        String string = "my name is zoujing, welcome to my blog";
        System.out.println(format(string.getBytes()));
    }
}
