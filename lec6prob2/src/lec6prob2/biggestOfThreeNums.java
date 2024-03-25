package lec6prob2;
import java.util.Scanner;
public class biggestOfThreeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Please enter 3 numbers, each seperated by an enter: ");
		num1 = s.nextInt();
		num2 = s.nextInt();
		num3 = s.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 +" is biggest");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2+ " is biggest");
		}else if (num3 >num1 && num3> num2) {
			System.out.println(num3+ " is biggest");
		}else {
			System.out.println("All numbers are equal");
		}
	}

}
