class Solution {
  public int waysToSplitArray(int[] nums) {
      int n=nums.length;
      long totalSum=0;
      for(int num:nums){
         totalSum += num;

      }
      long leftSum=0;
      int count=0;
      for(int i=0;i<n-1;i++){
          leftSum =leftSum+nums[i];
          long rightSum=totalSum-leftSum;
          if(leftSum>=rightSum){
              count++;
          }

      }
      return count;
  }
}
public class WayToSplit{
 
    public static void main(String[] args) {
    Solution vs = new Solution();
      
      // Test case 1: Small array
      int[] nums1 = {0, -1, -2, -3, -4};
      System.out.println("Valid splits for nums1: " + vs.waysToSplitArray(nums1)); // Expected output: 0

      // Test case 2: Large array
      int[] nums2 = new int[200];
      for (int i = 0; i < nums2.length; i++) {
          nums2[i] = -i; // Populate the array as [0, -1, -2, ..., -199]
      }
      System.out.println("Valid splits for nums2: " + vs.waysToSplitArray(nums2));

      // Test case 3: All zeros
      int[] nums3 = {0, 0, 0, 0, 0};
      System.out.println("Valid splits for nums3: " + vs.waysToSplitArray(nums3)); // Expected output: 4

      // Test case 4: Mixed positive and negative
      int[] nums4 = {1, 2, -3, 4, -5, 6};
      System.out.println("Valid splits for nums4: " + vs.waysToSplitArray(nums4));
  }
}
 