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
# -------------------------------------------------------------------------------------------------------

# Problem 2:
## Description:
Given a number N and a value K. From the right, set the Kth bit in the binary representation of N. The position of Least Significant Bit(or last bit) is 0, the second last bit is 1 and so on. 



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
N = 10 
K = 2

### Output:
14

### Explanation:
Binary representation of the given number
10 is: 1 0 1 0, number of bits in the 
binary reprsentation is 4. Thus 2nd bit
from right is 0. The number after changing
this bit to 1 is: 14(1 1 1 0).

### Solution:
[Solution Code](./SetBit.java)
# -------------------------------------------------------------------------------------------------------
# Problem:3
## Description:
Given numbers n and k, toggle kth bit of number n. Rightmost bit is considered 0th bit and so on.

## Input:
- An integer `n`, the number to check.
- An integer `k`, the index of the bit.

## Output:
Print the decimal number after toggling the kth bit

## Constraints:
1 <= 10^5 <= n
0 <= k <=31

## Example:

### Input:
N = 75
K = 4

### Output:
91
### Solution:
[Solution Code](./ToggleBit.java)
# -------------------------------------------------------------------------------------------------------




