import java.lang.*;

class Main{
    int value;
    boolean flag = true;

    synchronized void setValue(int value){
        while(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.value = value;
        flag = false;
        notify();
    }

    synchronized int getValue(){
        while(flag){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        flag = true;
        notify();
        return this.value;
    }
}

class Producer extends Thread{
    Main m;
    int i = 0;
    public Producer(Main m){
        this.m = m;
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Producer: "+i);
            m.setValue(i++);
        }
    }
}

class Consumer extends Thread{
    Main m;
    public Consumer(Main m){
        this.m = m;
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Consumer "+m.getValue());
        }
    }
}


class Test{
    public static void main(String[] args){
        Main m = new Main();
        Producer p  = new Producer(m);
        Consumer c = new Consumer(m);
        p.start();
        c.start();
    }
}



//Output
// Producer: 0
// Consumer 0
// Producer: 1
// Consumer 1
// Producer: 2
// Consumer 2
// Producer: 3
// Consumer 3
