/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author nagra2700
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        //creating a place holder if the order needs to be switched
        double orders0 = 0;
        //need 2 squares
        double[] order = new double[2];
        String[] orderName = new String[2];
        //string the names of the numbers into the array
        orderName[0] = "first";
        orderName[1] = "second";
        //use a loop to get all the info
        for (int i = 0; i < order.length; i++) {
            //asking the user what the marks are
            System.out.println("What's the " + orderName[i] + " number?");
            //getting the numbers
            order[i] = input.nextDouble();
        }
        //if the first number is bigger than the second number 
        if (order[0] > order[1]) {
            //using the place holder to turn the double arrays into a double
            orders0 = orders0 + order[0];
            //changing the value of the spots in the array so the smaller number is prior to the bigger number
            order[0] = order[1];
            order[1] = orders0;
        }
        //telling the user the ascending order of the number
        System.out.println("The intergers in ascending order are: " + order[0] + ", " + order[1]);
    }
}
