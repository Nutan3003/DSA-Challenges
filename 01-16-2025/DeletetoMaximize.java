

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DeletetoMaximize {
    public static int gcd(int a,int b){
            if(a==0){
                return b;
            }
            
            int temp=gcd(b%a,a);
            return temp;
        }
        
        public static int[] fun1(int arr[]){
            int n=arr.length;
            int pgcd[]=new int[n];
            pgcd[0]=arr[0];
            for(int i=1;i<n;i++){
                pgcd[i]=gcd(pgcd[i-1],arr[i]);
            }
            return  pgcd;
        }
        
         public static int[] fun2(int arr[]){
            int n=arr.length;
            int sgcd[]=new int[n];
            sgcd[n-1]=arr[n-1];
            for(int i=n-2;i>=0;i--){
                sgcd[i]=gcd(sgcd[i+1],arr[i]);
            }
            return sgcd;
        }
        
        public static int deleteToMax(int arr[]){
            int n=arr.length;
            int pgcd[]=fun1(arr);
            int sgcd[]=fun2(arr);
            int ans=0;
            ans=Math.max(ans,sgcd[1]);
            for(int i=1;i<n-1;i++){
                int left=pgcd[i-1];
                int right=sgcd[i+1];
                int overall=gcd(left,right);
                ans=Math.max(ans,overall);
            }
             ans=Math.max(ans,pgcd[n-2]);
            return ans;
        }

    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(deleteToMax(arr));
    }
}
