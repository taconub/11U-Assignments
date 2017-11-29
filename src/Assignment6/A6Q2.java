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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        //asking the user how many people's height are being included
        System.out.println("How many people are in the group?");
        //getting the amount of people in the group
        int people = input.nextInt();
        //creating an array for the height of the people in the group
        double[] height = new double[people];
        //creating a place holder for the average of the groups height
        double average = 0;
        //creating a place holder for all the heights added up
        double total = 0;
        //use a loop to get all the info
        for (int i = 0; i < people; i++) {
            //asking the user what the mars are
            System.out.println("What's the height of person " + (i + 1) + "?");
            //getting the marks
            height[i] = input.nextDouble();
            //adding all the marks up
            total = total + height[i];
            //dividing the total of all the marks and the amount of students to find the average
            average = total / people;
        }
        //use a loop to get all the info
        for (int z = 0; z < people; z++) {
            //if the persons height is above the average height 
            if (height[z] > average) {
                System.out.println("Person " + (z + 1) + " is above the average height of the group.");
            }
        }
    }
}
