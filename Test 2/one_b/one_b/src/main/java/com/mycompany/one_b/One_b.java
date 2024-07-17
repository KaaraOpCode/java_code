/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.one_b;
import java.util.Stack;

/**
 *
 * @author kaara
 */
public class One_b {
    
    public static String convertInfixToPostFix(String infixExpression){
        Stack<Character> operatorStack = new Stack<>();
        StringBuilder postFixExpression = new StringBuilder();
        
        for(char ch : infixExpression.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                postFixExpression.append(ch);
            }
            else if(ch == '('){
                operatorStack.push(ch);
            }
            else if(ch == ')'){
                while(!operatorStack.isEmpty() && operatorStack.peek() != '('){
                    postFixExpression.append(operatorStack.pop());
                }
                operatorStack.pop();
            }
            else {
                while(!operatorStack.isEmpty() && getPrecedence(ch) <= getPrecedence(operatorStack.peek()) ){
                    postFixExpression.append(operatorStack.pop());
                }
                operatorStack.push(ch);
            }
        }
        
        while(!operatorStack.isEmpty()){
            postFixExpression.append(operatorStack.pop());
        }
        
        return postFixExpression.toString();
        
    }
    
    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0; // Handle unexpected characters
        }
    }
    

    public static void main(String[] args) {
        String infixExpression = "a+b-c";
        String postfixExpression = convertInfixToPostFix(infixExpression);
        
        System.out.println("Original infix expression: " + infixExpression);
        System.out.println("Converted postfix expression: " + postfixExpression);
    }
}
