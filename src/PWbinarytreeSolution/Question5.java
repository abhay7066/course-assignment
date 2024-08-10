package PWbinarytreeSolution;
import java.util.*;
/*
Given the root of a binary tree, convert the binary tree into its mirror and print it’s pre order
 */
public class Question5 {



        public static void main(String[] args) {
            BinaryTree5 tree = new BinaryTree5();
            tree.root = new TreeNode(1);
            tree.root.left = new TreeNode(2);
            tree.root.right = new TreeNode(3);
            tree.root.left.left = new TreeNode(4);
            tree.root.left.right = new TreeNode(5);
            tree.root.right.left = new TreeNode(6);
            tree.root.right.right = new TreeNode(7);

            System.out.println("Original Tree Preorder:");
            tree.preOrder(tree.root);
            System.out.println();

            // Mirror the binary tree
            tree.mirror(tree.root);

            System.out.println("Mirrored Tree Preorder:");
            tree.preOrder(tree.root);
        }
    }

class TreeNode5 {
    int val;
    TreeNode left, right;

    TreeNode5(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryTree5 {
    TreeNode root;

    // Function to mirror the binary tree
    public void mirror(TreeNode node) {
        if (node == null) {
            return;
        }

        // Swap the left and right children
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        // Recursively mirror the left and right subtrees
        mirror(node.left);
        mirror(node.right);
    }

    // Function to perform preorder traversal
    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        // Print the value of the node
        System.out.print(node.val + " ");

        // Recur for the left and right subtree
        preOrder(node.left);
        preOrder(node.right);
    }
}
