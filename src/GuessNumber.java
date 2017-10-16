import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GuessNumber {

	// "Field" Very important is "Scope"
	// "Public" means any other class has access; usually BAD
	// "Private" means only used inside of this class, usually good
	// "Protected" means can be used by any other class in this package
	// default is protected
	private int lowerLimit = 0;
	private int upperLimit = 10;

	Random rand = new Random();

	Scanner keyboard = new Scanner(System.in);

	/*
	 * 1. set lower and upper bounds on the numbers, like 0 - 10 2. pick a random
	 * number in that range 3. start looping -- -- Guess -- check for win also give
	 * high or low feedback -- if win congrats! -- in no win repeat -- set a guess
	 * limit, like after 5 tries, game over
	 */

	public GuessNumber() {

	} // end of constructor

	public void startGame() {

		// method scope
		// Boolean gameOver = false;
		Boolean gameRunning = true;
		int guess;
		int countLimit = 5;
		String startMsg = "";
		String enterGuess = "";
		String typedGuess = "";
		//String testCountLimit = "";
		String win = "";
		String tooLow = "";
		String tooHigh = "";
		String allDone = "";

		// get a new random number
		// example of "method scope" -- can only exist inside of this method
		int answer = rand.nextInt(upperLimit) + lowerLimit;

		//System.out.println("...for testing answer =" + answer);

		startMsg = "for testing: answer = " + answer;
		JOptionPane.showMessageDialog(null, startMsg);
		
		// upperLimit - 1 because it is exclusive, stops one number before

		// later: test for bounds

		// check for a win
		// Yo! Pay attention! == is a test operator, always used in if's
		while (gameRunning && countLimit > 0) {
			//System.out.println("\nPlease enter your guess, between " + lowerLimit + " and " + (upperLimit - 1));
			
			enterGuess = "Please enter your guess, between " + lowerLimit + " and " + (upperLimit - 1);
			
			
		    //guess = keyboard.nextInt();
			guess = Integer.parseInt(JOptionPane.showInputDialog(enterGuess));
			typedGuess = "\nGuess =" + guess + "\n";
			//System.out.println("\nGuess =" + guess + "\n");
			JOptionPane.showMessageDialog(null, typedGuess);
			
			
			//testCountLimit = "testing: countLimit = " + countLimit;
			//System.out.println("testing: countLimit = " + countLimit);
			//JOptionPane.showMessageDialog(null, testCountLimit);
			
			if (guess == answer) {
				//System.out.println("Congrats! You won!");
				win = "Congrats! You won!";
				JOptionPane.showMessageDialog(null, win);
				gameRunning = false;
			} else if (guess < answer) {
				//System.out.println("Sorry, your guess is too low");
				tooLow = "Sorry, your guess is too low";
				JOptionPane.showMessageDialog(null, tooLow);
			} else if (guess > answer) {
				//System.out.println("Sorry, your guess is too high");
				tooHigh = "Sorry, your guess is too high";
				JOptionPane.showMessageDialog(null, tooHigh);
			} else {
				System.out.println("Whaat?? I don't understand");
			}
			
			countLimit--;  // count down by one -- "decrement"(increment)
		} // end while

		
		// conditionals for custom comments
		
		if (countLimit == 4) {
			System.out.println("Nice, got it on first try!");
		} else if (countLimit == 3) {
			System.out.println("Second try, Nice!");
		}else if (countLimit == 2) {			
		System.out.println("Third try! good job!");
		}else if (countLimit == 1) {
			System.out.println("Nice, got it on fourth try!");
		}else {
			System.out.println("too bad, try again!");
		
		
		
		//System.out.println("\nAll Done, bye!"); }
		allDone = "All Done, bye!";
		JOptionPane.showMessageDialog(null, allDone);
		}
		
		

	} // end of for
} // end of startGame

// end of class

