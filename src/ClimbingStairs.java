public class ClimbingStairs {
    public int climbStairs(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];

    }
}

//I start with solving each subproblem, solving for n = 1 & n = 2. Then initializing an array "dp" to store the progressing solutions (this is where i need to spend time grasping the concept).
//dp is set to n + 1 length to account for 0-indexing and having space for n steps. dp[1] is set to 1 and dp[2] is set to 2.
//From there I used a for-loop starting at the third index.
//Inside the loop the value at dp[i] is determined by the sum of the values at the previous two indices, representing the two ways to arrive at the current step (either from one step or two steps behind).
//After the loop completes dp[n] contains the total number of distinct ways to reach the n-th step.



//You are climbing a staircase. It takes n steps to reach the top.
//
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//
//
//Example 1:
//
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
//Example 2:
//
//Input: n = 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
//
//
//Constraints:
//
//1 <= n <= 45