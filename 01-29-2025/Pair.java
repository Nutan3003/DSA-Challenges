import java.util.*;

public class Pair implements Comparable<Pair> {
  int x;
  int y;

  Pair(int a, int b) {
    x = a;
    y = b;
  }

  public int compareTo(Pair o) {
    return this.y - o.y;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Pair[] arr = new Pair[n];
    for (int i = 0; i < n; i++) {
      int a1 = sc.nextInt();
      int b1 = sc.nextInt();
      arr[i] = new Pair(a1, b1);
    }

    System.out.println("After sorted......!!!")
    Arrays.sort(arr);
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i].x + " " + arr[i].y);
    }

  }
}