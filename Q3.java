import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Convert to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        // Using for loop
        if (isPalindromeForLoop(str)) {
            System.out.println("Palindrome (Checked using for loop)");
        } else {
            System.out.println("Not a Palindrome (Checked using for loop)");
        }

        // Using while loop
        if (isPalindromeWhileLoop(str)) {
            System.out.println("Palindrome (Checked using while loop)");
        } else {
            System.out.println("Not a Palindrome (Checked using while loop)");
        }

        // Using do-while loop
        if (isPalindromeDoWhileLoop(str)) {
            System.out.println("Palindrome (Checked using do-while loop)");
        } else {
            System.out.println("Not a Palindrome (Checked using do-while loop)");
        }

        scanner.close();
    }

    // Check palindrome using for loop
    public static boolean isPalindromeForLoop(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Check palindrome using while loop
    public static boolean isPalindromeWhileLoop(String str) {
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

    // Check palindrome using do-while loop
    public static boolean isPalindromeDoWhileLoop(String str) {
        int left = 0, right = str.length() - 1;
        do {
            if (left >= right) return true; // If pointers cross, it's a palindrome
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        } while (left < right);
        return true;
    }
}
