
import java.util.*;
public class WiggleSort {
  public static void wiggleSort(int[] nums) {
    for(int i = 0; i<nums.length-1; i++){
        if(i%2==0){
            if(nums[i]>nums[i+1]){
                 swap(nums,i,i+1);
            }
        } else {
           if(nums[i]<nums[i+1]){
               swap(nums,i,i+1);
            }
        }
    }
}
public static  void swap(int[] arr , int i, int j){
       int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
}
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int nums[]=new int[n];
    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();

    }
    wiggleSort(nums);

    for(int i=0;i<n;i++){
      System.out.print(nums[i]+" ");

    }

  }
  
}
