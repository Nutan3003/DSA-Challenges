//Solution using the time complexity O(N)  and space complexity O(N)
import java.util.Collection;
import java.util.HashMap;
class Solution {
  public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer>hm=new HashMap<>();
      for(int i=0;i<nums.length;i++){
          int complement=target-nums[i];
          if(hm.containsKey(complement)){
              return new int[]{hm.get(complement),i};
          }
          hm.put(nums[i],i);

      }
  return new int[]{};
  }
}
public class Two_sum {
  public static void main(String[] args) {
    Solution solution = new Solution();
    
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] result = solution.twoSum(nums, target);
    
    System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 0, 1
}
}