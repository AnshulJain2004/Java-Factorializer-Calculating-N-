# **Java Factorializer: Calculating N!**  
This repository contains a simple yet robust Java-based command-line application that calculates the factorial of user-provided integers. It demonstrates core Java programming concepts, including exception handling through a custom `FactorialException` class, input validation, and modular code organization.

### Features
1. **Accurate Factorial Calculation**: Supports factorial calculations for integers in the valid range of 0 to 15.
2. **Custom Exception Handling**: Throws a `FactorialException` if the user input is negative or exceeds 15, showcasing how to implement and use custom exceptions.
3. **User-Friendly Input Parsing**: Processes multiple integer inputs in a single line, providing clear feedback for invalid inputs (like non-integer values).

### How It Works
1. **User Input**: The program reads a line of space-separated values from the console.
2. **Validation & Calculation**: 
   - Each value is parsed into an integer.
   - If valid, the program calculates the factorial using a loop (`FactorialCalculator.factorial`).
   - If the input is out of range or invalid, a meaningful exception or error message is displayed.
3. **Result Display**: Outputs each factorial result immediately, ensuring a clean and concise user experience.

### Code Overview
- **FactorialCalculator**: Contains the static `factorial(int n)` method that returns the factorial of a given integer within the valid range.
- **FactorialException**: A custom exception class storing the invalid number and providing a descriptive error message.
- **MainClass**: Gathers user input via `Scanner`, manages exception handling, and displays results or error messages.

### Getting Started
1. **Clone the Repository**:  
   ```bash
   git clone https://github.com/YourUsername/Java-Factorializer.git
   ```
2. **Compile the Code**:  
   ```bash
   javac MainClass.java FactorialCalculator.java FactorialException.java
   ```
3. **Run the Application**:  
   ```bash
   java MainClass
   ```
   Then enter multiple integers separated by spaces (e.g., `0 1 5 10 15`).

### Example
```
Enter integers to calculate their factorials:
4 7 16 -3 hello
Factorial of 4 is: 24
Factorial of 7 is: 5040
Invalid input: Factorial is not defined for this number - Number: 16
Invalid input: Factorial is not defined for this number - Number: -3
Invalid input: hello is not a valid integer
```

### Why This Project?
- Demonstrates fundamental Java concepts: loops, conditionals, parsing, custom exceptions, and modular class design.
- Ideal for beginners looking to explore exception handling in Java or those needing a lightweight factorial utility.

Feel free to explore, modify, and use this as a learning tool or a quick factorial calculator. Contributions and feedback are always welcome!
