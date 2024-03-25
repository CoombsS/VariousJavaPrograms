package lec6prob1;
import java.util.Scanner;

public class Fibonacci2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int limit = s.nextInt();
        int num1 = 1, num2 = 0, sum = 0;
        int count = 0;

        while (count < limit) {
            System.out.println(sum);
            sum = num1 + num2;
            num2 = num1;
            num1 = sum;
            count++;
        }
    }
}
