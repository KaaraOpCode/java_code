/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentystem;
import  java.util.Scanner;
/**
 *
 * @author kaara
 */
public class Studentystem {

    public static void main(String[] args) {
        StudentNodeList list = new StudentNodeList();
        Scanner input = new Scanner(System.in);
        
        int choice = 0;
        do {
            
        System.out.println("******MENU SINGLY LINKED LIST******");
        System.out.println("1. Add First Node");
        System.out.println("2. Add End Node");
        System.out.println("3. Add At Index");
        System.out.println("4. Delete First Node");
        System.out.println("5. Delete Last Node");
        System.out.println("6. Delete At Index");
        System.out.println("7. Search By Node");
        System.out.println("8. Display All Nodes");
        System.out.println("0. Exit");
        
        System.out.println("Enter Choice!");
        choice = input.nextInt();
        
        switch(choice) {
            case 1: System.out.println("Add First Node");
                    System.out.println("Enter Name: ");
                    String name = input.next();
                    list.addStudentFirst(name);
                    list.display();
                    break;
            case 2: System.out.println("Add End Node");
                    System.out.println("Enter Name: ");
                    String name1 = input.next();
                    list.addStudentLast(name1);
                    list.display();
                    break;
            case 3: System.out.println("Add At Index");
                    System.out.println("Enter Name: ");
                    String name2 = input.next();
                    System.out.println("Enter Position: ");
                    int pos = input.nextInt();
                    list.addStudentAtPosition(name2, pos);
                    list.display();
                    break;
            case 4: System.out.println("Delete First Node");
                    list.deleteStudentFirst();
                    list.display();
                    break;
            case 5: System.out.println("Delete First Node");
                    list.deleteStudentLast();
                    list.display();
                    break;
            case 6: System.out.println("Delete At Index");
                    System.out.println("Enter Position");
                    int pos1 = input.nextInt();
                    list.deleteStudentByPosition(pos1);
                    list.display();
                    break;
            case 7: System.out.println("Search Student");
                    System.out.println("Enter Name");
                    String name3 = input.next();
                    list.SearchStudent(name3);
                    break;
                    
                    
        }
            
        }
        while(choice !=0);
        
    }
}
