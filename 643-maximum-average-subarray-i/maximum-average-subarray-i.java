class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;

        // Calculate the sum of the first k elements
        double window = 0;

        for (int i = 0; i < k; i++) {
            window += nums[i];
        }

        // Calculate the average of the first window
        double ans = window / k;

        // Slide the window through the array
        for (int right = k; right < n; right++) {

            // Remove the leftmost element and add the new element
            window = window + nums[right] - nums[right - k];

            // Update the maximum average
            ans = Math.max(ans, window / k);
        }

        // Return the maximum average
        return ans;
    }
}