# Problem Statements

# Problem 1:
## Description:
Given a number `n` and a bit number `k`, check if the `k`th index bit of `n` is set or not.  
A bit is called set if it is `1`. The position of the set bit should be indexed starting with `0` from the LSB (Least Significant Bit) side in the binary representation of the number.

You need to return `true` if the bit is set and `false` otherwise.

## Input:
- An integer `n`, the number to check.
- An integer `k`, the index of the bit.

## Output:
- Return `true` if the `k`th bit is set, otherwise return `false`.

## Constraints:
- `0 <= n <= 10^9`
- `0 <= k <= 31`

## Example:

### Input:
n = 4, k = 0

### Output:
false

### Explanation:
Binary representation of `4` is `100`.  
The 0th index bit from the LSB is not set.  
So, the function should return `false`.

### Solution:
[Solution Code](./CheckBit.java)
--- 


