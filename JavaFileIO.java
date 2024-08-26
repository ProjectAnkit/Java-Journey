import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.*;

class Test{
    public static void main(String[] args) throws Exception{
        try(FileOutputStream fo = new FileOutputStream("C:/Users/Ankit Thakur/Desktop/Java/Text/Text.txt")){
            String str = "This is free text";
            fo.write(str.getBytes());
        }

        try(FileInputStream fi = new FileInputStream("C:/Users/Ankit Thakur/Desktop/Java/Text/Text.txt")){
            int x;
            while((x=fi.read())!=-1){
                System.out.print((char)x);
            }
        }
    }
}
