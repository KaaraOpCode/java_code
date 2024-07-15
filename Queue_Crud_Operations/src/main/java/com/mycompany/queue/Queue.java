/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queue;

import java.util.Arrays;

/**
 *
 * @author kaara
 */
public class Queue {
    final private int [] arr;
    private int front;
    private int rear;
    final private int capacity;
    
    public Queue (int size){
        this.capacity = size;
        arr = new int [capacity];
        front = this.rear -1;
    }
    
    public boolean isEmpty(){
        return front == -1;
    }
    
    public boolean isFull(){
        return rear == capacity - 1;
    }
    
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue Overflow!");
            return;
        }
        
        else if(isEmpty()){
            front=rear=0;
            arr[rear]=data;
        }
        else {
            rear++;
            arr[rear]=data;
        }
    }
    
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue underflow!");
            return -1;
        }
        int data = arr[front];
        if(front==rear){
            front = rear = - 1;
        }
        else {
            front++;
        }
        return data;
    }
    
    public void display (){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        
        for (int i = front; i<=rear; i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
        
    }
    
    

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        
        queue.display();
        
        int removed = queue.dequeue();
        System.out.println("Dequeued element: " + removed);
        
        int removed1 = queue.dequeue();
        System.out.println("Dequeued element: " + removed1); 
        
        int removed2 = queue.dequeue();
        System.out.println("Dequeued element: " + removed2); 
        
        int removed3 = queue.dequeue();
        System.out.println("Dequeued element: " + removed3); 
        
        int removed4 = queue.dequeue();
        System.out.println("Dequeued element: " + removed4); 

        queue.display();
        
        queue.enqueue(10);
        queue.display();
    }
}