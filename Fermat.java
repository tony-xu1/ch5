public class Fermat {
	public static void main (String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int n = 4;
		double ans = Math.pow(a, n) + Math.pow(b, n);
		
		if (c > 2 && ans == Math.pow(c, n)){
			System.out.println("Holy smokes, Fermat was wrong!");
		} else {
			System.out.println("No, that doesn’t work.");
		}
	
}
}
