import java.lang.*;

class Super{
    public void display(){}
}

class Sub extends Super{
    @Override
    public void display(){}

    @Deprecated
    public void listen(){
        System.out.println("Listening SUB");
    }
}

class Main{
    public static void main(String[] args){
        Sub s = new Sub();
        s.listen();
    }
}
