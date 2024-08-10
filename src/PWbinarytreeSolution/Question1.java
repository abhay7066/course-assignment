package PWbinarytreeSolution;
/*
Given the root of a binary tree, return the spiral level order traversal of its nodes' values. The
solution should consider the binary tree nodes level by level in spiral order, i.e., all nodes present
at level 1 should be processed first from left to right, followed by nodes of level 2 from right to left,
followed by nodes of level 3 from left to right and so on... In other words, odd levels should be
processed from left to right, and even levels should be processed from right to left.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Question1 {



        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root = new TreeNode(1);
            tree.root.left = new TreeNode(2);
            tree.root.right = new TreeNode(3);
            tree.root.left.left = new TreeNode(4);
            tree.root.left.right = new TreeNode(5);
            tree.root.right.left = new TreeNode(6);
            tree.root.right.right = new TreeNode(7);

            List<List<Integer>> spiralOrder = tree.spiralOrderTraversal(tree.root);

            System.out.println("Spiral Level Order Traversal:");
            for (List<Integer> level : spiralOrder) {
                System.out.println(level);
            }
        }
    }
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public List<List<Integer>> spiralOrderTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack1 = new Stack<>(); // For odd levels
        Stack<TreeNode> stack2 = new Stack<>(); // For even levels

        stack1.push(root);

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            List<Integer> level = new ArrayList<>();

            while (!stack1.isEmpty()) {
                TreeNode temp = stack1.pop();
                level.add(temp.val);

                if (temp.left != null) {
                    stack2.push(temp.left);
                }
                if (temp.right != null) {
                    stack2.push(temp.right);
                }
            }

            if (!level.isEmpty()) {
                result.add(level);
            }

            level = new ArrayList<>();

            while (!stack2.isEmpty()) {
                TreeNode temp = stack2.pop();
                level.add(temp.val);

                if (temp.right != null) {
                    stack1.push(temp.right);
                }
                if (temp.left != null) {
                    stack1.push(temp.left);
                }
            }

            if (!level.isEmpty()) {
                result.add(level);
            }
        }

        return result;
    }

}
