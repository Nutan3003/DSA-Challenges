import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubSequence {
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        int temp=gcd(b%a,a);
        return temp;
    }
    public static boolean findSubsquence(int arr[]){
        int n=arr.length;
        int ans=Math.abs(arr[0]);
        for(int i=1;i<n;i++){
            ans=gcd(ans,Math.abs(arr[i]));
        }
        if(ans==1){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findSubsquence(arr));
    }
}