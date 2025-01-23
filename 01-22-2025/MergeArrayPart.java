import java.util.*;
public class MergeArrayPart {
  public static void MergeArray(int arr[],int s,int m,int e){
    int temp[]=new int[e-s+1];
    int p1=s;
    int p2=m+1;
    int p3=0;
    while(p1<=m && p2<=e){
        if(arr[p1]<arr[p2]){
            temp[p3]=arr[p1];
            p1++;
            p3++;
        }else{
            temp[p3]=arr[p2];
            p2++;
            p3++;
        }
        
    }
    while(p1<=m){
            temp[p3]=arr[p1];
            p1++;
            p3++;
            
        }
        while(p2<=e){
            temp[p3]=arr[p2];
            p2++;
            p3++;
        }
    for(int i=0;i<temp.length;i++){
        arr[s+i]=temp[i];
    }
    
    
}

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int s=sc.nextInt();
    int m=sc.nextInt();
    int e=sc.nextInt();
    MergeArray(arr,s,m,e);
  for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
  }
    
    
    
    
}
}