package Assignment7;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nagra2700
 */
public class A7Q1 {
    //

    public double circleArea(double radius) {
        //finding the answer using the radius inputted by the user as well as pi
        double answer = Math.PI * Math.pow(radius, 2);
        //returning the answer
        return answer;
    }

    public static void main(String[] args) {
        //create a scanner for input
        Scanner in = new Scanner(System.in);
        //create an objetc to run my code
        A7Q1 circle = new A7Q1();
        //asking the user what the radius of the circle is 
        System.out.println("What's the radius of the circle?");
        //getting the radius
        double a = in.nextDouble();
        //using the method to get the area
        double area = circle.circleArea(a);
        //outputting the radius to the user
        System.out.println("The area of the circle is " + area + ".");
    }
}
