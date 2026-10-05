	import java.util.Scanner;
	import java.util.Random;

public class GuessMyNumber{
	public static void main (String[] args){
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		
		Scanner in = new Scanner(System.in);
		
		int numGuess = 0;
		
		System.out.println("I'm thinking of a number from 1 to 100. Can you guess what it is?");
		System.out.print("Type your number: ");
		
		int guess = in.nextInt();
					in.nextLine();
		
		guess(guess, number, numGuess, in);
		
	}
	
	public static void guess(int guess, int number, int numGuess, Scanner in){
		if (guess == number) {
			System.out.println("You win! The number was " + number);
		} else if (numGuess < 2) {
			if (guess > number){
			System.out.print("Nope! Try again! You're to high.");
			}else if (guess < number){
			System.out.print("Nope! Try again! You're to low.");
		}
			guess = in.nextInt();
					in.nextLine();
			numGuess += 1;
			guess(guess, number, numGuess, in);
		} else if (numGuess >= 2 && guess != number){
		 System.out.println("You lost! The number was " + number);
	 }
	}
}
