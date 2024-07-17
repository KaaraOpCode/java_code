/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.one_a;

/**
 *
 * @author kaara
 */
public class Stack {
    Node head;
    
    public Stack(){
        
    }
    
    public static class Node {
        int data;
        Node next;
        
        public Node (int data){
            this.data = data;
        }
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void push(int data){
        Node newNode = new Node (data);
        newNode.next = head;
        head = newNode;
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty!");
        }
        int data = head.data;
        head = head.next;
        return data;
    }
    
    public void displaystack(){
        Node current = head;
        while(current!=null){
            System.out.println("Stack List: "+current.data);
            current = current.next;
        }
    }
}
