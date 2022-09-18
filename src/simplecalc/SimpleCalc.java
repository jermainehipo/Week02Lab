/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalc;
import java.util.Scanner;
/**
 * Simple Calculator
 * Calculator that allows the user to do arithmetic calculations.
 * @author Jermaine Hipolito
 * @version September 17, 2022
 */
public class SimpleCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What operation would you like to do?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4, Division");
        
        int operation = scan.nextInt();

        System.out.println("Enter first integer:");
        int firstNum = scan.nextInt();
        
        System.out.println("Enter second interger:");
        int secondNum = scan.nextInt();
        
        double result = 0;
        if(operation == 1){
            result = (double)firstNum + secondNum;
        } else if(operation == 2){
            result = (double)firstNum - secondNum;
        } else if(operation == 3){
            result = (double)firstNum * secondNum;
        } else if(operation == 4){
            result = (double)firstNum / secondNum;
        } else {
            System.out.println("Invalid operation input!");
        }
        
        System.out.println("Result: " + result);
        
    }
    
}
