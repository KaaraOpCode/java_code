///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.graphsadjecencymatrix;
//
///**
// *
// * @author kaara
// */
//public class Graph {
//   Node root;
//   
//   public Graph(){
//       root = null;
//   }
//   
//   public void insert(int key){
//       insertNode(root, key);
//   }
//   
//   public Node insertNode (Node root, int key){
//       if(root == null){
//           root = new Node(key);
//           return root;
//       }
//       if (key < root.data){
//           root.left = insertNode(root.left, key);
//       }
//       else if (key > root.data){
//           root.right = insertNode(root.right, key);
//       }
//       return root;
//   }
//   
//   public void adjacencyMatrix(){
//       boolean [][] matrix = new boolean [4][4];
//       
//       for(int i = 0; i < 4; i++){
//           for (int j = 0; j < 4; j++){
//               matrix[i][j] = false;
//           }
//       }
//       
//       System.out.println("Adjacency MAtrix:");
//       for(int i = 0; i < 4; i++){
//           for(int j = 0; i < 4; j++){
//               System.out.println((matrix[i][j] ? 1 : 0)+ "");
//           }
//           System.out.println();
//       }
//       
//   }
//   
//   public void adjacencyMatrixRecursive(Node root, boolean matrix[][]){
//       if(root==null){
//           return;
//       }
//       if(root.left != null){
//           matrix[root.data][root.left.data] = true;
//       }
//       if(root.right!=null){
//           matrix[root.data][root.right.data] = true;
//       }
//       adjacencyMatrixRecursive(root.left, matrix);
//       adjacencyMatrixRecursive(root.right, matrix);
//       
//   }
//   
//   
//}
