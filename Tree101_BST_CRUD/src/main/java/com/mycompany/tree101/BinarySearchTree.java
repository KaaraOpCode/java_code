/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tree101;

import java.util.NoSuchElementException;

/**
 *
 * @author Eric
 */
public class BinarySearchTree {
    private TreeNode root;
    
    public class TreeNode{
        private int data; // Generic type
        private TreeNode left;
        private TreeNode right;
       
        public TreeNode(int data){
            this.data = data;
    
             }
    
    }
     public void setRoot(TreeNode newRoot) {
        this.root = newRoot;
    }
    public TreeNode getRoot(){
    
    return root;
    }
     public void preOrder(TreeNode root){
    
    if(root == null){
     return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
    
    }
    
    
    public void insert(int value){
    root = insert(root, value);
    }
 
    public TreeNode insert(TreeNode root, int value){
    if(root == null){
    root = new TreeNode(value);
    return root;
    }
    if (value < root.data){
    root.left = insert(root.left,value);
    }
    
    else{
     root.right = insert(root.right, value);
    }
    
    return root;
    }
    public TreeNode search(int key){
    return search(root, key); 
    }
    
    private TreeNode search(TreeNode root, int key){
     if(root == null || root.data == key){
     return root;
     }
     if (key < root.data){
      return search(root.left, key);      
     }
     else{
     return search(root.right, key);
     }
    
    }
    
    
    public TreeNode findMin(TreeNode root) {
    if (root == null) {
        throw new NoSuchElementException("Tree is empty");
    }
    TreeNode current = root;
    while (current.left != null) {
        current = current.left;
    }
    return current;
}
 public TreeNode findMax(TreeNode root){
     if (root == null) {
        throw new NoSuchElementException("Tree is empty");
    }
    TreeNode current = root;
    while (current.right != null) {
        current = current.right;
    }
    return current;
 }  
 
 public boolean isLeafNode(TreeNode node) {
    return node.left == null && node.right == null;
}

public boolean hasChildren(TreeNode node) {
    return node.left != null || node.right != null;
}
public TreeNode deleteNode(TreeNode root, int value){
 if(isLeafNode(root)){
 deleteLeafNode(root,value);
 }
 if(hasChildren(root)){
     deleteNodeWithChild(root,value);
     
 
 }
 return root;

}
 
public TreeNode deleteLeafNode(TreeNode root, int value) {
    if (root == null) {
        return null;  // Node not found
    }

    if (root.data == value && root.left == null && root.right == null) {
        return null;  // Leaf node found, set its parent's reference to null
    }

    root.left = deleteLeafNode(root.left, value);
    root.right = deleteLeafNode(root.right, value);
    
    // Check if either left or right subtree is a leaf node with the given value
    if (root.left != null && root.left.data == value && root.left.left == null && root.left.right == null) {
        root.left = null;  // Remove the leaf node from the left subtree
    }
    if (root.right != null && root.right.data == value && root.right.left == null && root.right.right == null) {
        root.right = null;  // Remove the leaf node from the right subtree
    }

    return root;  // Return the potentially modified subtree
}

public TreeNode deleteNodeWithChild(TreeNode root, int value){
    if (root == null) {
        return null;  // Node not found
    }
    
   if (root.data == value) {
        // Node to be deleted found
        if (root.left == null) {
            return root.right;  // Replace with its right child
        } else if (root.right == null) {
            return root.left;  // Replace with its left child
        } else {
           
            TreeNode successor = findMin(root.right); 
            root.data = successor.data;
            root.right = deleteNodeWithChild(root.right, successor.data);
        }
    }
     root.left = deleteNodeWithChild(root.left, value);
     root.right = deleteNodeWithChild(root.right, value);
    
    
    return root;
    


}



 

    
    
}
