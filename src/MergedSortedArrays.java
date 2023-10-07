// pseudo code

//function merge(nums1, length of nums1, nums2, length of nums2):
//
//    // Initialize pointers at the end of the 'active' portions of both arrays
//    // and the end of the merged result.
//    pointer1 = end of 'active' nums1
//    pointer2 = end of nums2
//    mergedPointer = end of nums1 array (considering extra spaces)
//
//    // As long as neither array has been fully considered:
//    while pointer1 has not reached the start of nums1 AND pointer2 has not reached the start of nums2:
//
//        // If the current element in nums1 is greater or equal to the current element in nums2:
//        if element at pointer1 in nums1 >= element at pointer2 in nums2:
//            // Place it in the correct position in the merged result
//            element at mergedPointer in nums1 = element at pointer1 in nums1
//            // Move to the previous element in nums1
//            decrement pointer1
//        else:
//            // Place the current element from nums2 in the merged result
//            element at mergedPointer in nums1 = element at pointer2 in nums2
//            // Move to the previous element in nums2
//            decrement pointer2
//
//        // Move to the previous position in the merged result
//        decrement mergedPointer
//
//    // If there are any remaining elements in nums2:
//    while pointer2 has not reached the start of nums2:
//        // Place them in the correct position in the merged result
//        element at mergedPointer in nums1 = element at pointer2 in nums2
//        // Move to the previous element in nums2 and merged result
//        decrement pointer2
//        decrement mergedPointer


public class MergedSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if(nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;

        }

    }
}



//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
//
//
//
//Example 1:
//
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
//Example 2:
//
//Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//Explanation: The arrays we are merging are [1] and [].
//The result of the merge is [1].
//Example 3:
//
//Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//Output: [1]
//Explanation: The arrays we are merging are [] and [1].
//The result of the merge is [1].
//Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
//
//
//Constraints:
//
//nums1.length == m + n
//nums2.length == n
//0 <= m, n <= 200
//1 <= m + n <= 200
//-109 <= nums1[i], nums2[j] <= 109