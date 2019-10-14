package difficulty.easy;

import vo.TreeNode;

/**
 * @program: LeetCode
 * @description: 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 * 说明: 叶子节点是指没有子节点的节点。
 * @author: huzhpm
 * @create: 2019-10-13 12:49
 **/
public class Test112 {
    /**
     * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
     * 说明: 叶子节点是指没有子节点的节点
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null && root.val == sum){
            return true;
        }
        int cur = sum - root.val;
        return hasPathSum(root.left, cur) || hasPathSum(root.right, cur);
    }
}
