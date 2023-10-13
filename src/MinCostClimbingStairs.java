

public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }
}


//    public int minCostClimbingStairs(int[] cost) {
        // We create a new array `dp` of the same length as the input `cost` array.
        // This `dp` array will help us store and re-use the results of subproblems.
//        int[] dp = new int[cost.length];

        // Base Cases:
        // The cost to reach the first step (index 0) is simply the cost of that step.
//        dp[0] = cost[0];

        // Similarly, the cost to reach the second step (index 1) is just the cost of that step.
//        dp[1] = cost[1];

        // Now, we loop from the third step (index 2) to the end of the stairs.
        // We calculate the cost to reach each of these steps.
//        for (int i = 2; i < cost.length; i++) {
            // The cost to reach the current step (i) is the cost of the step itself PLUS
            // the minimum of the costs to reach the two preceding steps (i-1 and i-2).
            // We take the minimum of the two preceding steps because, at each step, we
            // have the choice to move from either the previous step or the step before that.
//            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
//        }

        // At the end of the loop, the last two entries in the `dp` array represent the
        // total cost if we end at the last step and the second-last step, respectively.
        // We can finish our climb from either of these steps. Hence, we return the
        // minimum of these two values as our result.
//        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
//    }



//You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
//
//You can either start from the step with index 0, or the step with index 1.
//
//Return the minimum cost to reach the top of the floor.
//
//
//
//Example 1:
//
//Input: cost = [10,15,20]
//Output: 15
//Explanation: You will start at index 1.
//- Pay 15 and climb two steps to reach the top.
//The total cost is 15.
//Example 2:
//
//Input: cost = [1,100,1,1,1,100,1,1,100,1]
//Output: 6
//Explanation: You will start at index 0.
//- Pay 1 and climb two steps to reach index 2.
//- Pay 1 and climb two steps to reach index 4.
//- Pay 1 and climb two steps to reach index 6.
//- Pay 1 and climb one step to reach index 7.
//- Pay 1 and climb two steps to reach index 9.
//- Pay 1 and climb one step to reach the top.
//The total cost is 6.
//
//
//Constraints:
//
//2 <= cost.length <= 1000
//0 <= cost[i] <= 999