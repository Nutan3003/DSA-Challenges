# Problem Statements

# Problem 1:
## Description:

Given a number N, calculate the prime numbers up to N using Sieve of Eratosthenes.  

## Example 1:

## Input:
N = 10

## Output:
2 3 5 7

## Explanation:
Prime numbers less than equal to N 
are 2 3 5 and 7.
### Solution:
[Solution Code](./sieveOfEratosthenes.java)
# -------------------------------------------
# Problem 2:
## Description:
Given a number N, find the least prime factors for all numbers from 1 to N.  The least prime factor of an integer X is the smallest prime number that divides it.
## Note :

1 needs to be printed for 1.
You need to return an array/vector/list of size N+1 and need to use 1-based indexing to store the answer for each number.
Example 1:

## Input: N = 6
## Output: [0, 1, 2, 3, 2, 5, 2] 
## Explanation: 
least prime factor of 1 = 1,
least prime factor of 2 = 2,
least prime factor of 3 = 3,
least prime factor of 4 = 2,
least prime factor of 5 = 5,
least prime factor of 6 = 2.
So answer is[1, 2, 3, 2, 5, 2]. 

### Solution:
[Solution Code](./LeastPrime.java)
