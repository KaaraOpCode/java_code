/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stackbalanceofsymbols;

/**
 *
 * @author kaara
 */
public class Stackbalanceofsymbols {

    public static void main(String[] args) {
        String expression1 = "({[]})";
        String expression2 = "([)]";
        String expression3 = "{]()]}";
        String expression4 = "This (is) an unbalanced string!";
        
        System.out.println(expression1 + " is balanced : " + BalancedSymbolChecker.isBalanced(expression1));
        System.out.println(expression2 + " is balanced : " + BalancedSymbolChecker.isBalanced(expression2));
        System.out.println(expression3 + " is balanced : " + BalancedSymbolChecker.isBalanced(expression3));
        System.out.println(expression4 + " is balanced : " + BalancedSymbolChecker.isBalanced(expression4));
        
    }
}
