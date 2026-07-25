/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    int max;
    public int diameter(Node root) {
        max = 0;
        height(root);
        return max;
        
    }
    public int height(Node root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight= height(root.right);
        max = Math.max(max,leftHeight+rightHeight);
        return 1+Math.max(leftHeight,rightHeight);
    }
}