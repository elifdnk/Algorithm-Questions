import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public List<Integer> inorderTraversal(TreeNode root) {

            List<Integer> output = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();

            TreeNode node = root;

            if (node == null) return output;
            while (node != null || !stack.isEmpty()) {
                while (node != null) {
                    stack.add(node);
                    node = node.left;
                }
                node = stack.pop();
                output.add(node.val);
                node = node.right;

            }
            return output;

        }
    }
}

/*
Question-1 Binary Tree Inorder Traversal
Given the root of a binary tree, return the inorder traversal of its nodes' values.
Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2: Example 3:
Input: root = [] Input: root = [1]
Output: [] Output: [1]
Constraints:
• The number of nodes in the tree is in the range [0, 100].
• -100 <= Node.val <= 100
Follow up: Recursive solution is trivial, could you do it iteratively?
 */