//This Java program takes a user-input string and a pattern, then it searches for occurrences of the pattern in the string. 
import java.util.Scanner;


class checkSubstring {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.println("Enter the string:");
        
        String txt = sc.nextLine();
        
        // Getting the length of the input string
        int n = txt.length();
        
        // Prompting the user to enter a pattern to be found
        System.out.println("Enter the pattern to be found:");
        
        String pat =  sc.nextLine();
        
        // Getting the length of the pattern
        int k = pat.length();
        
        // Extracting the first character of the pattern
        char x = pat.charAt(0);
        
        // Initializing a counter to keep track of pattern occurrences
        int count = 0;
        
        // Looping through the input string
        for (int i = 0; i <= n - k; i++) {
            // Checking if the current character matches the first character of the pattern
            if (txt.charAt(i) == x) {
                // Extracting a substring from the input string starting from the current index with length equal to pattern length
                String str = txt.substring(i, i + k);
                
                // Checking if the extracted substring is equal to the pattern
                if (str.equals(pat)) {
                    // Printing the starting index of the found pattern
                    System.out.println(i);
                    // Incrementing the counter
                    count++;
                }
            }
        }
        
        // Checking if no occurrences of the pattern were found
        if (count < 1) {
            // Printing a message indicating that the pattern was not found
            System.out.println("Pattern not found");
        }
    }
}
