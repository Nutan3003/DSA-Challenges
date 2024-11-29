import java.util.*;
public class SingleNumber2 {
  public static boolean checkKthBit(int n, int i) {
    return (n & (1 << i)) != 0;
}
public  static int singleNumber(int[] nums) {
    int n=nums.length;
   int ans=0;
for(int i=0;i<32;i++){
    int count=0;
    for(int j=0;j<n;j++){
        if(checkKthBit(nums[j],i)==true){
            count++;
        }

    }

    if((count%3)==1){
        ans=ans+(1<<i);
    }
}
    return ans;
}

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of array:");
     int n=sc.nextInt();
      int nums[]=new int[n];
      for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
      }

      System.out.println( singleNumber(nums));

     
  }
}
