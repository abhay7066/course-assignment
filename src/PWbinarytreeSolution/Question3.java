package PWbinarytreeSolution;

import java.util.*;

/*
Q3. Given the root of a binary tree, return the reverse level order traversal of its nodes' values. The
solution should consider the binary tree nodes level by level in bottom-up order from left to right,
i.e., process all nodes of the last level first, followed by all nodes of the second last level, and so on.
 */
public class Question3 {


        public static void main(String[] args) {
            BinaryTree3 tree = new BinaryTree3();
            tree.root = new TreeNode(1);
            tree.root.left = new TreeNode(2);
            tree.root.right = new TreeNode(3);
            tree.root.left.left = new TreeNode(4);
            tree.root.left.right = new TreeNode(5);
            tree.root.right.left = new TreeNode(6);
            tree.root.right.right = new TreeNode(7);

            List<Integer> reverseLevelOrder = tree.reverseLevelOrder(tree.root);

            System.out.println("Reverse Level Order Traversal:");
            for (int val : reverseLevelOrder) {
                System.out.print(val + " ");
            }
        }
    }

class TreeNode3 {
    int val;
    TreeNode left, right;

    TreeNode3(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryTree3 {
    TreeNode root;

    public List<Integer> reverseLevelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            stack.push(node);

            // Enqueue right child first so that left child is processed first during the stack pop
            if (node.right != null) {
                queue.add(node.right);
            }
            if (node.left != null) {
                queue.add(node.left);
            }
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop().val);
        }

        return result;
    }
}
