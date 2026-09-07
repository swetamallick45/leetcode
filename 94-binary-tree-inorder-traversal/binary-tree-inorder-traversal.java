/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer>result=new ArrayList();
        Stack<TreeNode>stk=new Stack();
        TreeNode curr=root;

        if(root==null){
            return result;
        }
        stk.push(curr);
        while(!stk.isEmpty()){

            while(curr!=null){
                //stk.push(curr.left);
                if(curr.left!=null){
                    stk.push(curr.left);
                }
                curr=curr.left;
            }

            TreeNode top=stk.peek();
            result.add(top.val);
            stk.pop();
            
            if(top.right!=null){
                curr=top.right;
                stk.push(curr);
            }
        }

        return result;
    }
}
