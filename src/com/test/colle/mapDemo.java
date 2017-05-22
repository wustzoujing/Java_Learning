package com.test.colle;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Created by zoujing on 2017/5/11.
 */
public class mapDemo {

    public static void main(String[] args) {
        hashmap();

        treemap();

        linkedmap();
    }

    //按key排序；
    public static void treemap(){
        TreeMap<String , Double> map =  new TreeMap<String , Double>();
        map.put("ccc" , 89.0);
        map.put("aaa" , 80.0);
        map.put("zzz" , 80.0);
        map.put("bbb" , 89.0);
        System.out.println(map);

    }

    public static void hashmap(){
        HashMap<String,Double> map=new HashMap<>();
        map.put("ccc" , 89.0);
        map.put("aaa" , 80.0);
        map.put("zzz" , 80.0);
        map.put("bbb" , 89.0);
        System.out.println(map);
    }

    public static void linkedmap(){
        LinkedHashMap<String,Double> map=new LinkedHashMap<>();
        map.put("ccc" , 89.0);
        map.put("aaa" , 80.0);
        map.put("zzz" , 80.0);
        map.put("bbb" , 89.0);
        System.out.println(map);
    }

}
