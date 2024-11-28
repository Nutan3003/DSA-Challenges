import java.util.*;
public class SetBit {
  public static int setKthBit(int n,int k){
    int ans=n |(1<<k);
    return ans;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    System.out.println("Enter the value:");
    int k=sc.nextInt();

    System.out.println(setKthBit(n, k));


  }
  
}
