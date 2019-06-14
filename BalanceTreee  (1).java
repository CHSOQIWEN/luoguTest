package com.bittch.Day_23;

/**
 * https://www.nowcoder.com/questionTerminal/b6bbed48cd864cf09a34a6ca14a3976f
 * @author CHAOQIWEN
 * @data 2019/6/14 0:58
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class BalanceTree {
    public static int Deepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Deepth(root.left);
        int right=Deepth(root.right);
        if(left>right){
            return left+1;
        }else {
            return right+1;
        }
    }
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root==null){
            return true;
        }
        int highcha=Deepth(root.left)-Deepth(root.right);
        if(highcha>1||highcha<-1){
            return false;
        }
        return isBalance(root.right)&&isBalance(root.left);
    }
}
