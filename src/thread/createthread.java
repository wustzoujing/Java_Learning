package thread;

/**
 * Created by zoujing on 2017/5/22.
 */
public class createthread {
    public static void main(String[] args){
        Thread thread=new Thread("thread"){
            @Override
            public void run(){

            }
        };


        Thread thread1=new Thread(new Runnable(){
            @Override
            public void run(){

            }
        },"thread1");
    }



}
