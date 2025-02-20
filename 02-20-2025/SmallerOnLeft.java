import java.util.*;

class Solution {
    static List<Integer> leftSmaller(int n, int arr[]) {
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(ans, -1);
        for (int i = 0; i < n; i++) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                ans[i] = arr[st.peek()];
            }
            st.push(i);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int val : ans) {
            result.add(val);
        }

        return result;
    }
}

public class SmallerOnLeft {
    public static void main(String[] args) {
        // Example input for the array
        int[] arr = {4, 5, 2, 10, 8};
        
        // Get the size of the array
        int n = arr.length;
        
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Call the leftSmaller method and pass the length and array
        ArrayList<Integer> result = solution.leftSmaller(n, arr);
        
        // Print the result list
        System.out.print("Smaller elements on the left: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
