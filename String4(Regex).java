import java.lang.*;

class MyFirst{
    public static void main(String args[]){
        String str = "         1@u$@u     22I44u     @$o@#      ";
        String newStr = str.replaceAll("[!@#%&*$]*","");
        System.out.printf("String without Special Characters:%s",newStr);
        String newStr2 = str.replaceAll("\\s+"," ").trim();
        System.out.printf("\nString without blank Spaces:%s\n",newStr2);
        String[] newStr3 = newStr2.split("\\s+");
        System.out.printf("Total words in String :%d",newStr3.length);
    }
}


//1. Remove special characters
//2. Remove extra spaces
//3. Number of words
