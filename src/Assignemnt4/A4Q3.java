/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignemnt4;

import java.util.Scanner;

/**
 *
 * @author nagra2700
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ask the user for 4 number  
        System.out.println("What are the numbers");
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        //output the request to the screen
        System.out.println("Please enter 4 numbers on seprate lines ");
        //get the numbers
        double numero =input.nextDouble();
        double numer =input.nextDouble();
        double numeron =input.nextDouble();
        double nubmer =input.nextDouble();
        //output the varible to the screen
        System.out.print("These are the numbers are ");
        System.out.print(numero);
        System.out.print(", "+ numer);
        System.out.print(", "+ numeron);
        System.out.print(", "+ nubmer);
        
    }
}
