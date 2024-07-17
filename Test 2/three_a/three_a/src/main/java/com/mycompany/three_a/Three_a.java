/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.three_a;

/**
 *
 * @author kaara
 */
public class Three_a {
    
    TreeNode root;
    
    
    public void createTree(){
        TreeNode first = new TreeNode (20);
        TreeNode second = new TreeNode (10);
        TreeNode third = new TreeNode (40);
        TreeNode fourth = new TreeNode (80);
        TreeNode fifth = new TreeNode (70);
        
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }
    
    public void preOrderTraverse(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data + "");
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }
    
    public void insertNode(int data) {
        root = insert(root, data);
    }
    
    private TreeNode insert(TreeNode node, int data) {
        if (node == null) {
            return new TreeNode(data);
        }
        
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        
        return node;
    }
    
    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        
        public TreeNode (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public TreeNode getRoot(){
        return root;
    }
    
    public int getHeight(TreeNode node) {
        if (node == null) { // Empty tree has height 0
            return 0;
        }

        // Find height of left and right subtrees
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        // Height of the current node is 1 + the maximum of left and right subtrees' heights
        return Math.max(leftHeight, rightHeight) - 1;
    }
    
    
    public static void main(String[] args) {
      
        Three_a myTree = new Three_a(); 
        myTree.createTree();
        
        // Insert 
        myTree.insertNode(50);
        myTree.insertNode(30);
        
        // Traverse 
        myTree.preOrderTraverse(myTree.getRoot());
        
        //find the height of tree from the root
        int rootHeight = myTree.getHeight(myTree.getRoot());
        System.out.println("\nHeight of the tree from the root: " + rootHeight);
        

    }
}
