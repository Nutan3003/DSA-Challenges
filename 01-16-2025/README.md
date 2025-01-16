# Problem Statements

# Problem 1:
## Description:
Given N integers, Check if there exists a subsequence with gcd == 1.
## Input Format

The first line contains the length of array N
The second line contains N element representing the element of Array
## Constraints

1 <= N <= 10^4
1 <= arr[i] <= 10^9
Output Format

##Output 
true if there exists a subsequence with GCD 1 else Output false.
## Sample Input 

4
4 6 3 8
## Sample Output 

true

### Solution:
[Solution Code](./SubSequence.java)
# -------------------------------------------
# Problem 2:
## Description:
Given an array arr[] of length N ≥ 2. The task is to remove an element from the given array such that the GCD of the array after removing it is maximized.
## Input Format

The first line contains the length of array N
The second line contains N element representing the element of Array
## Constraints

1 <= N <= 10^4
1 <= arr[i] <= 10^9
## Output Format

The maximum Possible GCD after deleting 1 element
## Sample Input 
5
24 16 18 30 15
## Sample Output 0

3

### Solution:
[Solution Code](./DeletetoMaximize.java)
# -------------------------------------------
# Problem 3:
## Description:
Given an integer array nums and an integer k, return the number of subarrays of nums where the greatest common divisor of the subarray's elements is k.

A subarray is a contiguous non-empty sequence of elements within an array.

The greatest common divisor of an array is the largest integer that evenly divides all the array elements.

 

## Example 1:

## Input: 
nums = [9,3,1,2,6,3], k = 3
## Output:
 4
## Explanation:
 The subarrays of nums where 3 is the greatest common divisor of all the subarray's elements are:
- [9,3,1,2,6,3]
- [9,3,1,2,6,3]
- [9,3,1,2,6,3]
- [9,3,1,2,6,3]

### Solution:
[Solution Code](./SunArrayGcd.java)
# -------------------------------------------
# Problem 4:
## Description:
You are given an integer array deck where deck[i] represents the number written on the ith card.

Partition the cards into one or more groups such that:

Each group has exactly x cards where x > 1, and
All the cards in one group have the same integer written on them.
Return true if such partition is possible, or false otherwise.

 

## Example 1:

## Input: 
deck = [1,2,3,4,4,3,2,1]
## Output: 
true
## Explanation: 
Possible partition [1,1],[2,2],[3,3],[4,4].
### Solution:
[Solution Code](./DeckofCard.java)
# -------------------------------------------