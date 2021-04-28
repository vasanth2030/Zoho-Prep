package Zoho;
import java.util.*;
public class heightOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.right=new TreeNode(20);
        root.right.right=new TreeNode(30);
        root.left=new TreeNode(50);
        root.right.left=new TreeNode(60);
        System.out.println(heightOfTree(root));
    }
    static int heightOfTree(TreeNode root)
    {
        if(root==null)
            return 0;
        else
            return Math.max(heightOfTree(root.left),heightOfTree(root.right))+1;
    }

}
class TreeNode{
    TreeNode left,right;
    int key;
    TreeNode(int data)
    {
        key=data;
        left=right=null;
    }
}
