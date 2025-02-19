import java.util.HashMap;

public class Q6 {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        printResult(nums1, target1);

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        printResult(nums2, target2);

        int[] nums3 = {3, 3};
        int target3 = 6;
        printResult(nums3, target3);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement exists in map, return indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store the current number and its index
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // Should never reach here due to problem constraints
    }

    // Helper method to print the result
    private static void printResult(int[] nums, int target) {
        int[] result = twoSum(nums, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
