public class sqrt {

    public int mySqrt(int x) {
        // Edge cases
        if (x == 0 || x == 1) {
            return x;
        }

        long start = 1, end = x;
        int result = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid * mid == x) {
                return (int) mid;
            }

            if (mid * mid < x) {
                start = mid + 1;
                result = (int) mid;  // Update result as the last known smaller number
            } else {
                end = mid - 1;
            }
        }

        return result;
    }
}



//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//
//You must not use any built-in exponent function or operator.
//
//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
//
