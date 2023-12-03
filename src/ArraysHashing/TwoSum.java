package ArraysHashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//    Brute Force Solution
//    public int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++){
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }
//        return result;
//    }

//    HashMap Solution
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for(int i = 0; i < nums.length; i++) {
// check if the complement of a previously encountered number is present in the current iteration
        Integer complementIndex = map.get(nums[i]);
// if the number is not null a match has been found and the indices are returned in a new int array
        if (complementIndex != null) {
            return new int[]{i, complementIndex};
        }
// if the value is null, it means the current number's complement hasn't been seen yet.
// calculate this complement (target - nums[i]) and store it in the map along with the current index.
// this entry will be used in future iterations to check if any upcoming number is the complement of the current number.
        map.put(target - nums[i], i);
    }
    return nums;
}

}


//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
//
//
//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
//
//
//Constraints:
//
//2 <= nums.length <= 104
//-109 <= nums[i] <= 109
//-109 <= target <= 109
//Only one valid answer exists.
