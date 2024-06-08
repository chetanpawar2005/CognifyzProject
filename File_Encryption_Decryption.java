import java.io.*;
import java.util.Scanner;



// java.io.*: For file handling.
// java.util.Scanner: For user input.
// Main Method:
//
// Prompt the user to choose between encryption or decryption.
// Prompt the user to input the file name or path.
// Prompt the user to input the shift value for the Caesar cipher.
// Read the contents of the file using readFile method.
// Encrypt or decrypt the file contents based on the user's choice using encrypt or decrypt methods.
// Save the result to a new file using writeFile method.
// readFile Method:
//
// Reads the contents of a file and returns it as a string.
// writeFile Method:
//
// Writes the given content to a specified file.
// encrypt Method:
//
// Encrypts the text using a Caesar cipher with the given shift value.
// decrypt Method:
//
// Decrypts the text by using the Caesar cipher with the inverse shift value.
// How to Run the Program:
// Save the code to a file, for example, FileEncryptionDecryption.java.
// Open a terminal or command prompt.
// Navigate to the directory containing the FileEncryptionDecryption.java file.
// Compile the program by running javac FileEncryptionDecryption.java.
// Run the compiled program by executing java FileEncryptionDecryption.
// Follow the prompts to enter the choice (encryption or decryption), file name/path, and shift value.

public class File_Encryption_Decryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Do you want to encrypt or decrypt the file? (E/D): ");
        String choice = scanner.nextLine().toUpperCase();


        if (!choice.equals("E") && !choice.equals("D")) {
            System.out.println("Invalid choice. Please enter 'E' for encryption or 'D' for decryption.");
            return;
        }


        System.out.print("Enter the file name or path: ");
        String filePath = scanner.nextLine();


        System.out.print("Enter the shift value (integer): ");
        int shift = scanner.nextInt();


        String content = readFile(filePath);
        if (content == null) {
            System.out.println("Error reading the file.");
            return;
        }


        String result;
        if (choice.equals("E")) {
            result = encrypt(content, shift);
            System.out.println("File encrypted successfully.");
        } else {
            result = decrypt(content, shift);
            System.out.println("File decrypted successfully.");
        }


        String outputFilePath = filePath + (choice.equals("E") ? ".enc" : ".dec");
        boolean isSaved = writeFile(outputFilePath, result);
        if (isSaved) {
            System.out.println("Result saved to: " + outputFilePath);
        } else {
            System.out.println("Error saving the file.");
        }
    }


    public static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return content.toString();
    }


    public static boolean writeFile(String filePath, String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(content);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                character = (char) ((character - base + shift) % 26 + base);
            }
            result.append(character);
        }
        return result.toString();
    }


    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }

}
