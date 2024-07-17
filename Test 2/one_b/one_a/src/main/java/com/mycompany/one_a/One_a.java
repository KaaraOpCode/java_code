/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.one_a;

/**
 *
 * @author kaara
 */
public class One_a {

    public static void main(String[] args) {
        Stack stack = new Stack();
        
        //push
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("The stack after push operations!");
        //display
        stack.displaystack();
        //pop
        stack.pop();
        stack.pop();
        System.out.println("The stack after pop operations!");
        //display
        stack.displaystack();
        
    }
}
