package com.test.PrintDemo;

import java.text.DecimalFormat;

/**
 * Created by zoujing on 2017/5/11.
 */
public class StringFormat {

    public static void main(String[] args){
//        int a=123;
//        double b=123.456;
//
//        System.out.print(String.format("%d\n",a));
//
//        System.out.print(String.format("%x\n",a));
//
//        System.out.print(String.format("%.1f\n",b));
//
//        DecimalFormat df=new DecimalFormat("#.000");
//        System.out.print( df.format(b));
//
//

        String str=null;
        str=String.format("Hi,%s", "王力");
        System.out.println(str);
        str=String.format("Hi,%s:%s.%s", "王南","王力","王张");
        System.out.println(str);
        System.out.printf("字母a的大写是：%c %n", 'A');
        System.out.printf("3>7的结果是：%b %n", 3>7);
        System.out.printf("100的一半是：%d %n", 100/2);
        System.out.printf("100的16进制数是：%x %n", 100);
        System.out.printf("100的8进制数是：%o %n", 100);
        System.out.printf("50元的书打8.5折扣是：%f 元%n", 50*0.85);
        System.out.printf("上面价格的16进制数是：%a %n", 50*0.85);
        System.out.printf("上面价格的指数表示：%e %n", 50*0.85);
        System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50*0.85);
        System.out.printf("上面的折扣是%d%% %n", 85);
        System.out.printf("字母A的散列码是：%h %n", 'A');
    }

}