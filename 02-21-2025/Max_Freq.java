import java.util.*;
class FreqStack {
    
  HashMap<Integer ,Stack<Integer>> st;
  HashMap<Integer,Integer> fmap;
  int maxfreq;
  public FreqStack() {
      st = new HashMap<>();
      fmap = new HashMap<>();
      maxfreq = 0;
  }
  
  public void push(int val) {
      int f = fmap.getOrDefault(val,0);
      f++;
      fmap.put(val,f);
      if(st.containsKey(f)==false){
          st.put(f,new Stack<>());
          maxfreq = Math.max(maxfreq,f);
      }
       st.get(f).push(val);
      
  }
  
  public int pop() {
      int ans = st.get(maxfreq).pop();
      int f = fmap.get(ans);
      f--;
      fmap.put(ans,f);
      if(st.get(maxfreq).size()==0){
          st.remove(maxfreq);
          maxfreq--;
      }
      return ans;
  }
}


public class Max_Freq {
  public static void main(String[] args) {
    FreqStack freqStack = new FreqStack();

    // Push elements to the stack
    System.out.println("Pushing values...");
    freqStack.push(5);
    freqStack.push(7);
    freqStack.push(5);
    freqStack.push(7);
    freqStack.push(5);
    freqStack.push(7);

    // Pop elements from the stack
    System.out.println("Popping values...");
    System.out.println(freqStack.pop());  // Expected 7, as it is most frequent
    System.out.println(freqStack.pop());  // Expected 5, as it is now most frequent
    System.out.println(freqStack.pop());  // Expected 7
    System.out.println(freqStack.pop());  // Expected 5
    System.out.println(freqStack.pop());  // Expected 5, the last 5 remaining
}
}