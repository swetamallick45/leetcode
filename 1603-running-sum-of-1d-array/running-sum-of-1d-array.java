class Solution {
    public int[] runningSum(int[] nums) {
        // Intuition: reuse the previous prefix
        int n = nums.length;
        int[] r = new int[n];
        r[0] = nums[0];

        for(int i = 1; i < n; i++) {
            r[i] = r[i-1] + nums[i];
        }
        return r;
    }
}