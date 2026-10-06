import java.util.Scanner;

public class Quadratic{
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	double ans1, ans2;
	System.out.print("What is your a value?");
		int a = in.nextInt();
			in.nextLine();
	System.out.print("What is you b value?");
		int b = in.nextInt();
			in.nextLine();
	System.out.print("What is your c value?");
		int c = in.nextInt();
			in.nextLine();
	int discriminant = b * b - 4 * a * c;
		if (discriminant < 0 && a != 0){
			System.out.println("No solutions, the discriminant cannot be negative.");
		} else if (discriminant == 0 && a != 0){
			ans1 = (double) (-1 * b) / (2 * a);
			System.out.println("The answer is " + ans1 + ".");
		} else if (a != 0){
			ans1 = (double) ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
			ans2 = (double) ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("The answers are " + ans1 + " and " + ans2 + ".");
		} else {
			ans1 = (double) (-1 * c) / b;
			System.out.println("The answer is " + ans1 + ".");
		}
	}
}
