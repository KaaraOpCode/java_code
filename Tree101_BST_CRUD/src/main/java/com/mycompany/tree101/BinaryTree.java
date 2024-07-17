/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tree101;

import static java.lang.Integer.MIN_VALUE;
import java.util.Stack;

/**
 *
 * @author Eric
 */
public class BinaryTree {
    private TreeNode root;
    
    private class TreeNode{
        
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data = data;
    
             }
    
    }
    
    public void createBinarytree(){
    TreeNode first = new TreeNode(1);
    TreeNode second = new TreeNode(2);
    TreeNode third = new TreeNode(3);
    TreeNode fourth = new TreeNode(4);
    TreeNode fifth = new TreeNode(5);
    root = first;
    first.left = second;
    first.right = third;
    
    second.left= fourth;
    third.right = fifth;
    
    }
    public void preOrder(TreeNode root){
    
    if(root == null){
     return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
    
    }
    public void preOrderTRaversalUsingStack(){
    if (root == null){
      return;
    
    }
    Stack<TreeNode> stack = new Stack();
    stack.push(root);
    while(!stack.isEmpty()){
    TreeNode temp = stack.pop();
    System.out.println(temp.data + " " );
    if (temp.right != null){
      stack.push(temp);
    }
    if (temp.left != null){
      stack.push(temp);
    }
    }
    }
    
    public void inOrder(TreeNode root){
    
    if(root == null){
     return;
    }
    preOrder(root.left);
    System.out.print(root.data + " ");
    preOrder(root.right);
    }
    public void inOrderTraversalUsingStack(){
    
    if(root == null){
     return;
    }
    Stack<TreeNode> stack = new Stack();
    TreeNode temp = root;
    while(!stack.isEmpty() || temp != null){
     if(temp != null){
     stack.push(temp);
     temp = temp.left;
     }else{
      temp = stack.pop();
      System.out.println(temp.data+ " ");
      temp = temp.right;
     
     }
    }
    
    }
    
    public void postOrder(TreeNode root){
        if(root == null){
     return;
    }
    preOrder(root.left);
    preOrder(root.right);
    System.out.print(root.data + " ");
    }
    
    public void postOrderTraversalUsingStack(){
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while(current != null || !stack.isEmpty()){
        
        if(current !=null){
         stack.push(current);
         current = current.left;}
         else{
                 TreeNode temp = stack.peek().right;
                 if(temp == null){
                 
                 temp = stack.pop();
                 System.out.println(temp.data + " ");
                 while(!stack.isEmpty() && temp == stack.peek().right){
                 
                 temp = stack.pop();
                 System.out.println(temp.data + " ");
                 
                 }
                 }else{
                 current = temp;
                 }
                 }
        }
        }
     public int findMax(){
     return findMax(root);
     }
    
    
    
        public int findMax(TreeNode root){
        if (root == null){
         return MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if(left > result){
         result = left;
        }
        if (right > result){
         result = right;
        }
        return result;
        }
        
    }


    
    
    
    


