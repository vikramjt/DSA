package org.example.binarytreelevelordertraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTreeLevelOrderTraversalApplication {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(10);
        root.right.right.right = new TreeNode(14);

        Solution solution = new Solution();
        List<List<Integer>> result = solution.levelOrder(root);

        System.out.println(result); // Output: [[3], [9, 20], [15, 7]]
    }

    public static class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {

            List<List<Integer>> ans = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            if (root == null) return ans;
            q.offer(root);
            while (!q.isEmpty()){
                List<Integer> row = new ArrayList<>();
                int n = q.size();
                for (int i =0; i< n ; i++){
                    TreeNode front = q.poll();
                    row.add(front.val);
                    if (front.left != null) q.offer(front.left);
                    if (front.right != null) q.offer(front.right);
                }
                ans.add(row);
            }
            return ans;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
