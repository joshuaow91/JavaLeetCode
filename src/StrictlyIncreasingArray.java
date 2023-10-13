public class StrictlyIncreasingArray {

    //loop through indexes
    //initialize a counter to use as a tracker for any dips
    //check for dip - if the current index is less than the previous, increment the count
    //nested conditional to handle the count, if the count is at one check the indexes around to see if it can still work by either removing the previous index or current
    //if neither is true than it's not strictly increasing

    public boolean canBeIncreasing(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] <= nums[i - 1]) {
                count++;
                if (count == 1) {
                    boolean checkPrevious = (i == 1 || nums[i - 2] < nums[i])
                            && (i == nums.length - 1 || nums[i] < nums[i + 1]);
                    boolean checkCurrent = (i < nums.length - 1
                            && nums[i - 1] < nums[i + 1]) || (i == nums.length - 1);

                    if (!checkPrevious && !checkCurrent) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}




//Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly one element, or false otherwise. If the array is already strictly increasing, return true.
//
//The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length).
//
//
//
//Example 1:
//
//Input: nums = [1,2,10,5,7]
//Output: true
//Explanation: By removing 10 at index 2 from nums, it becomes [1,2,5,7].
//[1,2,5,7] is strictly increasing, so return true.
//Example 2:
//
//Input: nums = [2,3,1,2]
//Output: false
//Explanation:
//[3,1,2] is the result of removing the element at index 0.
//[2,1,2] is the result of removing the element at index 1.
//[2,3,2] is the result of removing the element at index 2.
//[2,3,1] is the result of removing the element at index 3.
//No resulting array is strictly increasing, so return false.
//Example 3:
//
//Input: nums = [1,1,1]
//Output: false
//Explanation: The result of removing any element is [1,1].
//[1,1] is not strictly increasing, so return false.
//
//
//Constraints:
//
//2 <= nums.length <= 1000
//1 <= nums[i] <= 1000