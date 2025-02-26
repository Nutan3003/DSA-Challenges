//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(new Solution().infixToPostfix(br.readLine().trim()));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
         Stack<String> operand = new Stack<>();
         Stack<Character> operator = new Stack<>();
         int i = 0;
         while(i<exp.length()){
             char ch = exp.charAt(i);
             if(ch=='(') operator.push(ch);
             else if(ch == ')'){
                  while(operator.peek() != '('){
                    char oper = operator.pop();
                    String val2 = operand.pop();
                    String val1 = operand.pop();
                    String cal = val1 + val2 + oper;
                    operand.push(cal);
                  }
                  operator.pop();
             }
             else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^'){
                 while(operator.size() > 0 && prec(operator.peek()) >= prec(ch)){
                    char oper = operator.pop();
                    String val2 = operand.pop();
                    String val1 = operand.pop();
                    String cal = val1 + val2 + oper;
                    operand.push(cal+"");
                }
                operator.push(ch);
             } else{
                 operand.push(ch+"");
             }
             i++;
         }
           while(operator.size() > 0 ){
                char oper = operator.pop();
                String val2 = operand.pop();
                String val1 = operand.pop();
                String cal = val1 + val2 + oper;
                operand.push(cal+"");
            }
         return operand.pop();
         
    }
    public static int prec(char c){
        if(c == '^') return 2;
        else if(c == '*' || c == '/') return 1;
        return 0;
    }

}