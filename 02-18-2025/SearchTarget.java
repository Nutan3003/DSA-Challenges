class Solution {
  public int search(int[] nums, int target) {
      int lo=0;
      int hi=nums.length-1;
      while(lo<=hi){
          int m=lo+(hi-lo)/2;
          if(nums[m]==target){
              return m;
          }
          if(nums[m]<=nums[hi]){
              if(target>=nums[m] && target<=nums[hi]){
                  lo=m+1;
              }else{
                  hi=m-1;
              }
          }else{
               if(target>=nums[lo] && target<=nums[m]){
                  hi=m-1;
              }else{
                  lo=m+1;
              }

          }
      }
      return -1;
      
  }
}  
public class SearchTarget {
  public static void main(String[] args) {
      // Example array and target value to test
      Solution solution = new Solution();
      
      // Test case 1
      int[] nums1 = {4,5,6,7,0,1,2};
      int target1 = 0;
      System.out.println("Index of target " + target1 + ": " + solution.search(nums1, target1));  // Expected output: 4
      
     
  }
}
