//Solution using the time complexity O(N^2)  and space complexity O(1)
class Solution {
  public int[] twoSum(int[] nums, int target) {
    for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;i++){
        if(nums[i]+nums[j]==target){
          return new int[]{i,j};
        }
      }
    }
    return new int[]{};
  }
}
public class Two_sum1 {
  public static void main(String[] args) {
    Solution solution = new Solution();
    
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] result = solution.twoSum(nums, target);
    
    System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 0, 1
}
}
