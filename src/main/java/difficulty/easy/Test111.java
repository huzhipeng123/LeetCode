package difficulty.easy;

import vo.TreeNode;

/**
 * @Author huzhpm
 * @Date 2019/10/13 16:47
 * @Version 1.0
 * @Content 给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class Test111 {
    /**
     * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int lminDepth = minDepth(root.left);
        int rminDepth = minDepth(root.right);
        if(root.left != null && root.right != null){
            return Math.min(lminDepth, rminDepth) + 1;
        }else{
            return lminDepth + rminDepth + 1;
        }
    }
}
