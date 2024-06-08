import java.util.Scanner;


// Pseudocode for Password Strength Checker:
//Start
//
//Import the Scanner class for user input.
//Main Method
//
//Create a Scanner object to read user input.
//Prompt the user to enter a password.
//Read the password entered by the user.
//Call the checkPasswordStrength method with the entered password to determine its strength.
//Print the strength of the password.
//checkPasswordStrength Method
//
//Initialize a counter criteriaMet to 0 to keep track of how many strength criteria are met.
//
//Check Length Criteria
//
//If the length of the password is at least 8 characters, increment criteriaMet by 1.
//Check Uppercase Letter Criteria
//
//If the password contains at least one uppercase letter, increment criteriaMet by 1.
//Check Lowercase Letter Criteria
//
//If the password contains at least one lowercase letter, increment criteriaMet by 1.
//Check Digit Criteria
//
//If the password contains at least one digit, increment criteriaMet by 1.
//Check Special Character Criteria
//
//If the password contains at least one special character (e.g., !, @, #, $, %, etc.), increment criteriaMet by 1.
//Determine Password Strength Based on Criteria Met
//
//If criteriaMet is 5, return "Very Strong".
//If criteriaMet is 4, return "Strong".
//If criteriaMet is 3, return "Moderate".
//If criteriaMet is 2, return "Weak".
//If criteriaMet is 0 or 1, return "Very Weak".
//End

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password to check its strength: ");
        String password = scanner.nextLine();

        String strength = checkPasswordStrength(password);

        System.out.println("Password Strength: " + strength);
    }

    public static String checkPasswordStrength(String password) {
        int criteriaMet = 0;


        boolean lengthCriteria = password.length() >= 8;
        if (lengthCriteria) criteriaMet++;


        boolean uppercaseCriteria = password.matches(".*[A-Z].*");
        if (uppercaseCriteria) criteriaMet++;


        boolean lowercaseCriteria = password.matches(".*[a-z].*");
        if (lowercaseCriteria) criteriaMet++;


        boolean digitCriteria = password.matches(".*\\d.*");
        if (digitCriteria) criteriaMet++;


        boolean specialCharCriteria = password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        if (specialCharCriteria) criteriaMet++;

        switch (criteriaMet) {
            case 5:
                return "Very Strong";
            case 4:
                return "Strong";
            case 3:
                return "Moderate";
            case 2:
                return "Weak";
            default:
                return "Very Weak";
        }
    }
}
