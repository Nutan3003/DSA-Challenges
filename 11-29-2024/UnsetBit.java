import java.util.Scanner;

public class UnsetBit {
  public static boolean checkKthBit(int n,int k){
    return (n & (1 << k)) != 0;

  }

  public static int unsetKthBit(int n,int k){
    
    if(checkKthBit(n, k)==true){
      int ans=(n^(1<<k));
      return ans;
    }
    return n;
  }

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();

System.out.println("Enter the bit");
int k=sc.nextInt();

System.out.println(unsetKthBit(n, k));


}
  
}
