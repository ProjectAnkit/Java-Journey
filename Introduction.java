import java.lang.*;
import java.util.*;

class MyFirst{
    public static void main(String args[]){
        System.out.println("Whats your name ?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hey "+name+"! Welcome to Java.");
    }
}
