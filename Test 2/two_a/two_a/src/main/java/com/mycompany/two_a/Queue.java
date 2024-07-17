/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.two_a;

/**
 *
 * @author kaara
 */
public class Queue {
    private int [] arrayQueue;
    private int front;
    private int rear;
    private int capacity;
    
    public Queue(int size){
        this.capacity = size;
        this.arrayQueue = new int[capacity];
        this.front = this.rear-1;
    }
    
    public boolean isEmpty(){
        return front == -1;
    }
    
    public boolean isFull(){
        return rear == capacity - 1;
    }
    
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue capacity has been reached!");
            return;
        }
        else if (isEmpty()){
            front = rear = 0;
            arrayQueue[rear] = data;
        }
        
        else {
            rear++;
            arrayQueue[rear] = data;
        }
    }
    
    public int dequeue (){
        if(isEmpty()){
            System.out.println("Queue is empty, nothing to dequeue");
        }
        int data = arrayQueue[front];
        if(front == rear){
            front = rear = -1;
        }
        else{
            front++;
        }
        return data;
    }
    
    public void displayQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty, nothing to display");
        }
        for (int i = front; i < rear; i++){
            System.out.println(arrayQueue[i]+"");
        }
        System.out.println();
    }
}
