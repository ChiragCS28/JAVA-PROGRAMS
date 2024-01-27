// An anagram is a word or phrase formed by rearranging the letters of another word or phrase, using all the original letters exactly once //

import java.util.Scanner;
import java.util.*;

class Anagram {
    public static void main(String[] args) {
        // Taking user input for two strings
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1:");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2:");
        String s2 = sc.nextLine();

        char[] a1 = s1.toCharArray();  // converting the string to an array of characters //
        char[] a2 = s2.toCharArray();

        // Sorting the character arrays
        Arrays.sort(a1); 
        Arrays.sort(a2);

        // Getting the length of the strings
        int n = s1.length();
        int m = s2.length();

        // Checking if the lengths are equal
        if (n != m) {
            System.out.println("not an anagram");
        } else {
            int count = 0;
            // Comparing each character of the sorted arrays
            for (int i = 0; i < n; i++) {
                if (a1[i] != a2[i]) {
                    System.out.println("not an anagram");
                    count++;
                    break;
                }
            }
            // If no mismatches found, it's an anagram
            if (count == 0) {
                System.out.println("an anagram");
            }
        }
    }
}
