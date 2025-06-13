package Task;

import java.util.Random;
import java.util.Scanner;

public class Guessing_Number_while {
    public static void main(String[] args) {

        Random random=new Random();
        int numberToGuess=random.nextInt(100)+1;
        System.out.println(numberToGuess);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempt=0;

        while(true)
        {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // Consume invalid token
                continue;
            }
            guess= scanner.nextInt();
            attempt++;

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }


            if(guess<numberToGuess)
            {
                System.out.println("Too low value,Try again");
            }
            else if(guess>numberToGuess)
            {
                System.out.println("Too high,Try again");
            }
            else
            {
                System.out.println("Correct " +attempt+ "Attempts");
                break;
            }
        }
    }

}
