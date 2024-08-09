import java.lang.*;

class Rectangle{
    protected int length;
    protected int width;

    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    public int Area(){
        return (length*width);
    }
}

class Cuboid extends Rectangle{
     protected int height;

     public Cuboid(int length,int width,int height){
         super(length,width);
         this.height = height;
     }

     public int Area(){
         return 2*(super.length*super.width+super.width*height+super.length*height);
     }
}

class MyFirst{
    public static void main(String[] args){
//      Cuboid c = new Rectangle(3,5);  sub ref and super Object is not allowed
        Rectangle r = new Cuboid(3,4,5);  //super ref and sub Object is allowed
        System.out.printf("Area of Cuboid is : %d",r.Area());
    }
}
