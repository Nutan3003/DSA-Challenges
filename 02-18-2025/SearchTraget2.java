class Solution {
  public boolean search(int[] nums, int target) {
      int lo = 0;
      int hi = nums.length - 1;

      while (lo <= hi) {
          int m = lo + (hi - lo) / 2;

          if (nums[m] == target) {
              return true;
          }

          if (nums[lo] == nums[m] && nums[hi] == nums[m]) {
              lo++;
              hi--;
          } else if (nums[m] <= nums[hi]) {
              if (target >= nums[m] && target <= nums[hi]) {
                  lo = m + 1;
              } else {
                  hi = m - 1;
              }
          } else {
              if (target >= nums[lo] && target <= nums[m]) {
                  hi = m - 1;
              } else {
                  lo = m + 1;
              }
          }
      }

      return false;
  }
}

public class SearchTraget2 {
  public static void main(String[] args) {
      Solution solution = new Solution();

      // Test case 1
      int[] nums1 = {2, 5, 6, 0, 0, 1, 2};
      int target1 = 0;
      System.out.println(solution.search(nums1, target1)); // Expected output: true
  }
}
