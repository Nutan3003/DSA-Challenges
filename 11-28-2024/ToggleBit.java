import java.util.*;

public class ToggleBit {
  public static int toggleKthBit(int n, int k) {
    int ans = n ^ (1 << k);
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    System.out.println("Enter the bit");
    int k = sc.nextInt();
    System.out.println("Toggle bits are" + toggleKthBit(n, k));

  }

}
