package ArraysHashing;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {
    public static void mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, count);
                count++;
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 4, 4, 1};
        mostFrequentEven(nums);

    }
}
