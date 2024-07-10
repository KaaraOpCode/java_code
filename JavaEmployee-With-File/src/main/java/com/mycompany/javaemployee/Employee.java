/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaemployee;
import java.io.Serializable;
/**
 *
 * @author client
 */
public class Employee implements Serializable{
       private int empNum;
       private String name;
       private Date dateOfHire;
       private int age;
    
       public Employee()
       {
           empNum = 0;
           name = "No name yet";
           dateOfHire = new Date();
       }
       
       public void setEmpNum(int empNumber)
       {
           this.empNum = empNumber;       
       }
       public void setName(String empName)
       {
           this.name = empName;
       }
       public void setHireDate(int day ,int month ,int year )
       {
          dateOfHire.setDay(day);
          dateOfHire.setMonth(month);
          dateOfHire.setYear(year);
       }
       
       public void setAge(int age)
       {
           this.age = age;
       }
       public String getName()
       {
           return name;
       }
       
       public void displayEmpInfo()
       {
          System.out.println("Employee Number : " + empNum);
          System.out.println("Employee Name : " + name);
          System.out.println("Date of Hire : " );
          dateOfHire.getDate();
          System.out.println("Employee Age : " + age );
       }
       public double getMonthlySalary()
       {
           return 0.00;        
       }      
}
