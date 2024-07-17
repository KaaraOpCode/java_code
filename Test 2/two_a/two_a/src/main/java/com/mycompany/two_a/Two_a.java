/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.two_a;

/**
 *
 * @author kaara
 */
public class Two_a {

    public static void main(String[] args) {
        Queue queue = new Queue(6);
        System.out.println("The queue elements after enqueue operation!");
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(2);
        queue.enqueue(1);
        
        
        //display
        queue.displayQueue();
      
        int removed = queue.dequeue();
        System.out.println("The dequeued element : " + removed);
        queue.displayQueue();
         /* 
        int removed1 = queue.dequeue();
        System.out.println("The dequeued element : " + removed1);
        System.out.println();
        
        System.out.println("The queue elements after dequeue operation!");
        queue.displayQueue();*/
    }
}
