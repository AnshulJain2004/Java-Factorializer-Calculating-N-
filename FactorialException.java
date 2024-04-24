// Custom exception class for factorial calculation errors
class FactorialException extends Exception {
    private int num; // Variable to store the invalid number causing the exception

    // Constructor to initialize the exception with the invalid number
    public FactorialException(int num) {
        // Call the superclass constructor with a descriptive error message
        super("Invalid input: Factorial is not defined for this number");
        this.num = num; // Assign the invalid number to the instance variable
    }

    // Override the toString() method to provide a custom string representation of the exception
    @Override
    public String toString() {
        // Return a string combining the superclass message and the invalid number
        return super.getMessage() + " - Number: " + num;
    }
}