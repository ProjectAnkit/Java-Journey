import java.lang.*;

class MyFirst{
    public static void main(String args[]){
        String email = "ankit123@gmail.com";
        int idx = email.indexOf("@");
        String username = email.substring(0,idx);
        System.out.println(username);
        System.out.println(email.substring(idx+1));
        int idx1 = email.indexOf(".");
        String idSource = email.substring((idx+1),idx1);
        System.out.println(idSource.equals("gmail"));
    }
}


//Find username and domain name from email id and check if it is gmail
