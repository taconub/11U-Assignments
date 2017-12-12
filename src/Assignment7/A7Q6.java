/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import becker.robots.City;
import java.util.Scanner;

public class A7Q6 {

    public void lastDigit(String num) {
        //if there is a negative in the string 
        if (num.charAt(0) == '-') {
            //turning the string version of the integer into a true integer 
            int numero = Integer.parseInt(num);
            //multiplying the integer by -1 to make it positive
            numero = numero * -1;

            //outputting the last digit to the user
            System.out.println("The last digit in the number is " + numero % 10 + ".");
        } else {
            //turning the string version of the integer into a true integer 
            int numero = Integer.parseInt(num);
            //outputting the last digit to the user
            System.out.println("The last digit in the number is " + numero % 10 + ".");
        }
    }

    public static void main(String[] args) {
        //creating a scaner for input
        Scanner in = new Scanner(System.in);
        //creating an obkect to run my code
        A7Q6 methodStarter = new A7Q6();
        //asking the user what the integer is 
        System.out.println("What's the interger?");
        //getting the interger
        String last = in.nextLine();
        //using the method to output some asteriks
        methodStarter.lastDigit(last);
    }
}