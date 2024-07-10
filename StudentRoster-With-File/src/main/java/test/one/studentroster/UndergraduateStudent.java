/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.one.studentroster;

/**
 *
 * @author client
 */
class UndergraduateStudent extends Student {
    
    public UndergraduateStudent(String name, int[] testScores) {
        super(name, testScores);
    }

    @Override
    public String computeCourseGrade() {
        int average = calculateAverage();
        if(average > 70) {
            return   "Pass";
        }
        else 
            return "No Pass";
    }
}