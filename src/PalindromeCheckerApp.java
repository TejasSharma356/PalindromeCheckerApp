/**
 * MAIN CLASS: PalindromeCheckerApp
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * Encapsulate palindrome logic in a class.
 *
 * Key Concepts Used:
 * Encapsulation
 * Single Responsibility Principle
 *
 * @author Tejas Sharma
 * @version 11.0
 */

import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {


    public static void main(String[] args){

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker();

        // Input string
        String input = "madam";

        // Check palindrome
        boolean result = checker.checkPalindrome(input);

        // Display result
        if (result) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }

    // Palindrome service class (Encapsulation)
    class PalindromeChecker {

        // Public method to check palindrome
        public boolean checkPalindrome(String word) {

            // Convert string to char array (internal data structure)
            char[] characters = word.toCharArray();

            int start = 0;
            int end = characters.length - 1;

            // Two-pointer comparison
            while (start < end) {
                if (characters[start] != characters[end]) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }

}