package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by zoujing on 2017/5/22.
 */
public class createthread2 {
    public static void main(String[] args){
        createthread2 rt=new createthread2();

        FutureTask<Integer> task=new FutureTask<Integer>((Callable<Integer>)()->{
            int i=0;
            for(;i<100;i++){
                System.out.println(Thread.currentThread().getName()+ " 的循环变量i的值是："+i);
            }
            return i;
        });


        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+ " 的循环变量i的值是："+i);
            if(i==20){
                new Thread(task,"有返回值的线程").start();
            }
        }

        try {
            System.out.println("子线程的返回值： "+task.get());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
