
import java.util.*;
public class PostEve {
    
}
class Solution {
    public int evalRPN(String[] tokens) {
     Stack<Integer> op = new Stack<>();
        
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            
            // Check if the token is an operator
            if (token.equals("*") || token.equals("/") || token.equals("+") || token.equals("-")) {
                int val2 = op.pop();
                int val1 = op.pop();
                int result = calc(val1, val2, token.charAt(0));  // We can safely use the first character as operator
                op.push(result);
            } else {
                // Parse the number as an integer and push it to the stack
                op.push(Integer.parseInt(token));
            }
        }
        
        return op.pop();
    }
    
    public static int calc(int a, int b, char operator) {
        if (operator == '+') return a + b;
        if (operator == '-') return a - b;
        if (operator == '*') return a * b;
        return a / b;  // Division
    }

}