package lec5prob2;
import java.util.Scanner;
public class savingsWithInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i=0;
		
		System.out.println("Please enter the initial amount: ");
		float iAmount = s.nextFloat();
		System.out.println("Please enter the interest amount: ");
		float interest = s.nextFloat();
		System.out.println("Annual savings for 10 years: ");
		System.out.println(iAmount);
		for (i = 0; i<9; i++) {
			float savings = (iAmount*interest)+iAmount;
			System.out.println(savings);
			iAmount = savings;
		}
	}

}
