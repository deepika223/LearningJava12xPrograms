package Task;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");

        if(!scanner.hasNextInt())
        {
            System.out.println("Enter a integer value");
        }
        int number=scanner.nextInt();
        int factorial=1;

        if(number==0)
        {
            System.out.println("Factorial is" +factorial);
        }
        int i=1;
        while(i<=number)
        {
            factorial=factorial*i;
            i++;
        }
        System.out.println("Factorial is " +factorial);
    }
}
