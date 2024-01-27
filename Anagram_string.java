import java.util.Scanner;
import java.util.*;
class anagram{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String 1:");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2:");
        String s2 = sc.nextLine();
        
        char[]a1 = s1.toCharArray();  // converting the string to an array of characters //
        char[]a2 = s2.toCharArray();
        
        Arrays.sort(a1); // Sorting the arrays //
        Arrays.sort(a2);
        
        int n =s1.length();
        int m = s2.length();
        if(n!=m){
            System.out.println("not an anagram");
        }
        else{
            int count=0;
            for(int i=0;i<n;i++){
                if(a1[i]!=a2[i]){
                    System.out.println("not an anagram");
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("an anagram");
            }
        }
        
    }
}