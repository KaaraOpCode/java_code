/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylistex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author cipher
 */
public class StudentManager {
 


/**
 *
 * @author Eric
 */

    // ArrayList to hold Student objects
    private ArrayList<student> studentList;
    private Scanner scanner;

    // Constructor
    public StudentManager() {
        studentList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    public void addStudent() {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student number:");
        int studentNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        
        // Create a new Student object with user input and add it to the ArrayList
        student newStudent = new student(name, studentNumber);
        studentList.add(newStudent);
        
        System.out.println("Student added successfully.");
    }
    public void deleteStudentByName(String nameToDelete) {
        
        Iterator<student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            student student = iterator.next();
            if (student.getName().equals(nameToDelete)) {
                iterator.remove();
                System.out.println("Student '" + nameToDelete + "' deleted successfully.");
                return; // Exit the method after deleting the first occurrence
            }
        }
        System.out.println("Student with name '" + nameToDelete + "' not found.");
    }

         

 public void searchStudentByNumber(int studentNumberToSearch) {
        for (student student : studentList) {
            if (student.getStudentNumber() == studentNumberToSearch) {
                System.out.println("Student found:");
                System.out.println("Name: " + student.getName() + ", Student Number: " + student.getStudentNumber());
                return;
            }
        }
        System.out.println("Student with student number '" + studentNumberToSearch + "' not found.");
    }

 public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("List of all students:");
            for (student student : studentList) {
                System.out.println("Name: " + student.getName() + ", Student Number: " + student.getStudentNumber());
            }
        }
    }

        
      
        public void displayMenu() {
        int choice = 0;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student by name");
            System.out.println("3. Search Student by Student Number");
            System.out.println("4. Display all student");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                   addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    System.out.println("Enter the student number to search:");
                    int studentNumberToSearch = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    searchStudentByNumber(studentNumberToSearch);
                    break;
                case 4:
                    displayAllStudents();
                    break;
               
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
    }

        
        
        public class student {
    // Attributes
    private String name;
    private int studentNumber;
    
    // Constructor
    public student(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getStudentNumber() {
        return studentNumber;
    }
    
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    
    
    
    
    
    
    }

    
    
      }