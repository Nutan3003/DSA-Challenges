
import java.util.*;
class  InserationSort {
  // Please change the array in-place
  public static void SortEle(int arr[]) {
      for(int i=1;i<arr.length;i++){
           for(int j=i-1;j>=0;j--){
         if(arr[j]>arr[j+1]){
             int temp=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;
         }else{
             break;
         }
     }
      }
    
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
     SortEle(arr);
     for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
     }
 }
}