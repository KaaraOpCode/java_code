/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bstoperations;

/**
 *
 * @author kaara
 */
public class BSTOperations {
    
    public static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        
        public TreeNode (int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    
    TreeNode root;
    
    public BSTOperations(){
        this.root = null;
    }
    
    private void insert(int value){
        this.root = insertNode(this.root, value);
    }
    
    public TreeNode insertNode(TreeNode node, int value){
        if(node == null){
            return new TreeNode(value);
        }
        if(value < node.value){
            node.left = insertNode(node.left, value);
        }
        else if(value > node.value){
            node.right = insertNode(node.right, value);
        }
        
        return node;
    }
    
    public void preOrderTraverse(TreeNode  root){
        if(root == null){
            return;
        }
        System.out.println(root.value + "");
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }
    
    public boolean search(int value){
        return searchNode(root, value);
    }
    
    private boolean searchNode(TreeNode node, int value){
        if(node == null){
            return false;
        }
        if(node.value  == value){
            return true;
        }
        else if( value < node.value){
            return searchNode(node.left, value);
        }
        else
            return searchNode(node.right, value);
    }
    
    public int findMin(){
        if(root == null){
            throw new IllegalStateException("Tree is empty");
        }
        
        TreeNode current = root;
        while(current.left!=null){
            current = current.left;
        }
        return current.value;
    }
    
    public int findMax(){
        if(root == null){
            throw new IllegalStateException("Tree is empty");
        }
        
        TreeNode current = root;
        while(current.right != null){
            current = current.right;
        }
        return current.value;
    }
    
    public boolean deleteLeafNode(int value){
        //check if tree is empty
        if(root == null ){
            return false;
        }
        
        TreeNode parent = null;
        TreeNode current = root;
        
        //find the node to delete
        while(current != null && current.value != value){
            parent = current;
            if(value < current.value){
                current = current.left;
            }
            else {
                current = current.right;
            }
        }
        
        //if the node with given value is not found
        if(current==null){
            return  false;
        }
        
        //if the node to delete is  the leaf node
        if(current.left == null && current.right == null){
            if(parent == null){
                root = null;
            }
            else if(parent.left == current){
                parent.left = null;
            }
            else {
                parent.right =  null;
            }
            return true;
        }
        return false; //the value is not a  leaf value
    }
    
    public boolean deleteNodeOneChild(int value){
        //check the tree empty
        if (root ==  null){
            return false;
        }
        //find the node tot delete and its parent
        TreeNode parent = null;
        TreeNode current = root;
        
        if(current!= null && current.value != value){
            parent = current;
            if (value < current.value){
                current = current.left;
            }
            else {
                current = current.right;
            }
        }
        //if the  node with the given value is not found
        if(current == null){
            return false;
        }
        
        //node to delete has one child, left or right
        if(current.left == null || current.right == null){
            //determines the child node of the current node
            TreeNode child;
            if(current.left != null){
                child = current.left;
            }
            else{
                child = current.right;
            }
            //if parent is root
            if(parent == null){
               root = child;
            }
            else if(parent.left == current){
                parent.left.left = child;
            } 
            else {
                parent.right.right = child;
            }
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        BSTOperations bst = new BSTOperations();
        bst.insert(12);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(13);
        bst.insert(17);
        bst.insert(1);
        bst.insert(9);
        
        //find min and max value
        System.out.println("The min value: "+ bst.findMin());
        System.out.println("The max value: "+ bst.findMax());
        
        //search for a value
        int searchValue = 13;
        
        if(bst.search(searchValue)){
            System.out.println("Value : "+ searchValue+ " found.");
        }
        else 
            System.out.println("Value : "+ searchValue + " not found.");
        
        //delete a leaf node
        /*int deleteValue = 17;
        if(bst.deleteLeafNode(deleteValue)){
            System.out.println("Node with value: " +deleteValue+" deleted.");
        }
        else {
            System.out.println("Node with value: " +deleteValue+" not deleted");
        }
        bst.preOrderTraverse(bst.root);*/
        
        //delete a node with one child
        int deleteVal = 7;
        if(bst.deleteNodeOneChild(deleteVal)){
            System.out.println("Node  with value: "+deleteVal+" deleted");
        }
        else {
            System.out.println("Node with value: " +deleteVal+ " not deleted");
        }
        
    }
}
