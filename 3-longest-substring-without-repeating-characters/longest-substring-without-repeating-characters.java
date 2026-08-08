import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();

        int[] hash = new int[256];
        Arrays.fill(hash, -1);

        int l = 0;
        int r = 0;
        int maxLen = 0;

        while (r < n) {

            if (hash[s.charAt(r)] != -1) {
                l = Math.max(hash[s.charAt(r)] + 1, l);
            }

            int len = r - l + 1;
            maxLen = Math.max(maxLen, len);

            hash[s.charAt(r)] = r;

            r++;
        }

        return maxLen;
    }
}