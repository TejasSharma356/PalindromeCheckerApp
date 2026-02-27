/**
 * MAIN CLASS: PalindromeCheckerApp
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * Ignore spaces and case while checking a palindrome.
 *
 * Key Concepts Used:
 * String preprocessing
 * Regular expressions
 *
 * @author Tejas Sharma
 * @version 10.0
 */

import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {


    public static void main(String[] args){

        // Input string with spaces and mixed case
        String input = "Never Odd Or Even";

        // Normalize the string:
        // 1. Convert to lowercase
        // 2. Remove all spaces using regex
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Palindrome check using two-pointer approach
        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome");
        }
    }
}