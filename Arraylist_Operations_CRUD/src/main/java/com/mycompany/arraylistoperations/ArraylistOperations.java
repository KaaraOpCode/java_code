/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylistoperations;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kaara
 */
public class ArraylistOperations {
    public static ArrayList<Student> studentList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = 0;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student by Student Number");
            System.out.println("4. Display All Students");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    displayStudents();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        
        }while(choice != 0);
    }
    
    public static void addStudent(){
        System.out.println("Enter student name: ");
        String name = scanner.next();
        
        System.out.println("Enter student number: ");
        int studentNumber = scanner.nextInt();
        
        Student student = new Student(name, studentNumber);
        studentList.add(student);
        System.out.println("Student added!");
    }
    
    public static void removeStudent(){
        if (studentList.isEmpty()) {
            System.out.println("Student list is empty. Nothing to remove.");
            return;
        }

        System.out.println("Enter index of student to remove: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < studentList.size()) {
            studentList.remove(index);
            System.out.println("Student removed!");
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
        
    }
    
    public static void searchStudent(){
        System.out.println("Enter student number to search.");
        int studentNumber = scanner.nextInt();
        
        for (Student student : studentList){
            if(student.getStudentNumber() == studentNumber){
                System.out.println("Student found: " + student);
            }
        }
    }
    
    public static void displayStudents() {
        System.out.print("List of Students:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
