import java.lang.*;
import java.util.ArrayList;
import java.util.List;

class Data <T>{
    Object obj;

    void setObject(T ob){
        obj = ob;
    }

    Object getObject(){
        return obj;
    }
}


class Test <T>{
    List<T> list = new ArrayList<>();

    void Display(T[] list){
         for(T ob : list)
             System.out.println(ob.toString());
    }


    public static void main(String[] args){
        Data<String> data = new Data<>();
        data.setObject("Hey This is Object !");
        System.out.println(data.getObject());

        Test<Integer> test = new Test<>();
        test.list.add(10);
        test.list.add(20);
        Integer[] newArray = test.list.toArray(new Integer[0]);
        test.Display(newArray);

    }
}
