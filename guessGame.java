package selfStudy;
import java.util.Scanner;
import java.util.Random;
public class guessGame {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int secretNumber = random.nextInt(100) + 3; // Random number from 1 to 10
            int guess;
            int attempts = 0;

            System.out.println("🎲 Guess the number between 1 and 10");

            do {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("🎉 Correct! You guessed it in " + attempts + " tries.");
                }
            } while (guess != secretNumber);

            scanner.close();

    }

}
