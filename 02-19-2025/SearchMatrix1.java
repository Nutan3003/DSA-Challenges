
class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
      int n=matrix.length;
      int m=matrix[0].length;
      int lo=0;
      int hi=n*m-1;
      while(lo<=hi){
          int mid=(hi+lo)/2;
          int r=mid/m;
          int c=mid%m;

          if(matrix[r][c]==target){
              return true;
          }else if(matrix[r][c]<target){
              lo=mid+1;
          }else{
              hi=mid-1;
          }
      }
      return false;
      
  }
}
public class SearchMatrix1 {
  
    public static void main(String[] args) {
        // Create an instance of Solution class
        Solution solution = new Solution();
        
        // Example matrix (sorted in ascending order)
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        
        // Define target value to search for
        int target = 5;

        // Call the searchMatrix method and print the result
        boolean result = solution.searchMatrix(matrix, target);
        System.out.println("Target " + target + " found: " + result);
        
        // Test with a different target
        target = 20;
        result = solution.searchMatrix(matrix, target);
        System.out.println("Target " + target + " found: " + result);
    }
}


