
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReArr {
    public static void rearrange(int arr[], int s, int e) {
        int n = arr.length;
        int p1 = s + 1;
        int p2 = e;
        while (p1 <= p2) {
            if (arr[p1] <= arr[s]) {
                p1++;
            } else if (arr[p2] > arr[s]) {
                p2--;
            } else {
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p1++;
                p2--;
            }
        }
        int temp = arr[p2];
        arr[p2] = arr[s];
        arr[s] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int e = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rearrange(arr, s, e);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}