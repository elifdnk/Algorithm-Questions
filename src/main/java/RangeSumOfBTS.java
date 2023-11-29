public class RangeSumOfBTS {

    public int rangeSumBST(TreeNode root,int low,int high){
        if(root==null)
            return 0;
        int sum =0;

        //explore the left sub tree
        if(root.val>low)
            sum +=rangeSumBST(root.left,low,high);

        //ıf value is in range add it to sum
        if(root.val>=low && root.val<=high)
            sum+= root.val;

        //explore the right sub-tree only if required
        if(root.val<high)
             sum+= rangeSumBST(root.right,low,high);

        return sum;
    }


}
/*
Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].
Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
 */