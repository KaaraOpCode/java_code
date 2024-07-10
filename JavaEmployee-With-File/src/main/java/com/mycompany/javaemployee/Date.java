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
public class Date implements Serializable{
        private int day;
        private int month;
        private int year;
        
        public Date()
        {
            day = 0;
            month = 0;
            year = 0;
        }
        
        public void setDay(int day)
        {
           this.day = day; 
        }
        public void setMonth(int month)
        {
             this.month = month;
        }
        public void setYear(int year)
        {
            this.year = year;
        }
        
        public void getDate()
        {
            System.out.println("The date is " + day + "/"+ month +"/"+ year);
        }
}
