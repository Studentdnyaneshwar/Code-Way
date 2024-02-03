package task;
import java.util.Scanner;
public class NumGuessingGame_codway {

		public static void main(String[] args) {
			
			// Generate a random number between 1 and 100
			// we do here type casting 
			        int randomNumber = (int) (Math.random() * 100) + 1;

			        // Create a Scanner object to read user input
			        Scanner scanner = new Scanner(System.in);

			        // Start the game loop
			        boolean guessedCorrectly = false;
			        int numberOfAttempts = 0;
			        System.out.println("Guess a number between 1 and 100: \n"+
			      "System Generated Number is "+randomNumber);

			        
			        while (!guessedCorrectly && numberOfAttempts < 10) 
			        {
			            // Prompt the user to guess a number
			           
			            // Get the user's guess
			        //	System.out.println("Enter your Guess number");
			            int userGuess = scanner.nextInt();

			            // Check if the user guessed correctly
			            if (userGuess == randomNumber) 
			            {
			                guessedCorrectly = true;
			            } 
			            else 
			            {
			                numberOfAttempts++;
			                if (userGuess > randomNumber) 
			                {
			                    System.out.println("Your guess is too high.");
			                } else 
			                {
			                    System.out.println("Your guess is too low.");
			                }
			            }
			        }

			        // Close the Scanner object
			        scanner.close();

			        // If the user guessed correctly, congratulate them. Otherwise, tell them the correct answer.
			        if (guessedCorrectly) 
			        {
			            System.out.println("Congratulations! You guessed correctly! The number was " + randomNumber);
			        } else 
			        {
			            System.out.println("Sorry, you ran out of guesses. The correct answer was " + randomNumber);
			        }
			    // this switch case for Display score
			      switch (numberOfAttempts) {
				case 0:
					System.out.println("Your score :"+100);
					System.out.println("Number Of Attempts: :"+(numberOfAttempts+1));
					break;
				case 1:
					System.out.println("Your score :"+90);
					System.out.println("Number Of Attempts: :"+(numberOfAttempts+1));
					break;
				case 2:
					System.out.println("Your score :"+80);
					System.out.println("Number Of Attempts: :"+(numberOfAttempts+1));
					break;
				case 3:
					System.out.println("Your score :"+70);
					System.out.println("Number Of Attempts: :"+(numberOfAttempts+1));
					break;
				case 4:
					System.out.println("Your score :"+60);
					System.out.println("Number Of Attempts: :"+(numberOfAttempts+1));
					break;
				case 5:
					System.out.println("Your score :"+50);
					System.out.println("Number Of Attempts:"+(numberOfAttempts+1));
					break;
				case 6:
					System.out.println("Your score :"+40);
					System.out.println("Number Of Attempts::"+(numberOfAttempts+1));
					break;
				case 7:
					System.out.println("Your score :"+30);
					System.out.println("Number Of Attempts: :"+(numberOfAttempts+1));
					break;
				case 8:
					System.out.println("Your score :"+20);
					System.out.println("Number Of Attempts: :"+(numberOfAttempts+1));
					break;
				case 9:
					System.out.println("Your score :"+10);
					System.out.println("Number Of Attempts: :"+(numberOfAttempts+1));
					break;				
				}                                       	  			
			}						
		}

	

