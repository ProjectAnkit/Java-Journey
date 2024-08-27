import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.lang.*;

class Test{
    public static void main(String[] args)throws Exception{
        byte[] b = {'a','b','c','d','e','f','g','h'};

        try(ByteArrayInputStream bi = new ByteArrayInputStream(b)){
            int x;
            while((x=bi.read())!=-1){
                System.out.print((char)x);
            }
        }

        try(ByteArrayOutputStream bo = new ByteArrayOutputStream()){
            char x = 65;
            while(x<72){
                bo.write(x);
                x++;
            }

            bo.writeTo(new FileOutputStream("C:/Users/Ankit Thakur/Desktop/Java/Text/Text.txt"));
        }
    }
}
