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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        //asking the user what the ticket price is
        System.out.println("What's the price for the ticket?");
        // adding dollar sign to be more specific
        System.out.print("$");
        //getting the ticket price
        Double ticket = input.nextDouble();

        //asking the user what the price is for the food
        System.out.println("What's the price for the food?");
        // adding dollar sign to be more specific
        System.out.print("$");
        //getting the price for the food
        Double foodprice = input.nextDouble();

        //asking the user what the price is for the DJ
        System.out.println("What's the price for the DJ?");
        // adding dollar sign to be more specific
        System.out.print("$");
        //getting the price for the DJ
        Double djprice = input.nextDouble();

        //asking the user what the price is for the hall
        System.out.println("What's the price for the hall?");
        // adding dollar sign to be more specific
        System.out.print("$");
        //getting the price for the hall
        Double hallprice = input.nextDouble();

        //asking the user what the price is for the decorations
        System.out.println("What's the price for the decorations?");
        // adding dollar sign to be more specific
        System.out.print("$");
        //getting the price for the decorations
        Double decorprice = input.nextDouble();

        //asking the user what the price is for the staff
        System.out.println("What's the price for the staff?");
        // adding dollar sign to be more specific
        System.out.print("$");
        //getting the price for the staff
        Double staffprice = input.nextDouble();

        //asking the user what the price is for the miscellaneous items
        System.out.println("What's the price for the miscellaneous items?");
        // adding dollar sign to be more specific
        System.out.print("$");
        //getting the price for the miscellaneous items
        Double miscprice = input.nextDouble();

        //adding up the total cort of all the expenses
        Double totalprice = foodprice + djprice + hallprice + decorprice + staffprice + miscprice;

        //dividing the total price by ticket amount to see how many need to be sold to break even
        Double breakingeven = totalprice / ticket;
        //putting the total price and the amount of tickets that need to be sold onto the screen
        System.out.println("The total expenses add up to " + totalprice + " so " + breakingeven + " tickets need to be sold to break even.");
    }
}
