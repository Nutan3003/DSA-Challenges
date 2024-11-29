# Problem Statements

# Problem 1:
## Description:
Given numbers n and k, unset the kth bit of number n. Rightmost bit is considered 0th bit and so on.
## Input:
- An integer `n`, the number to check.
- An integer `k`, the index of the bit.

## Output:
Print the decimal number after unsetiing the kth bit

## Constraints:
1 <= 10^5 <= n
0 <= k <=31

## Example:

### Input:
n = 15, k = 1

### Output:
13



### Solution:
[Solution Code](./UnsetBit.java)
# ------------------------------------------------------------------------------

# Problem 2:
## Description:
Given a positive integer n. Your task is to return the count of set bits.
## Input:
- An integer `n`, the numbers.

## Example:

### Input:
n = 3

### Output:
2

### Explanation:
 Binary representation is '1000', so the count of the set bit is 1.

### Solution:
[Solution Code](./CountingBits.java)
# ------------------------------------------------------------------------------

# Problem 3:
## Description:
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space. 



## Input:
Input: nums = [2,2,3,2]

## Output:
 3

## Constraints:
1 <= nums.length <= 3 * 104
-231 <= nums[i] <= 231 - 1

## Example:


### Solution:
[Solution Code](./SingleNumber2.java)