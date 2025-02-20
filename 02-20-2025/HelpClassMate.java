import java.util.*;
class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    
       int ans[]=new int[n];
       Stack<Integer>st=new Stack<>();
        Arrays.fill(ans, -1);
       for(int i=0;i<n;i++){
           while(st.size()>0 && arr[i]<arr[st.peek()]){
           int ind=st.pop();
           ans[ind]=arr[i];
       }
       st.push(i);
       }
       
    //   ArrayList<Integer> result = new ArrayList<>();
    //     for (int val : ans) {
    //         result.add(val);
    //     }
        
        return ans;
    }
}
public class HelpClassMate {



    public static void main(String[] args) {
        // Example input for the array
        int[] arr = {4, 5, 2, 10, 8};
        
        // Get the size of the array
        int n = arr.length;
        
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Call the help_classmate method
        int[] result = solution.help_classmate(arr, n);
        
        // Print the result array
        System.out.print("Next smaller elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
