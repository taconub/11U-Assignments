/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author nagra2700
 */
public class A7Q4 {

    public double compoundInterest(double r, double p, double n) {
        //using the initail amount of money, the interest rate and amount of time to find the balance
        double answer = p * (Math.pow(1 + r, n));
        return answer;
    }

    public static void main(String[] args) {
        //creating a scanner for input
        Scanner in = new Scanner(System.in);
        //creating an object to run my code
        A7Q4 interesting = new A7Q4();
        //asking the user their initial amount of money
        System.out.println("What's the initial amount of money?");
        System.out.print("$");
        //getting the amount of money
        double principle = in.nextDouble();
        //asking the user what the interest rate
        System.out.println("What's the interest rate?");
        System.out.print("%");
        //getting the rare
        double rate = in.nextDouble() / 100.0;
        //asking the user how long they would like
        System.out.println("How many years would you like?");
        //getting the amount of time
        double time = in.nextDouble();
        //using the method to find the compound interest
        double interest = interesting.compoundInterest(rate, principle, time);
        //printing out the amount of interest
        System.out.println("The balance is " + interest + ".");
    }
}
