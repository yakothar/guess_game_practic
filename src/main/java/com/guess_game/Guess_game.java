package guess_game_practic.src.main.java.com.guess_game;

import java.util.Random;
import java.util.Scanner;

public class Guess_game 
{
    public static void main(String[] args) 
    {
        int maxNumber, difficulty, targetNumber, guess;
        int numGuesses = 0;
        Scanner scanner = new Scanner(System.in);   // Scanner is used for User input
        while (true) 
        {
            System.out.println("Let's play Guess the Number.");
            System.out.println("Choose a difficulty level:");
            System.out.println("1. Easy (1-10)");
            System.out.println("2. Medium (1-100)");
            System.out.println("3. Hard (1-1000)");
            System.out.print("Pick a difficulty level (1, 2, or 3): ");
            difficulty = scanner.nextInt(); // User input for choosing difficulty level
            switch (difficulty) 
            {
                case 1:                 // Switch case to select 3 diff. cases of maxNumber
                    maxNumber = 10;
                    break;
                case 2:
                    maxNumber = 100;
                    break;
                case 3:
                    maxNumber = 1000;
                    break;
                default:
                    System.out.println("Invalid difficulty level. Please try again.");
                    continue;   // Continue again to choose correct difficulty level
            }

            Random random = new Random();
            // computer chooses random number till the range given as maxNumber
            targetNumber = random.nextInt(maxNumber);    
            
            System.out.println("I have my number. What's your guess?");
            while (true) 
            {
                guess = scanner.nextInt();
                numGuesses++;
                if (guess == targetNumber) 
                {
                    System.out.println("You got it in " + numGuesses + " guesses");
                    break;
                }
                else if (guess < targetNumber) 
                {
                    System.out.println("Too low. Try again.");
                }
                else 
                {
                    System.out.println("Too high. Try again.");
                }
            }
            System.out.print("Play again? (y/n) ");
            String playAgain;
            playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("y")) 
            {
                System.out.println("Goodbye!");
                break;
            }
        }
        scanner.close();
    }
}
