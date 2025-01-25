
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReArrange {
    public static void rearrange(int arr[]){
        int n=arr.length;
        int p1=1;
        int p2=n-1;
        while(p1<=p2){
            if(arr[p1]<=arr[0]){
                p1++;
            }else if(arr[p2]>arr[0]){
                p2--;
            }else{
                int temp=arr[p1];
                arr[p1]=arr[p2];
                arr[p2]=temp;
                p1++;
                p2--;
            }
        }
        int temp=arr[0];
        arr[0]=arr[p2];
        arr[p2]=temp;
    }

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rearrange(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}