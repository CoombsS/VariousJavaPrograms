package lec6prob3;
import java.util.Scanner;
public class vowelOrConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char letter = ' ';
		System.out.println("Please enter a letter");
		letter = s.next().charAt(0);
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o'||letter == 'u'|| letter == 'y') {
			System.out.println(letter+ " is a vowel");
		}else {
			System.out.println(letter+ " is a constant");
		}
			
			

	}

}
