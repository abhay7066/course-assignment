package PWbinarytreeSolution;
import java.util.*;
/*
Given the root of a binary tree, return the left view of its nodes' values. Assume the left and
right child of a node makes a 45–degree angle with the parent.
 */
public class Question4 {


        public static void main(String[] args) {
            BinaryTree4 tree = new BinaryTree4();
            tree.root = new TreeNode(1);
            tree.root.left = new TreeNode(2);
            tree.root.right = new TreeNode(3);
            tree.root.left.left = new TreeNode(4);
            tree.root.left.right = new TreeNode(5);
            tree.root.right.right = new TreeNode(7);

            List<Integer> leftView = tree.leftView(tree.root);

            System.out.println("Left View of the Binary Tree:");
            for (int val : leftView) {
                System.out.print(val + " ");
            }
        }
    }
class TreeNode4 {
    int val;
    TreeNode left, right;

    TreeNode4(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryTree4 {
    TreeNode root;

    public List<Integer> leftView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                // The first node of each level is part of the left view
                if (i == 0) {
                    result.add(node.val);
                }

                // Add left and right children to the queue
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return result;
    }
}
