import java.lang.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class My{
    private int x;
    public char ch;
    protected float y;
    boolean flag;

    public My(){};
    public My(int x,int y){};

    public void display(){};
    public int area(int side){return side;};
}

class Test{
    public static void main(String[] args){
        Class<My> c = My.class;

        System.out.println("Class name :"+c.getName());
        Field[] fields = c.getDeclaredFields();
        Constructor[] consts = c.getDeclaredConstructors();
        Method[] mts =  c.getDeclaredMethods();
        for(Field fd: fields){
            System.out.println("Fields :"+fd);
        }
        for(Constructor cs: consts){
            System.out.println("Constructor :"+cs);
        }
        for(Method mt: mts){
            System.out.println("Methods :"+mt);
        }
    }
}
