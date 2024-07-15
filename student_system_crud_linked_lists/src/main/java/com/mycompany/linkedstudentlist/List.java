/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedstudentlist;

/**
 *
 * @author kaara
 */
public class List {
    private Node head;
    
    public List (){
        this.head = null;
    }
    
    public void addStudent(Student student){
        Node newNode = new Node(student);
        newNode.next = head;
        head = newNode;
        System.out.println("Student added:  " + student);
    }
    
    public void deleteStudent(){
        if(head == null){
            System.out.println("List empty!");
        }
        
        Node temp = head;
        head = head.next;
        System.out.println("Student deleted : " + temp.data);
        temp.next = null;
    }
    
    public void display(){
        Node current =  head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    public int size(){
        int count = 0;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        System.out.println("Size of list : " + count);
        return count;
    }
    
    
    public void addAtPosition(Student student, int position){
    
        Node newNode = new Node(student);
        if(position == 0){
            newNode.next = head;
            head = newNode;
        }
        else {
            Node currentNode = head;
            for(int i = 0; i < position - 1; i++){
                currentNode = currentNode.next;
            }
            if(currentNode != null){
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
            else {
                System.out.println("Not added!");
            }
        }
        System.out.println("Student added at position" + position + ": " + student);
    }
    
    public void addAtEnd(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Student added at the end: " + student);
    }
    
    public void deleteAtEnd(){
        Node current = head;
        Node previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        System.out.println("Student deleted from the end: " + current.data);
        previous.next = null;
    }
    
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("Linked list is empty. Nothing to delete.");
            return;
        }

        if (position == 0) {
            Node temp = head;
            head = head.next;
            System.out.println("Student deleted from position 0: " + temp.data);
        } else {
            Node current = head;
            Node previous = null;
            for (int i = 0; i < position && current != null; i++) {
                previous = current;
                current = current.next;
            }
            if (current != null) {
                previous.next = current.next;
                current.next = null;
                System.out.println("Student deleted from position " + position + ": " + current.data);
            } else {
                System.out.println("Invalid position. Student not deleted.");
            }
        }
    }

    
}
