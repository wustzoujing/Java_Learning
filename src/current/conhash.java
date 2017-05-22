package current;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zoujing on 2017/5/12.
 */
public class conhash {

    public void test(){
        ConcurrentHashMap<String,String> h=new ConcurrentHashMap<>();


    }

    public class Test1 {
        private int a=1, b=2;

        public void foo(){  // 线程1
            a=3;
            b=4;
        }

        public int getA(){ // 线程2
            return a;
        }
        public int getB(){ // 线程2
            return b;
        }
    }

    public static void main(String[] args){
        Thread thread1=new Thread();
        Thread thread2=new Thread();
        Thread thread3=new Thread();

    }
}
