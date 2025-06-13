package Task;

import java.util.Scanner;

public class Reverse_String_Using_Length_CharAt {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String original=scanner.nextLine();

        String rev="";

        for(int i=original.length()-1; i>=0;i--)
        {
            rev=rev+original.charAt(i);
        }
        System.out.println("Reveresed string is " +rev );

    }
}
