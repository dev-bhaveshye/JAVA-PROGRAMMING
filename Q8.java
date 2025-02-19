public class Q8 {
    public static void main(String[] args) {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println("Output: " + strStr(haystack1, needle1)); // Expected: 0

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println("Output: " + strStr(haystack2, needle2)); // Expected: -1
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
