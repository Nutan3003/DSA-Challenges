import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void SelectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int minele = arr[i];
            int minind = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < minele){
                    minele = arr[j];
                    minind = j;
                }
            }
            // Swap the elements at index i and minind
            int temp = arr[i];
            arr[i] = arr[minind];
            arr[minind] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        SelectionSort(arr);
        
        // Print the sorted array
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
