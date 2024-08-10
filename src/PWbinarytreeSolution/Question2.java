package PWbinarytreeSolution;

import java.util.LinkedList;
import java.util.Queue;

/*
Q2. Given the root of a binary tree, check if it is a complete binary tree or not. A complete binary
tree is a binary tree in which every level, except possibly the last, is filled, and all nodes are as far
left as possible.
 */
public class Question2 {


        public static void main(String[] args) {
            BinaryTree1 tree = new BinaryTree1();
            tree.root = new TreeNode(1);
            tree.root.left = new TreeNode(2);
            tree.root.right = new TreeNode(3);
            tree.root.left.left = new TreeNode(4);
            tree.root.left.right = new TreeNode(5);
            tree.root.right.left = new TreeNode(6);

            if (tree.isCompleteBinaryTree(tree.root)) {
                System.out.println("The binary tree is a complete binary tree.");
            } else {
                System.out.println("The binary tree is not a complete binary tree.");
            }
        }
    }

class TreeNode2 {
    int val;
    TreeNode left, right;

    void TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryTree1 {
    TreeNode root;

    public boolean isCompleteBinaryTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean end = false; // Flag to indicate if we've encountered a null node

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current == null) {
                end = true;
            } else {
                if (end) {
                    return false;
                }

                queue.add(current.left);
                queue.add(current.right);
            }
        }

        return true; // If we've gone through the whole tree without issues, it's complete
    }

}
