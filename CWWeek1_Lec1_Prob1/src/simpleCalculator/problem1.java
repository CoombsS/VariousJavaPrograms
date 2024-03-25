package simpleCalculator;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int a = s.nextInt();
		System.out.println("Please enter the second number: ");
		int b = s.nextInt();
		System.out.println("Please enter the opperation to be done (+,-,*,/): ");
		char op = s.next().charAt(0);
		switch (op) {
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '+':
			System.out.println(a+b);
			break;
		}
		
		
		
		
	}

}
