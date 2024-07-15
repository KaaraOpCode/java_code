/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linkedstudentlist;

/**
 *
 * @author kaara
 */
public class Linkedstudentlist {

    public static void main(String[] args) {
        List studentList = new List();
        
       //add and delete  at the beginning
       /* studentList.addStudent(new Student("Kaara"));
        studentList.addStudent(new Student("Lefora"));
        studentList.addStudent(new Student("Seeiso"));
        
        System.out.println("Display contents.");
        studentList.display();
        studentList.size();
        
        studentList.deleteStudent();
        
        System.out.println("Show contents after delete.");
        studentList.display();
        studentList.size();*/
     
       //add and delete at the end
       /*studentList.addAtEnd(new Student("Kaara"));
       studentList.addAtEnd(new Student("Ntswaki"));
       studentList.addAtEnd(new Student("Lineo"));
       studentList.addAtEnd(new Student("KEKKE"));
       System.out.println();
       
       System.out.println();
       System.out.println();
       System.out.println();
       studentList.display();
       
       studentList.deleteAtEnd();
       
       studentList.display(); */
       
       
        // add and delete anywhere in the list
       studentList.addAtPosition(new Student("Kaara"), 0);
       studentList.addAtPosition(new Student("Trust"), 1);
       studentList.addAtPosition(new Student("Keke"), 2);
       studentList.addAtPosition(new Student("Lefora"), 3);
       System.out.println();
       
       studentList.display();
       
       System.out.println();
       System.out.println();
       System.out.println();
       studentList.deleteAtPosition(0);
       
       System.out.println();
       studentList.display();
        
    }
}
