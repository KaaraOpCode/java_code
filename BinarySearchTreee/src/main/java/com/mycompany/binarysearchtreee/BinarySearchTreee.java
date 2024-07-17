/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarysearchtreee;

/**
 *
 * @author kaara
 */
public class BinarySearchTreee {
    TreeNode root;
    
    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        
        public TreeNode (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
        public TreeNode getRoot(){
            return root;
        }
    }
    
    public void createTree(){
        TreeNode first = new TreeNode(2);
        TreeNode second = new TreeNode(1);
        TreeNode third = new TreeNode(4);
        TreeNode fourth = new TreeNode(8);
        TreeNode fifth = new TreeNode(7);
        
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }
    
    public void preOrderTraverse(TreeNode  root){
        if(root == null){
            return;
        }
        System.out.println(root.data + "");
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }
    
    public void insertNode(int data){
        root = insert(root, data);
        
    }
    
    private TreeNode insert(TreeNode node, int data){
        if(node==null){
          return new TreeNode(data);
        }
        if(data < node.data){
            node.left = insert(node.left, data);
        }
        else if (data > node.data){
            node.right = insert(node.right, data);
        }
        
        return node;
    }
    
    public static void main(String[] args) {
        BinarySearchTreee bst = new BinarySearchTreee();
        bst.createTree();
        
        bst.insertNode(3);
        bst.preOrderTraverse(bst.root);
    }
}
