import java.lang.*;

class Super{
    void Display(){
        System.out.println("Nothing");
    }
}

class Sub extends Super implements Runnable{
    public void run(){
        int j = 100;
        while(j>0){
            System.out.println("Runnable executing");
            --j;
        }
    }
}


class Test extends Thread{
    int i = 100;
    public void run(){
        while(i>0){
            System.out.println("Thread executing");
            --i;
        }
    }

    public static void main(String[] args){
        Test t1 = new Test();
        Sub s1 = new Sub();
        Thread t2 = new Thread(s1);
        t1.start();
        t2.start();
        int j = 100;

        while(j>0){
            System.out.println("Main Loop");
            --j;
        }
    }
}

//Output: 

/*Main Loop
Main Loop
Thread executing
Thread executing
Runnable executing
Runnable executing
Runnable executing
Runnable executing
Runnable executing
Runnable executing
Runnable executing
Runnable executing
Main Loop
Main Loop
Main Loop
Thread executing
Thread executing
Thread executing
Thread executing
Thread executing
Thread executing
Thread executing
Thread executing
Thread executing
Thread executing
Runnable executing
Runnable executing
Runnable executing
Runnable executing
Runnable executing
Runnable executing
Runnable executing
Runnable executing
Main Loop
Main Loop
Main Loop
Main Loop
Thread executing
Thread executing
Thread executing
Thread executing
Thread executing
Thread executing
Thread executing
Runnable executing
Runnable executing
Runnable executing
Runnable executing
Runnable executing
Runnable executing
Runnable executing
Runnable executing
Main Loop
Main Loop
Main Loop
Main Loop
Main Loop
Main Loop
Main Loop
Main Loop
Thread executing
Thread executing
Thread executing
Thread executing
Thread executing
Thread executing
.
.
.
.*/
