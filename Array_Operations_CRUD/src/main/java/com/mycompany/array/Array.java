/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

import java.util.Scanner;

/**
 *
 * @author kaara
 */
public class Array {
    private static final int MAX_SIZE = 20;
    private int[] array;
    private int size;
    
    public Array(){
        array = new int [MAX_SIZE];
        size = 0;
    }
    
    public void insert (int element){
        if(size <= MAX_SIZE){
            array[size++] = element;
            System.out.println("Element inserted!");
        }
        else {
            System.out.println("Array is full");
        }
    }
    
    public void add(int index, int element){
        if(size < MAX_SIZE && index >= 0 && index <=  size){
            for(int i = size-1; i >= index; i--){
                array[i + 1] = array[i];
            }
            array[index] = element;
            size++;
            System.out.println("Element added!");
        }
        else {
            System.out.println("Index not found!");
        }
    }
    
    public void display(){
        if(size > 0){
            System.out.println("Array elements: ");
            for(int i = 0; i < size; i++){
                System.out.println(array[i] + "");
            }
            System.out.println();
        }
        else {
            System.out.println("Array is empty");
        }
    }
    
    public void displayAt(int index){
        if(index >= 0 && index < size){
            System.out.println("Element at index: " + index + ":" + array[index]);
        }
        else
            System.out.println("Index not found");
    }
    
    public void deleteAt(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            System.out.println("Element at index " + index + " deleted successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }
    
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert element");
            System.out.println("2. Add element at index");
            System.out.println("3. Delete element at index");
            System.out.println("4. Display array");
            System.out.println("5. Display element at index");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            switch(choice){
                case 1: 
                    System.out.println("Insert elenement]");
                    int element = scanner.nextInt();
                    insert(element);
                    break;
                    
                case 2: 
                    System.out.println("Enter index to add");
                    int index = scanner.nextInt();
                    System.out.println("Enter element to add");
                    int elementToAdd = scanner.nextInt();
                    add(index, elementToAdd);
                    break;
                    
                case 3: 
                    System.out.print("Enter index to delete: ");
                    int indexToDelete = scanner.nextInt();
                    deleteAt(indexToDelete);
                    break;
                    
                case 4: 
                    display();
                    break;
                    
                case 5: 
                    System.out.print("Enter index to display: ");
                    int indexToDisplay = scanner.nextInt();
                    displayAt(indexToDisplay);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");

            }
            
        }
        while (choice != 0);
    }
    
    public static void main(String[] args) {
        Array arrayOperations = new Array();
        arrayOperations.menu();
    }
    
}
