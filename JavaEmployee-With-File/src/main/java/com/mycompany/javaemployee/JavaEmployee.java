/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaemployee;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author client
 */
public class JavaEmployee { 
    
    public static void createFile(List<Employee> collegues){
       try{
            FileOutputStream writeData = new FileOutputStream("peopledata.dat");
           try (ObjectOutputStream outputStream = new ObjectOutputStream(writeData)) {
               outputStream.writeObject(collegues);
               outputStream.flush();
               outputStream.close();
               System.out.println("********************************************The Object has been created!*****************************");
           }

        }catch (IOException e) {
            e.printStackTrace();
        }
       
    }
    
    public static List<Employee> readFile() throws ClassNotFoundException{
        List<Employee> collegues = new ArrayList<Employee>();
        try {
            FileInputStream readData = new FileInputStream("peopledata.dat");
            try (ObjectInputStream inputStream = new ObjectInputStream(readData)) {
                collegues = (List<Employee>)inputStream.readObject();
                inputStream.close();
                System.out.println("***********************************The Object has been read!*******************************");
                return collegues;
                
            }
                
        }
        catch (IOException e){
            e.printStackTrace();
        }
       return collegues;
    }
    
    
    public static void searchEmployee(String name, List<Employee> collegues)
    {
        boolean  found = false;
        String empName;
        for(Employee e: collegues)
        {
            
            empName = e.getName();
            if(empName.equalsIgnoreCase(name))
            {
                e.displayEmpInfo();
                found = true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("The user is not on the list");
        }
    }
     public static void salaryAnalysis(List<Employee> collegues)
    {
       double average,sum = 0.0;
       int counter = 0,countAbove = 0, countBelow = 0;
       
        for(Employee e: collegues)
        {
            sum = sum + e.getMonthlySalary();
            counter++;
        }
        average = sum/counter;
        for(Employee e: collegues)
        {
            if(e.getMonthlySalary()> average)
            {
                countAbove++;
            }
            else if(e.getMonthlySalary()< average)
                        {
                countBelow++;
            }
        }
        System.out.println("The average salary is : "+ average);
        System.out.println("There are "+countAbove+" employees above avarage \n" );
        System.out.println("There are "+countBelow+" employees below avarage \n" );
    }   
     
    public static void maxSalary(List<Employee> collegues) 
    {
        double maxSalary=0.00, salary = 0.00;
        String empName = "No name yet";
         for(Employee e: collegues)
        {
          salary = e.getMonthlySalary();
          if(salary > maxSalary )
          {
              maxSalary = salary;
              empName = e.getName();
          }
        }      
       System.out.println("\nMaximum Salary is  : " + maxSalary + "and it belongs to " + empName );
    }
    
    public static void main(String[] args) throws ClassNotFoundException {
       
       List <Employee> collegues = new ArrayList<Employee>();
       String name,searchedName;
       int number,day,month,year, age, numberOfEmployees, numberOfHours  ;
       Scanner keyboard = new Scanner(System.in);
       char empType;
       double anualSalary,hourlyRate;

       System.out.println("Enter the number of Employees\n");
       numberOfEmployees = keyboard.nextInt();
  
       for(int x = 0; x < numberOfEmployees; x++)
       {
       System.out.println("Enter the employee type (S\\H)");
       empType = keyboard.next().charAt(0);
       if( empType == 'S')
           {
            System.out.println("Enter the anual salary\n");
            anualSalary = keyboard.nextDouble();
            System.out.println("Enter Employee number\n");
            number = keyboard.nextInt();
            System.out.println("Enter Employee name\n");
            name = keyboard.next();
            System.out.println("Enter employee day hired \n");
               day = keyboard.nextInt();
               System.out.println("Enter employee month hired \n");
               month = keyboard.nextInt();
               System.out.println("Enter employee year hired \n");
               year = keyboard.nextInt();
               System.out.println("Enter the age \n");
               age =  keyboard.nextInt();
               
               
               Employee employee = new Salaried(anualSalary);
               employee.setName(name);
               employee.setEmpNum(number);
               employee.setHireDate(day, month, year);
               employee.setAge(age);
               
              collegues.add(employee);
           }
           else if(empType == 'H')
           {
               System.out.println("Enter the hourly rate\n");
               hourlyRate = keyboard.nextDouble();
               System.out.println("Enter the number of hour worked\n");
               numberOfHours = keyboard.nextInt();
               System.out.println("Enter Employee number\n");
               number = keyboard.nextInt();
               System.out.println("Enter Employee name\n");
               name = keyboard.next();
               System.out.println("Enter employee day hired \n");
               day = keyboard.nextInt();
               System.out.println("Enter employee month hired \n");
               month = keyboard.nextInt();
               System.out.println("Enter employee year hired \n");
               year = keyboard.nextInt();
               System.out.println("Enter the age \n");
               age =  keyboard.nextInt();
               
               
               Employee employee = new Hourly(hourlyRate,numberOfHours);
               employee.setName(name);
               employee.setEmpNum(number);
               employee.setHireDate(day, month, year);
               employee.setAge(age);
               
              collegues.add(employee);
           }
           else
           {
               System.out.println("Undefined User");
           }
        }           
        
        System.out.println("Employee  information");
        
        for(Employee e : collegues )
        {
            e.displayEmpInfo();
        }       
        
        //System.out.println("Enter the name of the employee to search for ");
        //searchedName = keyboard.next();
        //searchEmployee(searchedName, collegues);        
        //salaryAnalysis(collegues); 
        //maxSalary(collegues);     
        createFile(collegues);
        collegues = readFile();
        for(Employee emp : collegues){
            emp.displayEmpInfo();
        }
    }
    
}
