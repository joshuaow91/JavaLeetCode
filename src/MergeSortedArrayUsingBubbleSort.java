import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrayUsingBubbleSort {

//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int nums1Pointer = m - 1;
//        int nums2Pointer = n - 1;
//        int capacityPointer = m + n - 1;
//
//        int iterationCounter = 0;
//
//        while (nums1Pointer >= 0 && nums2Pointer >= 0) {
//            if (nums1[nums1Pointer] > nums2[nums2Pointer]) {
//                nums1[capacityPointer] = nums1[nums1Pointer];
//                nums1Pointer--;
//            } else {
//                nums1[capacityPointer] = nums2[nums2Pointer];
//                nums2Pointer--;
//            }
//            capacityPointer--;
//
//            iterationCounter++;
//            System.out.println("Iteration " + iterationCounter + ": " + arrayToString(nums1, m + n));
//        }
//
//        int iterationCounter2 = 0;
//
//        while (nums2Pointer >= 0) {
//            nums1[capacityPointer] = nums2[nums2Pointer];
//            nums2Pointer--;
//            capacityPointer--;
//
//            iterationCounter2++;
//            System.out.println("Left over Elements Iteration: " + iterationCounter2 + " " + arrayToString(nums1, m + n));
//        }
//    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();

        for (int i : nums1) {
            if (i > 0) {
                list.add(i);
            }
        }

        for (int j : nums2) {
            if (j > 0) {
                list.add(j);
            }
        }

        int temp = 0;

        for (int k = 0; k < list.size() - k; k++) {
            for (int l = 0; l < list.size() - k - 1; l++) {
                if (list.get(l) > list.get(l + 1)) {
                    temp = list.get(l);
                    list.set(l, list.get(l + 1));
                    list.set(l + 1, temp);
                }
            }
        }

        System.out.println("Bubble sort, with Array List: " + list);
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int m = 3;
        int n = nums2.length;

//        System.out.println("Before merge:");
//        System.out.println("nums1: " + arrayToString(nums1, m + n));
//        System.out.println("nums2: " + arrayToString(nums2, n));

        merge(nums1, m, nums2, n);

//        System.out.println("After merge:");
//        System.out.println("nums1: " + arrayToString(nums1, m + n));
    }

    private static String arrayToString(int[] array, int length) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < length; i++) {
            sb.append(array[i]);
            if (i < length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
