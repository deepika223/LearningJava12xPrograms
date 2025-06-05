package Task;

import java.util.Scanner;

public class ReverseNumberForLoop {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scan.nextInt();
        int reverse=0;

        for(; number!=0; number/=10)
        {
            int number1=number%10;
            reverse=reverse*10+number1;
        }
        System.out.println("Reversed no is:"+reverse);
    }
}
