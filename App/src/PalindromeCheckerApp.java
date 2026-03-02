// UC10 - Case-Insensitive & Space-Ignored Palindrome

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Step 1: Normalize string
        String normalized = input
                .replaceAll("[^a-zA-Z]", "")   // remove spaces & symbols
                .toLowerCase();                // convert to lowercase

        boolean isPalindrome = true;

        // Step 2: Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}