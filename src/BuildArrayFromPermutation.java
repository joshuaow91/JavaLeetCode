public class BuildArrayFromPermutation {


    public int[] buildArray(int[] nums) {
        int[] ans;
        ans = nums;

        for (int i = 0; i < ans.length - 1; i++) {
            for (int j = 0; j < ans.length - i - 1; j++) {
                if (ans[j] > ans[j + 1]) {
                    int temp = ans[j];
                    ans[j] = ans[j + 1];
                    ans[j + 1] = temp;
                }
            }
        }

        return ans;
    }
}
