//A palindrome string is a string that reads the same backward as forward.
import java.util.Scanner;

class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        // Find the length of the string
        int n = s.length();

        // Convert the string to a character array
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i);
        }

        // Create a reversed version of the character array
        int j = 0;
        char[] arr1 = new char[n];
        for (int i = n - 1; i >= 0; i--) {
            arr1[i] = s.charAt(j);
            j++;
        }

        // Check if the original and reversed arrays are equal
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr1[i]) {
                // If a mismatch is found, it's not a palindrome
                System.out.println("Not a palindrome");
                count++;
                break;
            }
        }

        // If no mismatch is found, it's a palindrome
        if (count == 0) {
            System.out.println("Palindrome");
        }
    }
}
