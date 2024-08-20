import java.lang.*;

class Main{
    synchronized void display(String str){
        for(int i=0;i<str.length();i++){
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.print(str.charAt(i));
        }
    }
}

class Thread1 extends Thread{
    Main m;
    public Thread1(Main m){
        this.m = m;
    }
    public void run(){
        m.display("Hello");
    }
}

class Thread2 extends Thread{
    Main m;
    public Thread2(Main m){
        this.m = m;
    }
    public void run(){
        m.display("Welcome");
    }
}

class Test{
    public static void main(String[] args){
        Main m = new Main();
        Thread1 t1 = new Thread1(m);
        Thread2 t2 = new Thread2(m);

        t1.start();
        t2.start();
    }
}


//Output (before synchronized): WHeellcloome
//Output (after synchronized): HelloWelcome
