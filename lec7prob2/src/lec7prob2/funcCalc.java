package lec7prob2;
import java.util.Scanner;

public class funcCalc {
	public static int Add(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	public static int Sub(int num1, int num2) {
		int sum = num1-num2;
		return sum;
	}
	public static int Multi(int num1, int num2) {
		int sum = num1*num2;
		return sum;
	}
	public static int Divi(int num1, int num2) {
		int sum = num1/num2;
		return sum;
	}

	public static void main(String[] args) {
		while (true) {
		int num1, num2, decision, sum, result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter num1: ");
		num1 = s.nextInt();
		
		System.out.println("Please enter num2: ");
		num2 = s.nextInt();
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter your decision: ");
		decision = s.nextInt();
		
		switch (decision) {
		case 1: 
			 result = Add(num1,num2);
			System.out.println(result);
			break;
		case 2:
			 result = Sub(num1,num2);
			System.out.println(result);
			break;
		case 3:
			 result = Multi(num1,num2);
			System.out.println(result);
			break;
		case 4:
			 result = Divi(num1,num2);
			System.out.println(result);
			break;
		}
		}
	}

}
