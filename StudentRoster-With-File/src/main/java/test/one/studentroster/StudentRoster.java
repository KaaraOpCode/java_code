/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.one.studentroster;

/**
 *
 * @author client
 */
import java.util.Scanner;

public class StudentRoster {
    public static void main(String[] args) {
        ClassRoster classRoster = new ClassRoster();
        Scanner scanner = new Scanner(System.in);

        // Adding students to the roster
        System.out.print("Enter the number of students to add: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numStudents; i++) {
            classRoster.addStudent();
        }
        
        

        // Searching for a student
        System.out.print("Enter the name of the student to search: ");
        String searchName = scanner.nextLine();
        Student foundStudent = classRoster.searchStudent(searchName);
        if (foundStudent != null) {
            System.out.println("Found student: " + foundStudent.getName());
        } else {
            System.out.println("Student not found.");
        }

        // Deleting a student
        System.out.print("Enter the name of the student to delete: ");
        String deleteName = scanner.nextLine();
        classRoster.deleteStudent(deleteName);

        // Writing roster to an external binary file
        classRoster.writeRosterToFile("roster.dat");

        // Reading roster from the external binary file
        classRoster.readRosterFromFile("roster.dat");

        // Displaying the roster
        classRoster.displayRoster();
    }
}
