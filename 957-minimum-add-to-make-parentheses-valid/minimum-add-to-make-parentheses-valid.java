class Solution {
    public int minAddToMakeValid(String s) {

        int open = 0;       // Count of unmatched '('
        int closing = 0;    // Count of extra ')' that need '('

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                open++;     // Found an opening bracket
            } 
            else {
                // We found ')'

                if (open > 0) {
                    // There is a matching '(' available
                    open--;
                } 
                else {
                    // No '(' available to match this ')'
                    // So we need to insert one '('
                    closing++;
                }
            }
        }

        // open = unmatched '(' → need these many ')'
        // closing = unmatched ')' → need these many '('
        return open + closing;
    }
}