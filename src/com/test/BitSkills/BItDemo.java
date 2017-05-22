package com.test.BitSkills;

/**
 * Created by zoujing on 2017/5/11.
 */
public class BItDemo {

    public static void IsSingle(){
        for(int i=0;i<20;++i){
            //与上1结果为0就是偶数，为1是奇数
            if((i&1)==1){
                System.out.printf("%d\n",i);
            }
        }
    }

    public static void swap(){
        int a=5;
        int b=11;
        //不用额外空间就完成值交换
        a^=b;
        b^=a;
        a^=b;
        System.out.printf("a ="+ a +",b=" + b);
    }

    public static void reserve(){
        int a=-11;
        //取反加1可以完成变换符号操作
        System.out.print(~a+1);
    }

    public static void abs(){
        int a=-11;
        //右移31为，正数为0，负数为-1；
        int i=a>>31;
        //按正负情况输出
        System.out.print(i==0?a:~a+1);
    }

    public static void abs2(){
        int a=-11;
        //右移31为，正数为0，负数为-1；
        int i=a>>31;
        //这个十分巧妙，如果是正数就是本身，如果是负数就是取反加1
        System.out.print(a^i-i);
    }

    public static void main(String[] args){
        //IsSingle();
        //swap();
        //reserve();
        abs();
    }


}
