import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            // Sort the array using merge sort
            Solution solution = new Solution();
            solution.mergeSort(arr, 0, arr.length - 1);

            // Print the sorted array
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            System.out.println("~");
        }
    }
}

class Solution {

    // Merge function to merge two sorted subarrays
    void Merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temporary subarrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data into temporary subarrays
        for (int i = 0; i < n1; i++) left[i] = arr[l + i];
        for (int i = 0; i < n2; i++) right[i] = arr[m + 1 + i];

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left[] (if any)
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[] (if any)
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // Merge sort function
    void mergeSort(int arr[], int l, int r) {
        // Base condition: If the array has one or zero elements, it's already sorted
        if (l >= r) return;

        // Find the middle point
        int m = (l + r) / 2;

        // Recursively sort the two halves
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);

        // Merge the sorted halves
        Merge(arr, l, m, r);
    }
}
