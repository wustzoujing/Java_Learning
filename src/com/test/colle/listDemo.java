package com.test.colle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by zoujing on 2017/5/12.
 */
public class listDemo {
    public static void main(String[] args) {
        arraylist();


    }
    public static void arraylist(){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>(30);
        ArrayList<HashMap<String,Integer>> b=new ArrayList<>();

        Integer[] array=new Integer [a.size()];
        array=list.toArray(array);

        Arrays.asList(array);

        a.addAll(10,list);


    }

    public  static void linkedlist(){
        LinkedList<String> list=new LinkedList<>();

    }
}
