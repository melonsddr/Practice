import java.util.Scanner;

public class letterfrequency {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello this is a letter frequency counter program!"); // Print a welcome message
        System.out.println("This program counts the frequency of each letter in a given string."); // Explain the program's purpose
        System.out.println("Note: Non letter characters are ignored."); // Inform the user about non-letter character handling
        System.out.println("Note: Displays only letter that has been counted and it is case insensitive."); // Inform the user about the display of counted letters and the case insensitivity
        System.out.println("--------------------------------------------------"); //line break for aesthetic purposes
        System.out.println("Enter a string: "); // Prompt the user for input
        int[] letterCounts = new int[26]; // Array to store the frequency of each letter all the 26 letters
        Scanner input = new Scanner(System.in);// Create a Scanner object to read input from the console
        String userInput = input.nextLine(); // Read input as a string
        input.close(); // Close the scanner
        // Process the input string to count letter frequencies
        // Loop through each character in the input string
        System.out.println("--------------------------------------------------"); //line break for aesthetic purposes
        for (char letter : userInput.toCharArray()) {
            if (Character.isLetter(letter)) { // Ensure it's a letter 
                int index = Character.toUpperCase(letter) - 'A'; // Compute index for the letter (0 for 'A', 1 for 'B', ..., 25 for 'Z')
                letterCounts[index]++; // Increment count for each letters
            }
        }
        // Display results to the user
        System.out.println("Letter frequency count:"); // Print header for results
        // Loop through the letterCounts array to display frequencies for letters
        for (int i = 0; i < letterCounts.length; i++) { 
            if (letterCounts[i] > 0) {
                System.out.println( (i+1) + ". " +  (char)(i + 'A' ) +  ": " + letterCounts[i]); 
                /* (char)(i + 'A' )  i + 'A' is the one that adds value to i = 0 which 'A' is 65 in ASCII table
                * and 66 is 'B' until 90 which is 'Z'. which matches the mapping of 0-25 to A-Z.
                * While (char) converts the int value back to a char.
                */
            }
        }
        System.out.println("--------------------------------------------------"); //line break for aesthetic purposes
        // Printing messages at end of the program
        System.out.println("Letter frequency count completed!"); 
        System.out.println("Thank you for using the letter frequency counter program!"); 
        System.out.println("--------------------------------------------------"); //line break for aesthetic purposes
    }
}
