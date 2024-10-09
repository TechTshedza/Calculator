/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Muthivhi Tshedza
 */
public class Calculator {

    public static void main(String[] args) {
         double num1, num2, result;
        int option;

        // Prompt user for two numbers
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        String input2 = JOptionPane.showInputDialog("Enter the second number:");
        
        num1 = Double.parseDouble(input1);
        num2 = Double.parseDouble(input2);

        // Menu loop
        while (true) {
            // Menu options
            String menu = "Choose an option:\n" +
                          "1. Addition\n" +
                          "2. Subtraction\n" +
                          "3. Multiplication\n" +
                          "4. Division\n" +
                          "0. Exit";
            String optionInput = JOptionPane.showInputDialog(menu);
            option = Integer.parseInt(optionInput);

            // Make calculation from user options
            switch (option) {
                case 1:
                    result = num1 + num2;
                    JOptionPane.showMessageDialog(null, "Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    JOptionPane.showMessageDialog(null, "Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    JOptionPane.showMessageDialog(null, "Result: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        JOptionPane.showMessageDialog(null, "Result: " + result);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero!");
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Calculation not recognized");
            }
        }
    }
}