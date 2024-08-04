import java.lang.*;

class MyFirst{
    public static void main(String args[]){
        int x = 10;
        int y = 20;
        String str = "Hey!";
        System.out.println("Sum of "+x+" and "+y+" gives you "+(x+y));
        System.out.printf("%3$s ,Joining %1$d & %2$d gives you %1$d%2$d",x,y,str);
    }
}
