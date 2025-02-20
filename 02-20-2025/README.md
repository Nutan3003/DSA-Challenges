# Problem Statements

# Problem 1:
## Description:
Given an array arr[ ] of integers, the task is to find the next greater element for each element of the array in order of their appearance in the array. Next greater element of an element in the array is the nearest element on the right which is greater than the current element.
If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.

## Examples

## Input:
 arr[] = [1, 3, 2, 4]
## Output:
 [3, 4, 4, -1]
## Explanation:
 The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn't exist, it is -1.
### Solution:
[Solution Code](./NextGreater.java)
# -------------------------------------------------------------------------------------------------------

# Problem 2:
## Description:
Professor X wants his students to help each other in the chemistry lab. He suggests that every student should help out a classmate who scored less marks than him in chemistry and whose roll number appears after him. But the students are lazy and they don't want to search too far. They each pick the first roll number after them that fits the criteria. Find the marks of the classmate that each student picks.
Note: one student may be selected by multiple classmates.

## Example 1:

## Input:
 N = 5, arr[] = {3, 8, 5, 2, 25}
## Output:
 2 5 2 -1 -1
## Explanation: 
1. Roll number 1 has 3 marks. The first person 
who has less marks than him is roll number 4, 
who has 2 marks.
2. Roll number 2 has 8 marks, he helps student 
with 5 marks.
3. Roll number 3 has 5 marks, he helps student 
with 2 marks.
4. Roll number 4 and 5 can not pick anyone as 
no student with higher roll number has lesser 
marks than them. This is denoted by -1.
Output shows the marks of the weaker student that 
each roll number helps in order. ie- 2,5,2,-1,-1
### Solution:
[Solution Code](./HelpClassMate.java)
# -------------------------------------------------------------------------------------------------------
# Problem 3:
## Description:
Given an array a of integers of length n, find the nearest smaller number for every element such that the smaller element is on left side.If no small element present on the left print -1.

## Example 1:

## Input:
 n = 3
a = {1, 6, 2}
## Output:
 -1 1 1
## Explaination:
 There is no number at the 
left of 1. Smaller number than 6 and 2 is 1.
### Solution:
[Solution Code](./SmallerOnLeft.java)
# -------------------------------------------------------------------------------------------------------
# Problem 4:
## Description:
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

 

## Example 1:


## Input: 
heights = [2,1,5,6,2,3]
## Output:
 10
## Explanation: 
The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
### Solution:
[Solution Code](./LargestTrct.java)
# -------------------------------------------------------------------------------------------------------