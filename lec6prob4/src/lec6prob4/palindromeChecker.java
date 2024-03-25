package lec6prob4;
import java.util.Scanner;

public class palindromeChecker {

    public static void main(String[] args) {
        String testString, tempString = " ";
        Scanner s = new Scanner(System.in);
        System.out.println("----------- Palindrome Checker -----------");
        System.out.println("Please enter a string you would like to check: ");
        testString = s.nextLine();

        testString = testString.replaceAll("\\s", "").toLowerCase();

        if (isPalindrome(testString)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
