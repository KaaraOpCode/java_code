/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unitscalculatorrevisit;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author kaara
 */
public class UnitsCalculatorRevisit  extends JFrame{
    
    
        JTextField txtNumOfUnits = new JTextField("Enter number of units");
        JTextField txtPricePerUnit = new JTextField("Enter price per unit");
        JTextField txtTotalBill = new JTextField("Total");
        
        JButton btnCalculate = new JButton("Calculate");  
       
    public UnitsCalculatorRevisit(){
        
        JPanel panel = new JPanel();
        panel.add(txtNumOfUnits);
        panel.add(txtPricePerUnit);
        panel.add(txtTotalBill);
        panel.add(btnCalculate);
        
        add(panel);  
        
        
        btnCalculate.addActionListener(new bntCalculateListner());
    }    
    

    public static void main(String[] args) {
        
        
        UnitsCalculatorRevisit calculator = new UnitsCalculatorRevisit();
        calculator.setTitle("Calculator");
        calculator.pack();
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setVisible(true);
        
    }    
    
    public class bntCalculateListner implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        double numOfUnits =  Double.parseDouble( txtNumOfUnits.getText());
        double pricePerUnit =  Double.parseDouble( txtPricePerUnit.getText());
        
        double totalBill = numOfUnits * pricePerUnit;
        
        txtTotalBill.setText(Double.toString(totalBill));
                
        }
}

}
