import java.util.*;
class Solution {
  // Function to find the next greater element for each element of the array.
  public ArrayList<Integer> nextLargerElement(int[] arr) {
     int n=arr.length;
     int ans[]=new int[n];
     Stack<Integer>st=new Stack<>();
      Arrays.fill(ans, -1);
     for(int i=0;i<n;i++){
         while(st.size()>0 && arr[i]>arr[st.peek()]){
         int ind=st.pop();
         ans[ind]=arr[i];
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



public class NextGreater{
    public static void main(String[] args) {
        // Example input for the array
        int[] arr = {4, 5, 2, 10, 8};
        
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Call the nextLargerElement method
        ArrayList<Integer> result = solution.nextLargerElement(arr);
        
        // Print the result list
        System.out.print("Next larger elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
