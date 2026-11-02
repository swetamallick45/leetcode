class Solution {
    public int countSegments(String s) {
        int count = 0;
        boolean inSegment = false;

        // Iterate through the characters in the string
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                // If the character is not a space, we are in a segment
                if (!inSegment) {
                    inSegment = true;
                    count++;
                }
            } else {
                // If the character is a space, we are not in a segment
                inSegment = false;
            }
        }
        return count;
    }
}