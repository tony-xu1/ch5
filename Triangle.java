public class Triangle{
	public static void main (String[] args){
		int a = 12;
		int b = 1;
		int c = 1;
		
		if(Math.max(a, Math.max(b, c)) > (a + b + c) - Math.max(a, Math.max(b, c))){
			System.out.println("NO YOU CAN'T!");
		} else System.out.println("YES YOU CAN!");
		
	}
}
