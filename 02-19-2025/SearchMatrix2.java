class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
      int i=0;
      int j=matrix[0].length-1;
      while(i<matrix.length && j >=0){
          if(matrix[i][j]==target){
              return true;
          }else if(target <matrix[i][j]){
              j--;

          }else{
              i++;
          }
      }
      return false;
      
  }
}

public class SearchMatrix2 {
 
    public static void main(String[] args) {
        // Create an instance of Solution class
        Solution solution = new Solution();
        
        // Example matrix (sorted in ascending order both row-wise and column-wise)
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

