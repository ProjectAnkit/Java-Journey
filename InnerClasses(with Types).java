import java.lang.*;

//Nested Inner Class
class Outer1{
    int x = 10;
    int y = 20;

    class Inner{
        int z = 30;
        public void Display1Inner(){
            System.out.println("Inner Display :");
            System.out.println(x);
            System.out.println(y);
        }
    }

    public void Display1(){
         Inner i = new Inner();
         System.out.print("Nested Inner Example :-\n");
         System.out.println(i.z);
    }
}



//Local Inner Class

class Outer2{
    void Display2(){
        class Inner{
            int x = 40;
            int y = 50;

            public void Display2Inner(){
                System.out.println(x);
                System.out.println(x);
            }
        }

        Inner i = new Inner();
        System.out.println("\nLocal Inner Example :-");
        i.Display2Inner();
    }
}


//Anonymous Inner class

abstract class Outer3{
    abstract void Display3();
}

class Outer31{
    Outer3 o3 = new Outer3() {
        @Override
        void Display3() {
            System.out.println("\nAnonymous Inner Example !");
        }
    };

    void Display31(){
        o3.Display3();
    }
}



//Static Inner Class

class Outer4{
    static int x = 60;
    int y = 70;

    static class Inner{
        void Display4Inner(){
            System.out.println("\nStatic Inner Example :-");
            System.out.println(x);
//            System.out.println(y);    (not allowed)
        }
    }
}




class MyFirst{
    public static void main(String[] args) {
        Outer1 o1 = new Outer1();
        o1.Display1();
        Outer1.Inner i = new Outer1().new Inner();
        i.Display1Inner();

        Outer2 o2 = new Outer2();
        o2.Display2();

        Outer31 o31 = new Outer31();
        o31.Display31();

        Outer4.Inner i4 = new Outer4.Inner();
        i4.Display4Inner();
    }
}
