class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int left = 0;
        int right = 0;
        int maxCount = 0;
        int maxLength = 0;

        while (right < s.length()) {

            // Add current character
            freq[s.charAt(right) - 'A']++;

            // Maximum frequency in current window
            maxCount = Math.max(maxCount, freq[s.charAt(right) - 'A']);

            // If replacements needed > k, shrink window
            while ((right - left + 1) - maxCount > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Update answer
            maxLength = Math.max(maxLength, right - left + 1);

            // Move right
            right++;
        }

        return maxLength;
    }
}