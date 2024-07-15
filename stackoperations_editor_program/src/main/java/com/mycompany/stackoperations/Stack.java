/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackoperations;

/**
 *
 * @author kaara
 */
public class Stack {
    private int data [];
    private int top;
    
    public Stack(int size){
        data =  new int[size];
        top = -1;
    }
    
    public void push(int element){
        if(isFull()){
            System.out.println("The stack is full!");
        }
        data[++top] = element;
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty!");
        }
        return data[--top];
    }
    
    public boolean isFull(){
        return top == data.length-1;
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public int size(){
        return top + 1;
    }
    
    public void displayStack(){
        for(int i = 0; i <= top; i++){
        System.out.println(data[i] + ",");
        }
    }
}
