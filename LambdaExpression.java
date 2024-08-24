import java.lang.*;

@FunctionalInterface
interface MyLambda{
      void display(String s);
}

class Demo{
    public static void reverseLambda(String s){
        StringBuffer str = new StringBuffer(s);
        str.reverse();
        System.out.println(str);
    }
}

class LambdaDemo{
    public static void main(String[] args){
        MyLambda ml = (s)->System.out.println(s);
        ml.display("Normal Lambda expression");
        MyLambda ml1 = System.out::println;
        ml1.display("Method Reference");
        MyLambda ml2 = Demo::reverseLambda;
        ml2.display("Method Reference )esrever(");
    }
}
