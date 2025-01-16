import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindGcd {
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        int temp=gcd(b%a,a);
        return temp;
        
    }
    public static int gcdArr(int arr[]){
        int n=arr.length;
        int ans=Math.abs(arr[0]);
        for(int i=1;i<n;i++){
            ans=gcd(ans,Math.abs(arr[i]));
        }
        return ans;
    } 

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
              arr[i] = sc.nextInt();
        }
        System.out.println(gcdArr(arr));
    }
}