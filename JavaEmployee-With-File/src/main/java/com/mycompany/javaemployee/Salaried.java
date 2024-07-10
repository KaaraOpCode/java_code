/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaemployee;

/**
 *
 * @author client
 */
public class Salaried extends Employee {
    private double annualSalary;

    public Salaried(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }
    
    @Override
    public double getMonthlySalary()
    {
        double monthlySalary;        
        monthlySalary = this.getAnnualSalary()/12;                
        return monthlySalary;
    }
    @Override
     public void displayEmpInfo()
     {
         super.displayEmpInfo();
         System.out.println("Anual Salary :"+ getAnnualSalary()+" Monthly Salary : "+ getMonthlySalary());
     }
    
}

