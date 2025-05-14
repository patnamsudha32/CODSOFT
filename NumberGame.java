import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int maxAttempts = 5;
        int score = 0;
        String playAgain;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int numberToGuess = rand.nextInt(100) + 1; // 1 to 100
            boolean isGuessed = false;

            System.out.println("\nI'm thinking of a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it!");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Attempt " + attempt + " - Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == numberToGuess) {
                    System.out.println(" Correct! You've guessed the number.");
                    isGuessed = true;
                    score++;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!isGuessed) {
                System.out.println(" Out of attempts! The correct number was: " + numberToGuess);
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = sc.next().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("\nGame Over! Your final score: " + score);
        System.out.println("Thanks for playing!");

        sc.close();
    }
}
