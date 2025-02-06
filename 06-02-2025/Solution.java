public class Solution {

    // Method to sort the array containing only 0s, 1s, and 2s
    public static void sort012(int arr[], int n) {
        int i = 0, j = 0, k = n - 1;
        
        // Using Dutch National Flag problem approach
        while (j <= k) {
            if (arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[j] == 1) {
                j++;
            } else {
                swap(arr, j, k);
                k--;
            }
        }
    }

    // Swap method to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // Test case 1: An array of 0s, 1s, and 2s
        int[] arr1 = {0, 1, 2, 1, 0, 2, 1, 0};
        int n1 = arr1.length;
        System.out.println("Before sorting:");
        printArray(arr1);
        sort012(arr1, n1);
        System.out.println("After sorting:");
        printArray(arr1); // Expected output: [0, 0, 0, 1, 1, 1, 2, 2]

        // Test case 2: Already sorted array (ascending)
        int[] arr2 = {0, 0, 1, 1, 2, 2};
        int n2 = arr2.length;
        System.out.println("\nBefore sorting:");
        printArray(arr2);
        sort012(arr2, n2);
        System.out.println("After sorting:");
        printArray(arr2); // Expected output: [0, 0, 1, 1, 2, 2]

        // Test case 3: Array with only 0s
        int[] arr3 = {0, 0, 0, 0};
        int n3 = arr3.length;
        System.out.println("\nBefore sorting:");
        printArray(arr3);
        sort012(arr3, n3);
        System.out.println("After sorting:");
        printArray(arr3); // Expected output: [0, 0, 0, 0]

        // Test case 4: Array with only 1s
        int[] arr4 = {1, 1, 1, 1};
        int n4 = arr4.length;
        System.out.println("\nBefore sorting:");
        printArray(arr4);
        sort012(arr4, n4);
        System.out.println("After sorting:");
        printArray(arr4); // Expected output: [1, 1, 1, 1]

        // Test case 5: Array with only 2s
        int[] arr5 = {2, 2, 2, 2};
        int n5 = arr5.length;
        System.out.println("\nBefore sorting:");
        printArray(arr5);
        sort012(arr5, n5);
        System.out.println("After sorting:");
        printArray(arr5); // Expected output: [2, 2, 2, 2]
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
