import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 *
 * Queue (FIFO - First In First Out)
 * Stack (LIFO - Last In First Out)
 *
 * @author Developer
 * @version 6.0
 */

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "civic";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare until queue becomes empty
        while (!queue.isEmpty()) {

            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}