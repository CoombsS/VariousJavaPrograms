package lec7prob1;
import java.util.Scanner;

public class largestInArray {
	
	public static int largestNum(int list[],int len) {
		int temp =0;
		int result=0;
		for (int i=0;i<len;i++ ) {
			if (list[i]>temp) {
				temp = list[i];
			}
			result = temp;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num, len, result = 0;
		
		System.out.println("Largest in a list calculator");
		System.out.println("Please enter the amount of numbers in the list: ");
		len = s.nextInt();
		int list[] = new int[len];
		System.out.println("Enter the numbers");
		for (int i=0; i<len; i++) {
			list[i]=s.nextInt();
		}
		 result = largestNum( list, len);
		 System.out.println(result);
	}

}
