import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
      
        int randomNumber = random.nextInt(101); 
        int guess = -1; 
        int guessCount = 0; 
        
        System.out.println("Guess a number between 0 and 100:");

   
        while (guess != randomNumber) {
            guess = scanner.nextInt();
            guessCount++; 

          
            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            }
        }

        // User has guessed correctly
        System.out.println("You got it! The number was " + randomNumber);
        System.out.println("It took you " + guessCount + " guesses.");
        
        // Feedback on performance
        if (guessCount <= 7) {
            System.out.println("Great job! You guessed it in " + guessCount + " guesses or less.");
        } else {
            System.out.println("You took a bit longer than 7 guesses.");
        }

        scanner.close();
    }
}
