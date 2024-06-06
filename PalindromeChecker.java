import java.util.Scanner;


// Explanation

// Input Handling: The program reads input from the user using a Scanner.
// Normalization:
// Convert the input string to lowercase to ensure case insensitivity.
// Use a StringBuilder to build a new string that contains only the alphabetic characters from the input string.
// Palindrome Check:
// Convert the StringBuilder to a string.
// Compare this string to its reverse to determine if it's a palindrome.



public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or phrase: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        StringBuilder normalized = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                normalized.append(c);
            }
        }
        String normalizedString = normalized.toString();
        return normalizedString.equals(normalized.reverse().toString());
    }
}
