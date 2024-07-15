/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackbalanceofsymbols;

/**
 *
 * @author kaara
 */
public class BalancedSymbolChecker {
    
    private static final char [] OPENING_BRACKETS= {'{', '(', '['};
    private static final char [] CLOSING_BRACKETS= {'}',')',']' };
    
    public static boolean isBalanced(String expression){
        Stack<Character> stack = new Stack<>();
        
        for (char c : expression.toCharArray()){
            if (isOpeningBracket(c)){
                stack.push(c);
            }
            else if(isClosingBracket(c)){
                if(stack.isEmpty() || !isMatchingPair(stack.pop(),  c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    private static boolean isOpeningBracket(char c){
        for(char bracket : OPENING_BRACKETS){
            if(bracket==c){
                return true;
            }
        }
        return false;
    }
    
    private static boolean isClosingBracket(char c){
        for(char bracket : CLOSING_BRACKETS){
            if(bracket==c){
            return true;
            }
        }
        return false;
    }
    
   private static boolean isMatchingPair(char opening, char closing){
       int openingIndex = indexOf(opening, OPENING_BRACKETS);
       int closingIndex = indexOf(closing, CLOSING_BRACKETS);
       if(openingIndex != -1 && closingIndex != -1 && openingIndex == closingIndex){
           return true;
       }
       return false;
   }
   
   private static int indexOf(char c, char [] array){
       for(int i = 0; i < array.length; i++){
           if(array[i] == c){
               return i;
           }
       }
       return -1;
   }
    
    
    public static class Stack<T>{
        private Node<T> head;
        private static class Node <T>{
            T data;
            Node next;
            
            public Node (T data){
                this.data = data;
            }
        }
        
        public void push (T data){
            Node newNode =  new Node (data);
            newNode.next = head;
            head = newNode;
        }
        
        public T pop(){
            if(isEmpty()){
                System.out.println("The stack empty!");
            }
            T data= head.data;
            head = head.next;
            return data;
        }
        
        public boolean isEmpty(){
            return head == null;
        }
    }
}
