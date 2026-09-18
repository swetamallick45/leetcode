class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
         
         for(char ch : s.toCharArray()){
            int len = sb.length();
            if (len > 0 &&
                Character.toLowerCase(sb.charAt(len - 1)) ==
                Character.toLowerCase(ch) &&
                sb.charAt(len - 1) != ch) {

                // Remove the last character
                // because it forms a bad pair with ch
                sb.deleteCharAt(len - 1);

            } else {

                // No bad pair → keep the current character
                sb.append(ch);
            }
        }

        // Convert StringBuilder into String
        return sb.toString();
    }
}