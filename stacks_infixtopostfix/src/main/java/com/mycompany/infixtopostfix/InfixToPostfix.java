/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.infixtopostfix;
import java.util.Stack;

/**
 *
 * @author kaara
 */

public class InfixToPostfix {

    public static String convertToPostfix(String infixExpression) {
        Stack<Character> operatorStack = new Stack<>();
        StringBuilder postfixExpression = new StringBuilder();

        for (char ch : infixExpression.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                postfixExpression.append(ch); // Append operands directly
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfixExpression.append(operatorStack.pop());
                }
                operatorStack.pop(); // Remove the '('
            } else { // Operator processing
                while (!operatorStack.isEmpty() && getPrecedence(ch) <= getPrecedence(operatorStack.peek())) {
                    postfixExpression.append(operatorStack.pop());
                }
                operatorStack.push(ch);
            }
        }

        // Append remaining operators from the stack
        while (!operatorStack.isEmpty()) {
            postfixExpression.append(operatorStack.pop());
        }

        return postfixExpression.toString();
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
        String infixExpression = "a-(b*c-d)/e";
        String postfixExpression = convertToPostfix(infixExpression);
        System.out.println("Original infix expression: " + infixExpression);
        System.out.println("Converted postfix expression: " + postfixExpression);
    }
}

