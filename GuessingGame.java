import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int numberOfAttempts = 0;
        int guess = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");
        System.out.println("Enter -1 if you want to exit the game.");


        while (true) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess == -1) {
                System.out.println("You have exited the game. Goodbye!");
                break;
            }

            numberOfAttempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
                break;
            }
        }


        input.close();
    }
}
