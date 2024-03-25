package lec4prob1;
import java.util.Scanner;
public class tollCalc {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the time in 24-hour format (hh:mm): ");
        String input = scanner.nextLine();
        
        String[] parts = input.split(":");
        
        if (parts.length == 2) {
            try {
                int hours = Integer.parseInt(parts[0]);
                int minutes = Integer.parseInt(parts[1]);
                
                if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59) {
                    int totalMinutes = hours * 60 + minutes;
                    System.out.println("Total minutes since midnight: " + totalMinutes);
                } else {
                    System.out.println("Invalid time input. Please enter a valid time in 24-hour format.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Please enter the time in hh:mm format.");
            }
        } else {
            System.out.println("Invalid input format. Please enter the time in hh:mm format.");
        }
        
        scanner.close();
    }

}
