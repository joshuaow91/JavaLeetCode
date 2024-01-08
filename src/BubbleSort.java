import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] nums) {
        System.out.println("Original Array: " + Arrays.toString(nums));

        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j ++) {
                if (nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            System.out.print("Iteration " + (i + 1) + ": ");
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] nums = {8, 4, 1, 9, 7, 6, 3, 2};
        bubbleSort(nums);

        for (int num : nums) {
            System.out.print(num + ", ");
        }
    }


}


/*
public class BubbleSort {
    static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            // Flag to check if any swap happens
            boolean swapped = false;

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swapping, the array is already sorted
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] nums = {8, 4, 1, 9, 7, 6, 3, 2};
        bubbleSort(nums);

        // Print sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

 */