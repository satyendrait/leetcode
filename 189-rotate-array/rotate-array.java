class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 2)
            return;
        k = k % nums.length;
        int[] rnums = new int[nums.length];
        for (int i = 0, j = nums.length - k; j < nums.length; i++, j++) {
            rnums[i] = nums[j];
        }

        for (int i = k, j = 0; j < nums.length - k; i++, j++) {
            rnums[i] = nums[j];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnums[i];
        }

    }
}