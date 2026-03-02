// UC3 - Palindrome Check Using String Reverse

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";
        String reversed = "";

        // Reverse string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Original text: " + input);
        System.out.println("Reversed text: " + reversed);

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }
    }
}