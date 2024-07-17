/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tree101;

/**
 *
 * @author Eric
 */
public class Tree101 {

    public static void main(String[] args) {
        BinarySearchTree  bst = new BinarySearchTree();
        bst.insert(12);
        bst.insert(5);
        bst.insert(3);
        bst.insert(1);
        bst.insert(7);
        bst.insert(9);
        bst.insert(15);
        bst.insert(13);
        bst.insert(17);
        
         BinarySearchTree.TreeNode root = bst.getRoot();
        if (root != null) {
           
            bst.preOrder(root);

            System.out.println();
            root = bst.deleteNode(root, 7);
            bst.setRoot(root);
            bst.preOrder(root);
        } else {
            System.out.println("Tree is empty.");
        }
    }
}