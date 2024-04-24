// Class responsible for calculating factorial values
class FactorialCalculator {
    // Method to calculate the factorial of a given number
    public static int factorial(int n) throws FactorialException {
        // Check if the number is outside the valid range (0 to 15)
        if (n < 0 || n > 15) {
            // If so, throw a FactorialException with the invalid number
            throw new FactorialException(n);
        }

        // If the number is 0 or 1, return 1 (as per factorial definition)
        if (n == 0 || n == 1) {
            return 1;
        }

        // Initialize the result to 1
        int result = 1;

        // Loop through numbers from 2 to the given number
        for (int i = 2; i <= n; i++) {
            // Multiply the result by the current number
            result *= i;
        }

        // Return the final factorial result
        return result;
    }
}