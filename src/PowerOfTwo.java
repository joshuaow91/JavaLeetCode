public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        // Use bitwise AND to check if n has a single '1' bit
        // For example, 4 is 100 in binary, and 4 - 1 is 011, so 4 & (4 - 1) is 0
        return (n & (n - 1)) == 0;
    }


//        public boolean isPowerOfTwo(int n) {
//        if (n <= 0) {
//            return false;
//        }
//        // Keep dividing n by 2 if it's even
//        while (n % 2 == 0) {
//            n /= 2;
//        }
//        // If n becomes 1, then it was a power of 2; otherwise, it's not
//        return n == 1;
//    }
}

//Given an integer n, return true if it is a power of two. Otherwise, return false.
//
//An integer n is a power of two, if there exists an integer x such that n == 2x.
//
//
//
//Example 1:
//
//Input: n = 1
//Output: true
//Explanation: 20 = 1
//Example 2:
//
//Input: n = 16
//Output: true
//Explanation: 24 = 16
//Example 3:
//
//Input: n = 3
//Output: false
//
//
//Constraints:
//
//-231 <= n <= 231 - 1