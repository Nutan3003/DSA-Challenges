import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int sp = 0;
        int ep = n - 1;
        while (sp <= ep) {
            if (nums[sp] + nums[ep] == target) {
                return new int[]{sp, ep};
            } else if (nums[sp] + nums[ep] > target) {
                ep--;
            } else {
                sp++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        
        // Test case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Test case 1: " + Arrays.toString(result1));

        // Test case 2
        int[] nums2 = {1, 2, 3, 4, 5};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Test case 2: " + Arrays.toString(result2));
        
        // Test case 3 (No solution)
        int[] nums3 = {1, 3, 5, 7};
        int target3 = 20;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Test case 3: " + Arrays.toString(result3)); // Should return an empty array
    }
}
