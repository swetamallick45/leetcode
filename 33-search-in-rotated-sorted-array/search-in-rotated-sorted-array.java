// class Solution {
//   public int search(int[] nums, int target) {
//     int l = 0;
//     int r = nums.length - 1;

//     while (l <= r) {
//       final int m = (l + r) / 2;
//       if (nums[m] == target)
//         return m;
//       if (nums[l] <= nums[m]) { // nums[l..m] are sorted.
//         if (nums[l] <= target && target < nums[m])
//           r = m - 1;
//         else
//           l = m + 1;
//       } else { // nums[m..n - 1] are sorted.
//         if (nums[m] < target && target <= nums[r])
//           l = m + 1;
//         else
//           r = m - 1;
//       }
//     }

//     return -1;
//   }
// }
class Solution {
    // Function to search target in rotated sorted array using binary search
    public int search(int[] nums, int target) {

        // Initialize search space
        int low = 0;
        int high = nums.length - 1;

        // Continue while there is still a valid search range
        while (low <= high) {

            // Calculate middle index
            int mid = (low + high) / 2;

            // If target found, return index
            if (nums[mid] == target)
                return mid;

            // If left part is sorted
            if (nums[low] <= nums[mid]) {

                // If target lies within sorted left part
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                }
                // Else, search in right half
                else {
                    low = mid + 1;
                }
            }

            // Else, right part is sorted
            else {

                // If target lies within sorted right part
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                }
                // Else, search in left half
                else {
                    high = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }
}

