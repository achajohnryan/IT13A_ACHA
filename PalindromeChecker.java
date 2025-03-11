import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        
        Scanner acha = new Scanner(System.in);

        
        System.out.print("Enter first word: ");
        String potpot1 = acha.nextLine();

      
        System.out.print("Enter second word: ");
        String potpot2 = acha.nextLine();

        
        if (isPalindrome(potpot1)) {
            System.out.println(potpot1 + " is a palindrome.");
        } else {
            System.out.println(potpot1 + " is not a palindrome.");
        }

        if (isPalindrome(potpot2)) {
            System.out.println(potpot2 + " is a palindrome.");
        } else {
            System.out.println(potpot2 + " is not a palindrome.");
        }

     
        acha.close();
    }

    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false; 
            }
        }
        return true; 
    }
}