package com.company;

/**
 * Created by laileon on 2017/7/20.
 */
//二叉树

//深度优先：先访问子节点，再访问父节点，最后访问第二个子节点。根据根节点相对于左右子节点的访问先后顺序又可细分为以下三种方式。
//            前序(pre-order)：先根后左再右
//            中序(in-order)：先左后根再右
//            后序(post-order)：先左后右再根
//广度优先：先访问根节点，沿着树的宽度遍历子节点，直到所有节点均被访问为止。


// Binary Search Tree - 二叉查找树
//
// 一颗二叉查找树(BST)是一颗二叉树，其中每个节点都含有一个可进行比较的键及相应的值，且每个节点的键都大于等于左子树中的任意节点的键，而小于右子树中的任意节点的键。
//
// 使用中序遍历可得到有序数组，这是二叉查找树的又一个重要特征。


public class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
