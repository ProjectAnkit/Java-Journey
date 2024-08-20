import java.lang.*;

class Thread1 extends Thread{

    public Thread1(String name){
        super(name);
    }

    int i = 0;
    public void run(){
        int i=100;
        while(i>0){
            System.out.printf("Thread executing : %d\n",i);
            Thread.yield();
            --i;
        }
    }
}

class Test{
    public static void main(String[] args){
        Thread1 t1 = new Thread1("Yes Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        System.out.println("Thread Name :"+t1.getName());
        System.out.println("Thread id :"+t1.getId());
        System.out.println("Thread state :"+t1.getState());
        System.out.println("Thread priority :"+t1.getPriority());

        while(true){
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Main executing");
        }
    }
}
