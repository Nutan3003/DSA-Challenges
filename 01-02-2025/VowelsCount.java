import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VowelsCount {
  public static int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> st=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int n=words.length;
        int[]prefixSum=new int [n+1];
        for(int i=0;i<n;i++){
            String word=words[i].toLowerCase();
            if(word.length()>0 && st.contains(word.charAt(0)) &&  st.contains(word.charAt(word.length()-1)) ){
                prefixSum[i+1]=prefixSum[i]+1;
            }else{
                prefixSum[i+1]=prefixSum[i];
            }
        }

     List<Integer> ans=new ArrayList<>();
     for(int []q:queries){
        int li=q[0];
        int ri=q[1];
       ans.add(prefixSum[ri+1]-prefixSum[li]);
     }

         return ans.stream().mapToInt(i -> i).toArray();
    }
  public static void main(String[] args) {
    String[] words = {"apple", "orange", "banana", "umbrella", "ice", "era"};
    int[][] queries = {{0, 1}, {2, 4}, {0, 5}};
    System.out.println(vowelStrings(words, queries)); // Output: [2, 1, 4]
}
}
