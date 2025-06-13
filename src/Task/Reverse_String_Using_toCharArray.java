package Task;

import java.util.Scanner;

public class Reverse_String_Using_toCharArray {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        String original=scanner.nextLine();

        String rev="";
        char a[]=original.toCharArray();
        for(int i=a.length-1;i>=0;i--)
        {
            rev=rev+a[i];
        }
        System.out.println("Reversed string is  " +rev);
    }
}
