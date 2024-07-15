/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circularqueue;

/**
 *
 * @author kaara
 */
public class CircularQueue {
    
    private int [] arr;
    private int front;
    private int capacity;
    private int rear;
    
    public CircularQueue(int size){
        this.capacity = size;
        arr = new int[capacity];
        front = rear = - 1;
    }
    
    public boolean isEmpty(){
        return front == -1;
    }
    
    public boolean isFull(){
        return (rear + 1) % capacity == front;
    }
    
    public void enqueue (int data){
        if (isFull()) {
            System.out.println("Queue overflow!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
            arr[rear] = data;
        }
        
        else {
            rear = (rear + 1) % capacity;
            arr[rear] = data;
        }
    }
    
    public int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue underflow!");
            return -1; // Indicate error or a special value for empty queue
        }
        
        int data = arr[front];
        
        if (front == rear) {
            front = rear = -1;
        }
        else {
            front = (front + 1) % capacity;
        }
        
        return data;
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        // Handle circular printing
        int i;
        if (rear >= front) {
            // Print elements from front to rear
            for (i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            // Print elements from front to capacity and then from 0 to rear
            for (i = front; i < capacity; i++) {
                System.out.print(arr[i] + " ");
            }
            for (i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
        
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display(); // Output: 10 20 30

        int removed = queue.dequeue();
        System.out.println("Dequeued element: " + removed); // Output: Dequeued element: 10

        queue.enqueue(40);
        queue.enqueue(50);
        queue.display(); // Output: 20 30 40 50

        removed = queue.dequeue();
        System.out.println("Dequeued element: " + removed); // Output: Dequeued element: 20

        removed = queue.dequeue();
        System.out.println("Dequeued element: " + removed); // Output: Dequeued element: 30
    }
}
