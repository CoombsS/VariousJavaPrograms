package lec4prob2;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputWord = s.nextLine();
        System.out.print("Enter the number of substrings: ");
        int numSubstrings = s.nextInt();
        int substringLength = inputWord.length() / numSubstrings;
        int remainingCharacters = inputWord.length() % numSubstrings;
        int startIndex = 0;
        int endIndex = 0;
        System.out.println("Divided substrings:");
        for (int i = 0; i < numSubstrings; i++) {
            endIndex = startIndex + substringLength + (i < remainingCharacters ? 1 : 0);
            String substring = inputWord.substring(startIndex, endIndex);
            System.out.println(substring);
            startIndex = endIndex;
        }
    }
}
