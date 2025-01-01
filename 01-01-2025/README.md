# Problem Statements

# Problem 1:

## Description:

Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).

The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.

## Input: s = "011101"

## Output: 5

## Explanation:

All possible ways of splitting s into two non-empty substrings are:
left = "0" and right = "11101", score = 1 + 4 = 5
left = "01" and right = "1101", score = 1 + 3 = 4
left = "011" and right = "101", score = 1 + 2 = 3
left = "0111" and right = "01", score = 1 + 1 = 2
left = "01110" and right = "1", score = 2 + 1 = 3

### Solution:

[Solution Code](./Max_score.java)

# -------------------------------------------------------------------------------------------------------

# Problem 2:

## Description:

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

## Example 1:

## Input: nums = [2,7,11,15], target = 9

## Output: [0,1]

## Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

### Solution1:

[Solution Code](./Two_sum.java)
Solution using the time complexity O(N) and space complexity O(N)

### Solution2:

[Solution Code](./Two_sum1.java)
Solution using the time complexity O(N^2) and space complexity O(1)

# -------------------------------------------------------------------------------------------------------
