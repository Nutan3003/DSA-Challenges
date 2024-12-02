import java.io.*;
import java.util.*;

public class MaxPair2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        for(int i=31;i>=0;i--){
            int c = 0;
            for(int j=0;j<n;j++){
                if(checkBit(arr[j],i) == true){
                    c++;
                }
            }
            
            if(c>=2){
                for(int j=0;j<n;j++){
                    if(checkBit(arr[j],i) == false){
                        arr[j] = 0;
                    }
                }
            }
        }
        
        int idx1 = -1;
        int idx2 = -1;
        
        for(int k=0;k<n;k++){
            if(arr[k] > 0 && idx1 == -1){
                idx1 = k;
            }else if(arr[k] > 0 && idx1 != -1){
                idx2 = k;
                break;
            }
        }
          
         int ans = (arr[idx1] & arr[idx2]);
         System.out.println(ans);
    }
    
    public static boolean checkBit(int n, int i){
        if((n & (1<<i)) == 0){
            return false;
        }else{
            return true;
        }
    }
}
