/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.one_a;

/**
 *
 * @author kaara
 */
public class One_a {

    private Node top; 

    
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public One_a() {
        this.top = null; 
    }

    // Push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data); 
        newNode.next = top; 
        top = newNode; 
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) { 
            System.out.println("Stack is empty");
            return -1; 
        }

        Node temp = top; 
        top = top.next; 
        return temp.data; 
    }

   
    public boolean isEmpty() {
        return top == null;
    }

    
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Node current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        One_a stack = new One_a();

        stack.push(6);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        
        //display stack 10, 20, 30
        stack.display(); 

        System.out.println(stack.pop());
        //display 10, 20
       // stack.display(); 

       // System.out.println(stack.pop());
       // System.out.println(stack.pop()); 
        //display empty stack
        stack.display(); 

    }
}
