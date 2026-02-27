/**
 * MAIN CLASS: UseCase1; PalindromeCheckerApp
 * Use Case 1: Hardcoded palindrome message
 *
 * Description: This class shows the basic palindrome validation using a hardcode string value
 *  *
 *  * At this stage, the application consists of:
 *  *  - It stores predefined value
 *  *  - Compares characters from both ends of the string
 *  *  - Checks if the result is a palindrome or not. Finally displays the result
 *  *
 *  *  palindrome logic has been implemented
 *  *
 *  *
 *  * @author Tejas Sharma
 *  * @version 1.5
 *
 * */

public class PalindromeCheckerApp {
    /**
     *Palindrome
     * */
    public static void main(String[] args){

        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
