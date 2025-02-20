import java.util.*;
class Solution {
  public int largestRectangleArea(int[] heights) {
      Stack<Integer> s = new Stack<>();
      int ans = 0;
      for(int i = 0; i<=heights.length; i++){
          int temp = 0;
          if(i != heights.length) temp = heights[i];
          while(s.size()>0 && temp < heights[s.peek()]){
              int tbs = s.pop();
              int nsr = i;
              int x1 = nsr-1;
              int nsl = -1;
              if(s.size() != 0) nsl = s.peek();
              int x2 = nsl+1;
              int area = heights[tbs] * (x1 -x2 +1);
              ans = Math.max(ans,area);
          }
          s.push(i);
      }
      return ans;
  }
}

public class LargestTrct {
  
    public static void main(String[] args) {
        // Example input for heights
        int[] heights = {2, 1, 5, 6, 2, 3};
        
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Call the largestRectangleArea method and print the result
        int result = solution.largestRectangleArea(heights);
        
        // Print the result
        System.out.println("Largest Rectangle Area: " + result);
    }
}
