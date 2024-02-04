import java.util.Scanner;

class reverseString {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        
        // Read the input string from the user
        String s = sc.nextLine();
        int n = s.length(); // Get the length of the string
        
        // Create an array to store each character of the string
        char[] arr = new char[n];
        
        // Store each character of the string in the array
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i);
        }
        
        int j = 0;
        
        // Create an array to store the reversed characters
        char[] rev = new char[n];
        
        // Iterate through the array in reverse order to reverse the characters
        for (int i = n - 1; i >= 0; i--) {
            rev[i] = arr[j];
            j++;
        }
        
        // Convert the array of reversed characters into a String
        String reverse = new String(rev);
        
        // Print the reversed string
        System.out.println(reverse);
    }
}
