package string;

import java.util.Scanner;

public class Palindrome {
    /*
  If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
  Palindrome. So write java code to check if a given String is Palindrome or not.
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string as an input to check whether it is palindrome or not");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome string");
        } else {
            System.out.println(input + " is not a palindrome string");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
