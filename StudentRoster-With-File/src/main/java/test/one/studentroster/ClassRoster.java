/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.one.studentroster;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author client
 */
class ClassRoster {
    public ArrayList<Student> roster;

    public ClassRoster() {
        roster = new ArrayList<>();
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter three test scores NB: space-separated input): ");
        String[] scoresInput = scanner.nextLine().split(" ");
        int[] testScores = new int[3];
        for (int i = 0; i < 3; i++) {
            testScores[i] = Integer.parseInt(scoresInput[i]);
        }
        
        System.out.print("Enter student type (undergraduate/graduate): ");
        String studentType = scanner.nextLine();

        switch (studentType.toLowerCase()) {
            case "undergraduate":
                roster.add(new UndergraduateStudent(name, testScores));
                break;
            case "graduate":
                roster.add(new GraduateStudent(name, testScores));
                break;
            default:
                System.out.println("Invalid type.");
                break;
            }

    }

    public Student searchStudent(String name) {
        for (Student student : roster) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(String name) {
        Student student = searchStudent(name);
        if (student != null) {
            roster.remove(student);
        } else {
            System.out.println("Student not found!");
        }
    }

    public void writeRosterToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(roster);
            System.out.println("********************************The Object has been created!*****************************");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void readRosterFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            roster = (ArrayList<Student>) ois.readObject();
            System.out.println("***********************************The Object has been read!*******************************");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void displayRoster() {
        for (Student student : roster) {
            System.out.println(student);
            System.out.println("-------------");
        }
    }
}
