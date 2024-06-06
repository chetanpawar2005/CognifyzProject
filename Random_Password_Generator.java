import java.util.Random;
import java.util.Scanner;

// Explanation

// Reading User Input:

// We use Scanner to read input from the user.

// We prompt the user to enter the desired length of the password and whether they want to include numbers, lowercase letters, uppercase letters, and special characters.
// Generating the Password:
//
// We define character sets for numbers, lowercase letters, uppercase letters, and special characters.

// Based on the user's choices, we construct the character set for the password.

// We use Random to generate random indices and select characters from the character set to form the password.

// Displaying the Password:

// We display the generated password to the user.

public class Random_Password_Generator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();

        scanner.nextLine();

        // Prompt user for character types
        System.out.println("Include the following character types (Y/N):");
        System.out.print("Numbers (0-9): ");

        boolean includeNumbers = scanner.nextLine().equalsIgnoreCase("Y");
        System.out.print("Lowercase letters (a-z): ");

        boolean includeLowercase = scanner.nextLine().equalsIgnoreCase("Y");
        System.out.print("Uppercase letters (A-Z): ");

        boolean includeUppercase = scanner.nextLine().equalsIgnoreCase("Y");
        System.out.print("Special characters (!@#$%^&*): ");

        boolean includeSpecial = scanner.nextLine().equalsIgnoreCase("Y");

        // Generate password
        String password = generatePassword(length, includeNumbers, includeLowercase, includeUppercase, includeSpecial);

        // Display the password
        System.out.println("Generated password: " + password);

        scanner.close();
    }

    public static String generatePassword(int length, boolean includeNumbers, boolean includeLowercase, boolean includeUppercase, boolean includeSpecial) {

        String numbers = "0123456789";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "!@#$%^&*";


        StringBuilder charset = new StringBuilder();
        if (includeNumbers) {
            charset.append(numbers);
        }
        if (includeLowercase) {
            charset.append(lowercaseLetters);
        }
        if (includeUppercase) {
            charset.append(uppercaseLetters);
        }
        if (includeSpecial) {
            charset.append(specialCharacters);
        }

        Random random = new Random();a
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {

            int index = random.nextInt(charset.length());
            password.append(charset.charAt(index));

        }
        return password.toString();
    }
}
