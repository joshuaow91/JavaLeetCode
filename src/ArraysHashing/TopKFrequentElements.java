package ArraysHashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());

        ArrayList<Integer> list2 = new ArrayList<>(list.subList(0, k));

        int[] ans = new int[list2.size()];
        int j = 0;
        for (var entry : map.entrySet()) {
            if (list2.contains(entry.getValue())) {
                ans[j++] = entry.getKey();
            }
        }

        return ans;
    }
}

// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
//
//
//
//Example 1:
//
//Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]
//Example 2:
//
//Input: nums = [1], k = 1
//Output: [1]
//
//
//Constraints:
//
//1 <= nums.length <= 105
//-104 <= nums[i] <= 104
//k is in the range [1, the number of unique elements in the array].
//It is guaranteed that the answer is unique.