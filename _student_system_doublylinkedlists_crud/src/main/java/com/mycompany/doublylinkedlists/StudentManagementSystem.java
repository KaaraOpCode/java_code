/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doublylinkedlists;

/**
 *
 * @author kaara
 */
public class StudentManagementSystem {
    
        class Student {
        String name;
        Student prev;
        Student next;

        public Student(){}

        public Student(String name) {
            this.name = name;
            this.prev = null;
            this.next = null;
        }
    }
    
    private Student head;
    private Student tail;
    
    public StudentManagementSystem(){
        this.head = null;
        this.tail = null;
    }
    
    public void addStudentAtBeginning(String name) {
        Student newStudent = new Student(name);
        
        if (head == null){
            head = newStudent;
            tail = newStudent;
        }
        
        else {
            newStudent.next = head;
            head.prev =  newStudent;
            head = newStudent;
        }
        
    }
    
    public void addStudentAtEnd(String name){
        Student newStudent = new Student (name);
        
        if (head == null){
            head = newStudent;
            tail =  newStudent;
        }
        else {
            tail.next = newStudent;
            newStudent.prev = tail;
            tail = newStudent;
        }
        
    }
    
    public void addStudentAtIndex(String name, int position){
        Student newStudent = new Student (name);
        if(head == null){
            head = newStudent;
            tail = newStudent;
        }
        else {
            Student current = head;
            int count = 0;
            
            while (current != null && count < position -1){
                current = current.next;
                count++;
            }
            
            if(current  == null){
                throw new IndexOutOfBoundsException("Position is out of list bound");
            }
            newStudent.next = current.next;
            if(current.next != null){
                current.next.prev = newStudent;
            }
            else {
                tail = newStudent;
            }
            current.next = newStudent;
            newStudent.prev = current;  
        }
    }
    
    public void deleteFirstStudent(){
        if (head == null){
            System.out.println("List empty");
            return;
        }
        if (head == tail){
            head = null;
            tail = null;
        }
        //Node current = head;
        else {
            head = head.next;
            head.prev = null;
        }
    }
    
    public void deleteLastStudent(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        if (head == tail){
            head = null;
            tail = null;
        }
        else {
            Student current = head;
            while (current != tail){
                current = current.next;
            }
            tail = current;
            current.next = null;
        }
        
    }
    
    public void deleteAtIndexStudent(int position){
        if (head != null && position == 0){
            head = head.next;
            if(head!=null){
                head.prev = null;
            }
        }
        else if (position > 0){
            Student current = head;
            int count = 1;
            while(current != null && count < position){
                current = current.next;
                count++;
            }
            if (current == null){
                throw new IndexOutOfBoundsException("Position out of list bound");
            }
            if (current.prev != null){
                current.prev.next = current.next;
            }
            else {
                head = current.next;
            }
            if(current.next != null){
                current.next.prev = current.prev;
            }
            else {
                tail = current.prev;
            }
            
        }
    }
    
    public void searchStudent(String studentName){
        if (head != null){
            Student current = head;
            
            while (current != null){
                if(current.name.equals(studentName)){
                   System.out.println("Student found : "+ current.name +"!");
                }
                else {
                    System.out.println("Student not found ! ");
                }
                current = current.next;
            }
        }
        else {
            System.out.println("List empty!");
        }
    }
    
    public void display (){
        System.out.println("Student List");
        Student current = head;
        while (current != null){
            System.out.println("Students : " + current.name);
            current = current.next;
        }
    } 
    
    
}
