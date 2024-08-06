import java.lang.*;
import java.util.Scanner;

class MyFirst{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        String binStr = sc.next();
        System.out.printf("Is binary number ? : %b",binStr.matches("[0-1]+"));

        System.out.print("\nEnter a HexDecimal number : ");
        String hexStr = sc.next();
        System.out.printf("Is hex number ? : %b",hexStr.matches("[0-9A-F]+"));

        System.out.print("\nEnter any date in DD/MM/YYYY format : ");
        String dateStr = sc.next();
        System.out.printf("Is date format ? : %b",dateStr.matches("[0-3][1-9]/[0-1][1-9]/[0-9]{4}"));
    }
}


//To check binary , hexadecimal and date format 
