import java.io.*;
import java.lang.*;

class Student implements Serializable{
    int rollNo;
    String name;
    String dept;

    @Override
    public String toString(){
           return "Student Details:\n"+
                  "rollNo :"+rollNo+
                   "\nName :"+name+
                   "\nDepartment :"+dept;
    }
}


class Test{
    public static void main(String[] args) throws Exception{
        FileOutputStream fs  = new FileOutputStream("C:/Users/Ankit Thakur/Desktop/Java/Text/Text.txt");
        ObjectOutputStream os = new ObjectOutputStream(fs);

        Student s = new Student();
        s.name = "Sunny";
        s.rollNo = 6969;
        s.dept = "CSE";

        os.writeObject(s);
        os.close();
        fs.close();


      

        FileInputStream fis = new FileInputStream("C:/Users/Ankit Thakur/Desktop/Java/Text/Text.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student st = (Student)ois.readObject();

        System.out.println(st.toString());
        ois.close();
        fis.close();
    }
}
