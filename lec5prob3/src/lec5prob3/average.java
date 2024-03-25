package lec5prob3;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number of items in the list: ");
        int numItems = s.nextInt();
        double[] items = new double[numItems];
        System.out.println("Please enter the items: ");
        for (int i = 0; i < numItems; i++) {
            items[i] = s.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < numItems; i++) {
            sum += items[i];
        }
        double average = sum / numItems;
        System.out.println("The average of the " + numItems + " items is: " + average);       
    }
}
