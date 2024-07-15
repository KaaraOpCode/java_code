/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedstudentlist;

/**
 *
 * @author kaara
 */
public class Student {
    String name;
    
    public Student (String name){
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "name : " +name;
    }
}
