// Solution for the problem on 2024-11-28
class CheckBit {
  // Function to check if the Kth bit is set or not
  static boolean checkKthBit(int n, int k) {
      // Use bitwise AND to check if the Kth bit is set
      return (n & (1 << k)) != 0;
  }

  public static void main(String[] args) {
      // Test cases
      int n1 = 4, k1 = 0;
      System.out.println("Input: n = " + n1 + ", k = " + k1);
      System.out.println("Output: " + checkKthBit(n1, k1)); // false

      int n2 = 4, k2 = 2;
      System.out.println("Input: n = " + n2 + ", k = " + k2);
      System.out.println("Output: " + checkKthBit(n2, k2)); // true
  }
}
