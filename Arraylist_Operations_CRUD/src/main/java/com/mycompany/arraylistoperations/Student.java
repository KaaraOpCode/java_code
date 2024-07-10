/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylistoperations;

/**
 *
 * @author kaara
 */
public class Student {
    private String name;
    private int studentNumber;
    
    public Student (String name, int studentNumber){
        this.name = name;
        this.studentNumber = studentNumber;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }
    
    public String getName(){
        return name;
    }
    
    public int getStudentNumber(){
        return studentNumber;
    }
    
    @Override 
    public String toString(){
        return "Student{" +
                    "name='" + name + '\'' +
                    ", studentNumber=" + studentNumber +
                    '}';
    }
}
