/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.one.studentroster;

/**
 *
 * @author client
 */
import java.io.*;

class Student implements Serializable {
    private String name;
    private int[] testScores;
    private String finalGrade;

    public Student(String name, int[] testScores) {
        this.name = name;
        this.testScores = testScores;
        this.finalGrade = computeCourseGrade();
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getTestScores() {
        return testScores;
    }

    public void setTestScores(int[] testScores) {
        this.testScores = testScores;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }
    
    public String computeCourseGrade() {
        int average = calculateAverage();
        if(average > 70) {
            return   "Pass";
        }
        else 
            return "No Pass";
    }

    public int calculateAverage() {
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        return sum / testScores.length;
    }

    // Overloaded toString method for formatted output
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("Name: ").append(name).append("\nTest Scores: ");

        for (int i = 0; i < testScores.length; i++) {
            result.append(testScores[i]);
            if (i < testScores.length - 1) {
                result.append(", ");
            }
        }

        result.append("\nFinal Grade: ").append(finalGrade);

        return result.toString();
    }

}
