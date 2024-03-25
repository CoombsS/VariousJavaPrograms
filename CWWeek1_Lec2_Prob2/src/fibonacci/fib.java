package fibonacci;

import java.util.Scanner;

public class fib {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter how far you want the Fibonacci Series to go to: ");
		int limit = s.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		int counter = 0;
		System.out.println(a);
		System.out.println(b);
		while (counter<limit) {
			
				c = a+b;
				a=b;
				b=c;
				System.out.println(c);
				counter++;				
	}

}
}