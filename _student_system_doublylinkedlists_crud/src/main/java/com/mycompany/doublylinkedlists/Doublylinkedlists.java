/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doublylinkedlists;
import java.util.Scanner;

/**
 *
 * @author kaara
 */
public class Doublylinkedlists {

    public static void main(String[] args) {
        StudentManagementSystem studentSystem = new StudentManagementSystem();
        Scanner input = new Scanner(System.in);
        
        int choice = 0;
        do {
        System.out.println("******MENU*******");
        System.out.println("1.Add Student At Beginning:");
        System.out.println("2.Add Student At End:");
        System.out.println("3.Add Student At Index:");
        System.out.println("4.Delete Student At First:");
        System.out.println("5.Delete Student At End:");
        System.out.println("6.Delete Student At Index:");
        System.out.println("7.Search Student By Name:");
        System.out.println("8.Display Students:");
        System.out.println("9.Exit");
        System.out.println("Select Operation:");
        choice = input.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("Add Student At Beginning:");
                System.out.print("Enter Student Name: ");
                String name = input.next();
                studentSystem.addStudentAtBeginning(name);
//                System.out.println("Student Added Successfully : " + name);
                studentSystem.display();
                break;
            
            case 2: 
                System.out.println("Add Student At End:");
                System.out.print("Enter Student Name: ");
                String name0 = input.next();
                studentSystem.addStudentAtEnd(name0);
//                System.out.println("Student Added Successfully : " + name);
                studentSystem.display();
                break;
        
            case 3:
                System.out.println("Add Student At Position:");
                System.out.print("Enter Student Name: ");
                String name1 = input.next();
                System.out.println("Enter Index to Add Student");
                int index = input.nextInt();
                studentSystem.addStudentAtIndex(name1, index);
                System.out.println("Student Added Successfully!");
                break;
                
            case 4:
                studentSystem.deleteFirstStudent();
                System.out.println("The first student has been deleted!");
                studentSystem.display();
                break;
                
            case 5:
                studentSystem.deleteLastStudent();
                System.out.println("The last student has been deleted!");
                studentSystem.display();
                break;
                
            case 6:
                System.out.println("Insert index to delete:");
                int position = input.nextInt();
                studentSystem.deleteAtIndexStudent(position);
                System.out.println("The student has been deleted");
                studentSystem.display();
                break;
                
            case 7: 
                System.out.println("Search for student, enter name:");
                String studentName  = input.next();
                studentSystem.searchStudent(studentName);
                break;
            
            case 8: 
                studentSystem.display();
                break;
                
            default: 
                System.out.println("Invalid Choice");
        }
        
        }while(choice!=9);
        
       input.close();
    }
}
