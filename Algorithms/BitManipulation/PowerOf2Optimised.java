/*
Given a positive integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some x.


Example 1:

Input: N = 1
Output: true
Explanation: 1 is equal to 2 raised to 0 (20 == 1).
Example 2:

Input: N = 98
Output: false
Explanation:
98 cannot be obtained by any power of 2.

Your Task: Your task is to complete the function isPowerofTwo() which takes n as a parameter and returns true or false by checking is given number can be represented as a power of two or not.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).

Constraints:
0 <= N <= 1018
*/

//all powers of 2 have one single set bit
//the expression n&(n-1) unsets the set bits, so if n is a power of 2
//so doing n & (n-1) once, will make it equal to 0, so no need of a loop
//also we can't apply this approach if n=0, therefore, handle that case as well
class PowerOf2Optimised{

    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){

        return n!=0 && ((n & (n-1)) == 0);

    }

}