package com.test.BaseClass;

/**
 * Created by zoujing on 2017/5/11.
 */
public class Int {
    public static void main(String[] args){
        Integer a=new Integer(123);
        Integer b=3;
        Integer c;
        Integer d=Integer.valueOf(311);
        Integer e=a;
        //System.out.print(a.byteValue());
        //System.out.print(a.compareTo(123));
        //System.out.print(a.floatValue());

//        System.out.print(a.hashCode());
//        System.out.print(a.equals(e));

//        System.out.print(a.toString());


        //后面是进制，前面是数，输出这个数对应这个进制的格式。
        //System.out.println(Integer.toString(133,2));
        //System.out.println(Integer.toString(173,29));
       // System.out.println(Integer.toString(-133));

        //System.out.println(Integer.toUnsignedString(123,3));

        System.out.println(Integer.decode("0x0011"));
        System.out.println(Integer.decode("0X0011"));
        System.out.println(Integer.decode("011"));
        System.out.println(Integer.decode("-011"));

    }
}
