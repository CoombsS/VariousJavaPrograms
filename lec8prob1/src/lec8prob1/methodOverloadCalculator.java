package lec8prob1;
import java.util.Scanner;

public class methodOverloadCalculator {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static float add(float num1, float num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static float multiply(float num1, float num2) {
        return num1 * num2;
    }

    public static double divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
        }
        return (double) num1 / num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    public static float divide(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int num1, num2, decision;
            double result;

            System.out.println("Please enter num1: ");
            num1 = s.nextInt();

            System.out.println("Please enter num2: ");
            num2 = s.nextInt();

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter your decision: ");
            decision = s.nextInt();

            if (decision == 5) {
                System.out.println("Exiting the calculator.");
                break;
            }

            switch (decision) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue; // Restart the loop
            }

            System.out.println("Result: " + result);
        }
    }
}


 