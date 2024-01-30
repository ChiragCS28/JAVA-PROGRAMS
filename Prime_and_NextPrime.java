//code checks if a given number is prime using probabilistic testing and finds the next prime number after a specified value using BigInteger methods.
import java.util.*;
import java.math.BigInteger;

class PrimeandNextPrime {
    
    // Main method to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user for the number to be checked
        System.out.println("Enter the number to be checked:");
        int n = sc.nextInt();
        
        // Calling isPrime method to check if the entered number is prime
        System.out.println(isPrime(n));

        // Taking input from the user for the value after which they want the next prime
        System.out.println("Enter the value after which you want the prime:");
        int a = sc.nextInt();
        
        // Calling nextPrime method to find the next prime after the entered value
        System.out.println(nextPrime(a));
    }
    
    // Method to check if a given number is prime
    public static boolean isPrime(int n) {
        // Creating a BigInteger object from the input integer
        BigInteger b = BigInteger.valueOf(n);
        
        // Using isProbablePrime method to check if the number is prime (80 is the certainty parameter)
        return b.isProbablePrime(80);
    }
    
    // Method to find the next prime after a given value
    public static BigInteger nextPrime(int a) {
        // Creating a BigInteger object from the input integer
        BigInteger b = BigInteger.valueOf(a);
        
        // Using nextProbablePrime method to find the next prime number after the input value
        return b.nextProbablePrime();
    }
}
