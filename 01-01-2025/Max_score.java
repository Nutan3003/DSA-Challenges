class Solution {
  public int maxScore(String s) {
      int n = s.length();
      int oneCount = 0;
      for (int i = 0; i < n; i++) {
          if (s.charAt(i) == '1') {
              oneCount++;
          }
      }

      int zeroCount = 0;
      int maxScore = 0;
      for (int i = 0; i < n - 1; i++) {
          if (s.charAt(i) == '1') {
              oneCount--;
          } else {
              zeroCount++;
          }
          maxScore = Math.max(maxScore, zeroCount + oneCount);
      }
      return maxScore;
  }
}
public class Max_score {
  
  public static void main(String[] args) {
      Solution solution = new Solution();

      // Test case 1
      String s1 = "011101";
      int result1 = solution.maxScore(s1);
      System.out.println("Max score for \"" + s1 + "\": " + result1); // Output: 5

      // Test case 2
      String s2 = "00111";
      int result2 = solution.maxScore(s2);
      System.out.println("Max score for \"" + s2 + "\": " + result2); // Output: 5

      // Test case 3
      String s3 = "1111";
      int result3 = solution.maxScore(s3);
      System.out.println("Max score for \"" + s3 + "\": " + result3); // Output: 3

      // Test case 4
      String s4 = "0000";
      int result4 = solution.maxScore(s4);
      System.out.println("Max score for \"" + s4 + "\": " + result4); // Output: 3

      // Test case 5
      String s5 = "10101";
      int result5 = solution.maxScore(s5);
      System.out.println("Max score for \"" + s5 + "\": " + result5); // Output: 4
  }
}