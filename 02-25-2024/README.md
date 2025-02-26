# Problem Statements

# Problem 1:

## Description:
Given an infix expression in the form of string s. Convert this infix expression to a postfix expression.

Infix expression: The expression of the form a op b. When an operator is in between every pair of operands.
Postfix expression: The expression of the form a b op. When an operator is followed for every pair of operands.
Note: The order of precedence is: ^ greater than * equals to / greater than + equals to -. Ignore the right associativity of ^.

Examples :

## Input:
 s = "a+b*(c^d-e)^(f+g*h)-i"
## Output:
 abcd^e-fgh*+^*+i-
## Explanation:
 After converting the infix expression into postfix expression, the resultant expression will be abcd^e-fgh*+^*+i-

### Solution:

[Solution Code](./InfixToPostFix.java)

# -------------------------------------------------------------------------------------------------------

# Problem 2:

## Description:

You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

Note that:

The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer.
 

Example 1:

## Input: 
 tokens = ["2","1","+","3","*"]
## Output: 
9
## Explanation: 
((2 + 1) * 3) = 9
### Solution:

[Solution Code](./PostEve.java)
# -------------------------------------------------------------------------------------------------------
