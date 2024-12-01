
class Solution {
  public boolean checkBit(int n,int i){
     return (n & (1 << i)) != 0;
  }
  public int[] singleNumber(int[] nums) {
      int v=0;
      for(int i=0;i<nums.length;i++){
          v=v^nums[i];
      }

      int ind=0;
      for(int i=0;i<32;i++){
          if(checkBit(v,i)==true){
              ind=i;
              break;
          }
      }

      int set1=0; 
      int set2=0;
       for(int i=0;i<nums.length;i++){
         int num=nums[i];
         if(checkBit(num,ind)==true){
          set2=set2^num;
         }else{
           set1=set1^num;
         }
      }
return new int[]{set1, set2};
  }
}
public class SingleNumberIII {
  
  public static void main(String[] args) {
    Solution solution = new Solution();

    int[] nums = {4, 1, 2, 1, 2, 3};
    int[] result = solution.singleNumber(nums);

    System.out.println("Two unique numbers: " + result[0] + " and " + result[1]);
}
}