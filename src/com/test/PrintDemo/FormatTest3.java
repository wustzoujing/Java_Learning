package com.test.PrintDemo;
import java.util.Formatter;
/**
 * Created by zoujing on 2017/5/11.
 */
public class FormatTest3 {
    static Formatter formatter = new Formatter(System.out);

    public static void printTitle() {
        formatter.format("%-15s %-5s %-10s\n", "huhx", "linux", "liuli");
        formatter.format("%-15s %-5s %-10s\n", "zhangkun", "yanzi", "zhangcong");
        formatter.format("%-15s %-5s %-10s\n", "zhangkun", "yanzhou", "zhangcong");
    }

    public static void print() {
        formatter.format("%-15s %5d %10.2f\n", "My name is huhx", 5, 4.2);
        formatter.format("%-15.4s %5d %10.2f\n", "My name is huhx", 5, 4.1);
    }

    public static void main(String[] args) {
        printTitle();
        System.out.println("----------------------------");
        print();
        formatter.close();
    }
}
