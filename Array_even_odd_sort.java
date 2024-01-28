//Sorts the input array into two separate arrays based on whether the elements are even or odd and then combines them in a specific order.

import java.util.Scanner;
class ArrayEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        // Create an array to store the elements
        int[] a = new int[n];

        // Read the elements of the array
        System.out.println("Enter the elements of the Array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Count the number of even and odd elements
        int even = 0;
        int odd = 0;
        for (int j = 0; j < n; j++) {
            if (a[j] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Create arrays to store even and odd elements
        int[] evenArray = new int[even];
        int[] oddArray = new int[odd];

        // Separate even and odd elements into their respective arrays
        int l = 0;
        int m = 0;
        for (int k = 0; k < n; k++) {
            if (a[k] % 2 == 0) {
                evenArray[l] = a[k];
                l++;
            } else {
                oddArray[m] = a[k];
                m++;
            }
        }

        // Create a new array to store the final result
        int[] resultArray = new int[n];

        // Copy even elements to the final array
        for (int p = 0; p < even; p++) {
            resultArray[p] = evenArray[p];
        }

        // Copy odd elements to the final array
        for (int q = 0; q < odd; q++) {
            resultArray[even] = oddArray[q];
            even = even + 1; // Move the position to the next index
        }

        // Display the final array
        System.out.println("Resulting Array:");
        for (int r = 0; r < n; r++) {
            System.out.print(resultArray[r] + " ");
        }
    }
}
