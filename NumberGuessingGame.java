package aish;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		     Scanner scanner = new Scanner(System.in);
		     Random random = new Random();
		     int minRange = 1;
		     int maxRange = 100;
		     int attemptsLimit = 10;
		     int score = 0;

		     System.out.println("Welcome to the Number Guessing Game!");

		     do {
		       int generatedNumber = random.nextInt(maxRange - minRange + 1) +minRange;
		       int attempts = 0;
		       boolean guessedCorrectly = false;

		       System.out.println("\nI have generated a number between " + minRange +
		        		" and "+ maxRange + ". Can you guess it?");

		       while (attempts < attemptsLimit) {
		              System.out.print("Enter your guess: ");
		              int userGuess = scanner.nextInt();
		              attempts++;

		              if (userGuess == generatedNumber) {
		               System.out.println("Congratulations! You guessed the correct "
		               		+ "number"	+ " in " + attempts + " attempts.");
		               guessedCorrectly = true;
		               break;
		                } else if (userGuess < generatedNumber) {
		                    System.out.println("Too low! Try again.");
		                } else {
		                    System.out.println("Too high! Try again.");
		                }
		            }

		        if (!guessedCorrectly) {
		          System.out.println("Sorry, you've reached the maximum number of "
		          		+ "attempts."+ "The correct number was: " + 
		          generatedNumber);
		       }

		          score += guessedCorrectly ? 1 : 0;

		            System.out.print("\nDo you want to play again? (yes/no): ");
		        } while (scanner.next().equalsIgnoreCase("yes"));

		        System.out.println("\nGame Over. Your total score is: " + score);
		        scanner.close();
		    }
}
