import java.util.Scanner;

// Main class to take input from the user and calculate factorials
public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console
        System.out.println("Enter integers to calculate their factorials:"); // Prompt the user to enter integers
        String[] input = scanner.nextLine().split("\\s+"); // Read the input line and split it into an array of strings based on whitespace

        // Iterate through each input value
        for (String arg : input) {
            try {
                int num = Integer.parseInt(arg); // Convert the string input to an integer
                int fact = FactorialCalculator.factorial(num); // Calculate the factorial of the integer
                System.out.println("Factorial of " + num + " is: " + fact); // Print the factorial result
            } catch (NumberFormatException e) { // Catch if the input is not a valid integer
                System.out.println("Invalid input: " + arg + " is not a valid integer");
            } catch (FactorialException e) { // Catch any exception thrown by the FactorialCalculator class
                System.out.println(e.toString()); // Print the error message
            }
        }
        scanner.close(); // Close the scanner to prevent resource leak
    }
}