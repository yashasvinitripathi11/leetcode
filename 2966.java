import java.util.Arrays;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] res = new int[n / 3][3];
        Arrays.sort(nums);

        for (int i = 0, idx = 0; i < n; i += 3, idx++) {
            if (nums[i + 2] - nums[i] > k) {
                return new int[0][];
            }

            res[idx][0] = nums[i];
            res[idx][1] = nums[i + 1];
            res[idx][2] = nums[i + 2];
        }

        return res;
    }

    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 3, 4, 8, 7, 9};
        int k = 3;

        int[][] result = sol.divideArray(nums, k);

       
        if (result.length == 0) {
            System.out.println("[]");
        } else {
            for (int[] group : result) {
                System.out.println(Arrays.toString(group));
            }
        }
    }
}
