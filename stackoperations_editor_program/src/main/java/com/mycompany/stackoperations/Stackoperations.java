/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stackoperations;

/**
 *
 * @author kaara
 */
public class Stackoperations {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        
        stack.displayStack();
        System.out.println("Elements after pop!");
        stack.pop();
        stack.pop();
        stack.displayStack();
    }
}
