/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentystem;

/**
 *
 * @author kaara
 */
public class StudentNodeList {
    
    public class Student {
    private String name;
    private Student next;
    
    public Student (String name){
        this.name = name;
        this.next = null;
    }

    public Student() {
            
        }
    }
    
    
    private Student head;
    
    public StudentNodeList(){
        head = null;
    }
    
    public void addStudentFirst(String name){
        Student newStudent = new Student(name);
        if (head == null){
            head = newStudent;
        }
        else {
            newStudent.next = head;
            head = newStudent;
        }
    }
    
    public void addStudentLast(String name){
        Student newStudent = new Student(name);
        if(head == null){
            head = newStudent;
        }
        else {
            Student current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newStudent;
            System.out.println("Student Added Successfully!");
        }
    }
    
    public void addStudentAtPosition(String name, int position){
        Student newStudent = new Student(name);
        if (head == null){
            System.out.println("Position not found!");
            return;
        }
        else {
            Student current = head;
            int count = 1;
            while (current != null && count < position - 1){
                current = current.next;
                count++;
            }
            if (current == null){
                System.out.println("Position not found!");
                return;
            }
            newStudent.next = current.next;
            current.next = newStudent;
            System.out.println("Student Added Successfully!");
            
        }
    }
    
    public void deleteStudentFirst (){
        if (head != null){
            head = head.next;
        }
    }
    
    public void deleteStudentLast () {
        if (head != null){
            if (head.next == null){
                head = null;
            }
            else {
                Student current = head;
                while(current.next.next != null){
                    current = current.next;
                }
                current.next = null;
            }
        }
    }
    
    public void deleteStudentByPosition(int position){
        if (head != null && position >= 0){
            if (position == 0){
                head = head.next;
                return;
            }
            Student current = head;
            int count = 1;
            while(count < position - 1 && current != null){
                current = current.next;
                count++;
            }
            current.next = current.next.next;
        }
    }
    
    public void SearchStudent (String name){
        if(head == null){
            System.out.println("Student Not Found!");
            return;
        }
        else {
            Student current = head;
            while (current!=null){
                if(current.name.equalsIgnoreCase(name)){
                    System.out.println("Student Found : " + current.name);
                }
                current = current.next;
            }
        }
    }
    
    public void display (){
        Student current = head;
        while (current != null){
            System.out.println("Students : " + current.name);
            current = current.next;
        }
    } 
}
