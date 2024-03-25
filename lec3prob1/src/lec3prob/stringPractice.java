package lec3prob;
import java.util.Scanner;


public class stringPractice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String relative, food, adj, time = "";
		System.out.println("Please enter an relative: ");
		relative = s.nextLine();
		System.out.println("Please enter an food: ");
		food = s.nextLine();
		System.out.println("Please enter an adjetive: ");
		adj = s.nextLine();
		System.out.println("Please enter an time period: ");
		time = s.nextLine();
		System.out.println("My "+relative+" says eatting "+food+" every "+time+" makes me more "+adj+", so I eat them every other "+time+" now");;
	}

}
