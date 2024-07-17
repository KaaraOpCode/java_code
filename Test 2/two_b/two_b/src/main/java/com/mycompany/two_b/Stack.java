/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.two_b;

/**
 *
 * @author kaara
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Stack {
    private Node head;
    
    public Stack (){}
    
    public static class Node {
        int data;
        Node next;
        
        public  Node (int data){
            this.data = data;
            }
        }
        
        public void push(int data){
            Node newNode = new Node (data);
            newNode.next = head;
            head = newNode;
        }
        
        public boolean isEmpty(){
            return head == null;
        }
        
        public int pop(){
            if (isEmpty()){
                System.out.println("List is empty!");
            }
            int data = head.data;
            head = head.next;
            return data;
        }
        
        public  int size(){
            int count = 0;
            Node  current = head;
            while(current!=null){
                count++;
                current = current.next;
            }
            return count;
        }
        
        public void displayStack (){
            Node current = head;
            while (current!=null){
                System.out.println("List : "+current.data);
                current = current.next;
            }
        }
        
        
}
