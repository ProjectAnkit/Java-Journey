import java.io.*;
import java.util.*;

class Producer extends Thread{
    OutputStream os;

    public Producer(OutputStream o){
        os = o;
    }

    public void run(){
        int count = 0;
        try{
            while(true){
                System.out.println("Producer :"+count);
                os.write(count++);
                os.flush();
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


class Consumer extends Thread{
    InputStream is;

    public Consumer(InputStream i){
        is = i;
    }

    public void run(){
        try{
           int x;
           while(true){
               x = is.read();
               System.out.println("Consumer :"+x);
               System.out.flush();
               Thread.sleep(1000);
           }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


class Main{
    public static void main(String[] args) throws Exception{
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pos.connect(pis);

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();
    }
}
