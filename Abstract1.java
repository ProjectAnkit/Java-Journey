import java.lang.*;

abstract class Shape{
    abstract float perimeter();
    abstract float area();
}

class Rectangle extends Shape{
    int length;
    int width;

    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    public float perimeter(){
        return 2*(length+width);
    }

    public float area(){
         return length*width;
    }
}


class Circle extends Shape{
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public float perimeter(){
        return (float) (2*3.14*radius);
    }

    public float area(){
        return (float) (3.14*Math.pow(radius,2));
    }
}

class MyFirst{
    public static void main(String[] args){
        Shape sr = new Rectangle(2,6);
        System.out.printf("Perimeter of Rectangle is: %f\n",sr.perimeter());
        Shape sc = new Circle(6);
        System.out.printf("Area of Circle is: %f\n",sc.area());
    }
}
