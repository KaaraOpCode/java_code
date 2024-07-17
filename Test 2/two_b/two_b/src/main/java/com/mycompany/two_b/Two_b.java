/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.two_b;

/**
 *
 * @author kaara
 */
public class Two_b {

    private Stack stack1; 
    private Stack stack2; 

    public Two_b() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
        }

        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    


    public static void main(String[] args) {
        Two_b queue = new Two_b();

        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(2);
        queue.enqueue(1);
        

        System.out.println(queue.dequeue());  // Output: 10

        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue.dequeue());  // Output: 20
        System.out.println(queue.dequeue());  // Output: 30
        System.out.println(queue.dequeue());  // Output: 40
        System.out.println(queue.dequeue());  // Output: 50

        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        }
    }
}
