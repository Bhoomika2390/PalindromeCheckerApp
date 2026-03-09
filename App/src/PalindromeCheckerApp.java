// UC13 - Performance Comparison of Palindrome Algorithms

import java.util.Stack;

public class PalindromeCheckerApp {

    // Method 1: Reverse String
    public static boolean reverseCheck(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Method 2: Stack Method
    public static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "racecar";

        // Reverse Method timing
        long start1 = System.nanoTime();
        boolean result1 = reverseCheck(input);
        long end1 = System.nanoTime();

        // Stack Method timing
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println("Reverse Method Result : " + result1);
        System.out.println("Reverse Method Time : " + (end1 - start1) + " ns");

        System.out.println();

        System.out.println("Stack Method Result : " + result2);
        System.out.println("Stack Method Time : " + (end2 - start2) + " ns");
    }
}