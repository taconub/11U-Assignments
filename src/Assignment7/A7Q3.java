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
public class A7Q3 {

    public double factor(double numberFac) {
        //creatomg a place holder
        double answer = 0;
        //using a loop as long as a varible is less than the number being factored
        for (double i = 0; i <= numberFac; i++) {
            //dividing the number being factored by a variable to get it's factors
            answer = numberFac / i;
            //making an if statement when there is no left overs after the division
            if (answer % 1 == 0) {
                //printing out the answer
                System.out.println(answer);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        //create a scanner for input
        Scanner in = new Scanner(System.in);
        //creating an object to run my code
        A7Q3 factoring = new A7Q3();
        //asking the user what number they want factored
        System.out.println("What's the number that you'd like factored?");
        //getting the number
        double number = in.nextDouble();
        //printing out a message prior to listing the factors
        System.out.println("The factors of your number are...");
        //using the method to factor the number
        double fac = factoring.factor(number);
    }
}
