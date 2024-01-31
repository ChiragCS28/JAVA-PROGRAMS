import java.util.*;
import java.math.BigInteger;

class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n-th Fibonacci number you want to obtain:");
        int n = sc.nextInt();
        
        // Call the fibonacci method and print the result
        System.out.println(fibonacci(n));
    }
    
    // Method to calculate the n-th Fibonacci number
    public static BigInteger fibonacci(int n) {
        // Initialize the first two Fibonacci numbers
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(0);
        
        // Handle base cases for n equals 1 and 2
        if (n == 1) {
            return a;
        }
        if (n == 2) {
            return b;
        }
        
        // Calculate the Fibonacci number for n greater than 2
        if (n > 2) {
            for (int i = 1; i <= n - 2; i++) {
                // Calculate the next Fibonacci number in the sequence
                c = a.add(b);
                
                // Update a and b for the next iteration
                a = b;
                b = c;
            }
        }
        
        // Return the final Fibonacci number
        return c;
    }
}
