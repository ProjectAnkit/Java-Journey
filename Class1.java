import java.lang.*;
import java.util.Scanner;

class Area{
    public int length;
    public int width;

    public int rectangle(int l,int w){
        this.length = l;
        this.width = w;

        return length*width;
    }
}

class MyFirst{
    public static void main(String[] args){
        Area a = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle :");
        int l = sc.nextInt();
        System.out.print("Enter the width of the rectangle :");
        int w = sc.nextInt();
        System.out.printf("Area of Rectangle is :%d",a.rectangle(l,w));
    }
}
