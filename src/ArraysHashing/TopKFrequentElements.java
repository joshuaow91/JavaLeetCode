package ArraysHashing;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++){
            Integer num = map.get(i);
            if (num != null) {
                map.put(i, k + 1);
            }
            return new int[]{i, k};
        }
        return nums;
    }
}


//incomplete. working through this.