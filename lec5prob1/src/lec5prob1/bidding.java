package lec5prob1;
import java.util.Scanner;
public class bidding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int bid = 3;
		String ans = "y";
		while(ans.equals("y")) {
			System.out.println("I'll bid $"+bid);
			System.out.println("Continue bidding? (y/n)");
			ans = s.nextLine();
			bid = bid +3;
		}
		System.out.println("Goodbye!");
	}

}
