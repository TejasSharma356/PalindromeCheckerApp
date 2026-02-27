/**
 * MAIN CLASS: PalindromeCheckerApp
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * Check palindrome using recursion
 *
 * Key Concepts Used:
 * Recursion – A technique where a method calls itself to solve smaller subproblems.
 * Base Condition – Prevents infinite recursion and terminates the recursive calls.
 * Call Stack – Memory structure used to manage method calls during recursion.
 *
 * @author Tejas Sharma
 * @version 8.0
 */

import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {


    public static void main(String[] args){

        // String to be checked
        String word = "level";

        // Call recursive palindrome check
        boolean isPalindrome = isPalindrome(word, 0, word.length() - 1);

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }

    // Recursive method to check palindrome
    private static boolean isPalindrome(String word, int start, int end) {

        // Base condition: pointers crossed or met
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        // Recursive call with reduced problem
        return isPalindrome(word, start + 1, end - 1);
    }
}