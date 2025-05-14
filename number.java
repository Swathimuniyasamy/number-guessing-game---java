package numberguessing;
import java.util.Scanner;
import java.util.Random;


public class number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int lowerBound = 1;
		int upperBound = 100;
		int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
		int guess;
		int attempts = 0;
		int maxAttempts = 10;
		boolean hasWon = false;

		System.out.println("🎮 Welcome to the Number Guessing Game!");
		System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound);
		System.out.println("You have " + maxAttempts + " attempts to guess it.");

		// TODO Auto-generated method stub
		while (attempts < maxAttempts) {
		    System.out.print("Enter your guess: ");
		    guess = scanner.nextInt();
		    attempts++;

		    if (guess == targetNumber) {
		        hasWon = true;
		        break;
		    } else if (guess < targetNumber) {
		        System.out.println("Too low! Try again.");
		    } else {
		        System.out.println("Too high! Try again.");
		    }
		}
		if (hasWon) {
		    System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " attempts.");
		} else {
		    System.out.println("❌ Sorry! You've used all attempts.");
		    System.out.println("The number was: " + targetNumber);
		}
		System.out.print("Do you want to play again? (yes/no): ");
		String playAgain = scanner.next();

		if (playAgain.equalsIgnoreCase("yes")) {
		    main(null);  // Recursively restart the game
		} else {
		    System.out.println("Thanks for playing! 👋");
		    scanner.close();
		}


	}

}
