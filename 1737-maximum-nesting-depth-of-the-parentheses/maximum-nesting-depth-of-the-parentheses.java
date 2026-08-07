class Solution {
    public int maxDepth(String s) {
        int curDepth = 0;
        int maxdePth = 0;
        for(char ch:s.toCharArray()){
            if(ch =='('){
                curDepth++;
            }else if(ch == ')'){
                curDepth--;
            }
            maxdePth = Math.max(maxdePth, curDepth);
        }
        return maxdePth;
    }
}