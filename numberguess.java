package firstproject;
import java.util.Scanner;
import java.util.Random;

public class numberguess {
    public static void main(String[] args) {
        // Initialize Scanner and Random
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        // Display the introduction
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Game loop
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");

            // Check if input is an integer
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // discard invalid input
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            // Validate range
            if (guess < 1 || guess > 100) {
                System.out.println("Your guess must be between 1 and 100.");
                continue;
            }

            // Provide feedback
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            }
        }

        // Winning message
        System.out.println("Congratulations! You guessed the number.");
        System.out.println("It took you " + attempts + " attempts.");

        scanner.close();
    }
}