/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaemployee;

/**
 *
 * @author client
 */
public class Hourly extends Employee {
    
    private double hourlyRate;    
    private int numberOfHours;

    public Hourly(double hourlyRate, int numberOfHours) {
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
    }    

    /**
     * Get the value of numberOfHours
     *
     * @return the value of numberOfHours
     */
    public double getNumberOfHours() {
        return numberOfHours;
    }

    /**
     * Set the value of numberOfHours
     *
     * @param numberOfHours new value of numberOfHours
     */
    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    /**
     * Get the value of hourlyRate
     *
     * @return the value of hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Set the value of hourlyRate
     *
     * @param hourlyRate new value of hourlyRate
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }    
   @Override
    public double getMonthlySalary()
    {
        double monthlySalary;      
        monthlySalary = this.getHourlyRate()* this.getNumberOfHours();
        return monthlySalary;
    }
    @Override
     public void displayEmpInfo()
     {
         super.displayEmpInfo();
         System.out.println("Hourly Rate :"+ getHourlyRate()+ "Number of hours " +numberOfHours+  " Monthly Salary : "+ getMonthlySalary());
     }

}
