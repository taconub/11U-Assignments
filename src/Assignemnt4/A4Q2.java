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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ask the user for the measurement in inches they would like to convert to centiemetres
        System.out.println("What's the measurement?");
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        //get the measurement
        double measurement =input.nextDouble();
        //calculate the measurement in centirmetres
        double inches = 2.54 * measurement;
        //output the varible to the screen
        System.out.println("Thefore the measurement is " + inches +"cm" );
        
        
        
    }
}
