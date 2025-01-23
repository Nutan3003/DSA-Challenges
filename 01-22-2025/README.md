# Problem Statements

# Problem 1:
## Description:
Given N array Integers, Sort the array using Selection sort technique

## Input Format
Integer representing N representing length of array
N numbers of Array

## Constraints
1<= N <= 10 ^ 6
1<= A[i] <=10 ^ 9

## Output Format
Print the sorted array in a line separated by space

## Sample Input 
5
7 9 3 10 4

## Sample Output 0
3 4 7 9 10

### Solution:
[Solution Code](./Solution.java)
# -------------------------------------------------------------------------------------------------------

# Problem 2:
## Description:
Given two sorted arrays with N and M elements. Merge them into one sorted array and Print them. 

## Input Format
The first line contains two integers n and m representing the size of 2 arrays
The second line contains n elements of first array.
The third line contains m elements of second array.

## Constraints
1<= N <= 10 ^ 6
1<= A[i] <=10 ^ 9

## Output Format
Print the merged sorted array in a line separated by space

## Sample Input 0
4 3
7 10 11 14
3 8 9

## Sample Output 
3 7 8 9 10 11 14 

### Solution:
[Solution Code](./MergeTwoArray.java)
# -------------------------------------------------------------------------------------------------------
# Problem:3
## Description:
Given a sorted arrays with N elements and 3 indices s, m and e such that subarray [s,m] is sorted, subarray [m+1,e] is sorted. Sort the subarray [s,e].

## Note:
 s to m and then m+1 to e are continuous subarray

## Input Format
The first line contains integer n representing size of array
The second line contains n elements of array.
The third line contains 3 elements representing s,m and e index.

## Constraints
1<= N <= 10 ^ 6
1<= A[i] <=10 ^ 9

## Output Format
Print the array after sorting subarray [s,e] in a line separated by space

## Sample Input 
12
4 8 -1 2 6 9 11 3 4 7 13 0
2 6 9

## Sample Output 

4 8 -1 2 3 4 6 7 9 11 13 0
### Solution:
[Solution Code](./MergeArrayPart.java)
# -------------------------------------------------------------------------------------------------------




