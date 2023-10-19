import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        // Check if the input array is null or empty. If so, return the empty list.
        if (nums == null || nums.length == 0) return result;

        for(int i = 0; i < nums.length; i++) {

            // Set the start of the potential range to the current number.
            int start = nums[i];

            // Check if the current number and the next number are consecutive.
            // If they are, keep moving to the next number until the end of this consecutive range is found.
            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                i++; // Move to the next number.
            }

            // If the start of the range is the same as the current number, it means it's a single number (not a range).
            if(start == nums[i]) {
                result.add(String.valueOf(nums[i])); // Add the single number to the result list.
            } else {
                // If it's an actual range, then create a string representation of the range and add to the result list.
                result.add(start + "->" + nums[i]);
            }

        }

        // Return the list containing all the ranges and single numbers.
        return result;
    }


    public static void main(String[] args) {
        SummaryRanges solution = new SummaryRanges();

        int[] input = {0,1,2,4,5,7};
        List<String> output = solution.summaryRanges(input);
        List<String> expected = List.of("0->2", "4->5", "7");
        System.out.println("Input: [0,1,2,4,5,7]");
        System.out.println("Output: " + output);
        System.out.println("Expected: " + expected);
        System.out.println(output.equals(expected) ? "Test Passed!" : "Test Failed!");

    }
}



//You are given a sorted unique integer array nums.
//
//A range [a,b] is the set of all integers from a to b (inclusive).
//
//Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
//
//Each range [a,b] in the list should be output as:
//
//"a->b" if a != b
//"a" if a == b
//
//
//Example 1:
//
//Input: nums = [0,1,2,4,5,7]
//Output: ["0->2","4->5","7"]
//Explanation: The ranges are:
//[0,2] --> "0->2"
//[4,5] --> "4->5"
//[7,7] --> "7"
//Example 2:
//
//Input: nums = [0,2,3,4,6,8,9]
//Output: ["0","2->4","6","8->9"]
//Explanation: The ranges are:
//[0,0] --> "0"
//[2,4] --> "2->4"
//[6,6] --> "6"
//[8,9] --> "8->9"
//
//
//Constraints:
//
//0 <= nums.length <= 20
//-231 <= nums[i] <= 231 - 1
//All the values of nums are unique.
//nums is sorted in ascending order.