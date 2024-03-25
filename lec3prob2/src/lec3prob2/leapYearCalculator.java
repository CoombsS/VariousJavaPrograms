package lec3prob2;
import java.util.Scanner;

public class leapYearCalculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int yr = s.nextInt();
        
        if ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }
        
        s.close(); // Don't forget to close the scanner when done.
    }
}
