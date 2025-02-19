import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q10 {

    // Function to generate all unique permutations
    public static void permuteHelper(String s, int start, List<String> result, char[] charArray) {
        if (start == charArray.length) {
            result.add(new String(charArray));  // Add the current permutation to the result list
            return;
        }

        // Use a set to track duplicate characters
        boolean[] seen = new boolean[256]; // To track if a character has been used at the current level
        for (int i = start; i < charArray.length; i++) {
            // Skip if the character has been used already in this position
            if (seen[charArray[i]]) {
                continue;
            }
            seen[charArray[i]] = true;  // Mark the character as used

            // Swap the current character with the start character
            swap(charArray, start, i);

            // Recursively permute for the next position
            permuteHelper(s, start + 1, result, charArray);

            // Backtrack by swapping the characters back to their original positions
            swap(charArray, start, i);
        }
    }

    // Function to swap characters in the array
    private static void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

    // Function to generate unique permutations
    public static List<String> generateUniquePermutations(String s) {
        List<String> result = new ArrayList<>();
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray); // Sort the array to handle duplicates
        permuteHelper(s, 0, result, charArray);
        return result;
    }

    public static void main(String[] args) {
        String input = "AAB";
        List<String> permutations = generateUniquePermutations(input);

        System.out.println("Unique Permutations of " + input + " are:");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}