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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        //creating a place holder
        double markSpot = 0;
        //need 10 squares
        double[] mark = new double[10];
        String[] marks = new String[10];
        //string the names of the marks
        marks[0] = "first";
        marks[1] = "second";
        marks[2] = "third";
        marks[3] = "fourth";
        marks[4] = "fifth";
        marks[5] = "sixth";
        marks[6] = "seventh";
        marks[7] = "eighth";
        marks[8] = "ninth";
        marks[9] = "tenth";
        //using a loop to get the information
        for (int i = 0; i < mark.length; i++) {
            //asking the user to marks of the students
            System.out.println("What's the " + marks[i] + " mark?");
            //getting the marks
            mark[i] = input.nextDouble();
        }
        //use a loop to start the sorting
        for (int x = 0; x < mark.length - 1; x++) {
            //using a loop to sort from the number after the last number sorted
            for (int y = x + 1; y < mark.length; y++) {
                //the number in spot x is bigger than the spot y they will be siwtched with the aid of the variable
                if (mark[x] > mark[y]) {
                    //changing the place holder into the bigger number
                    markSpot = mark[x];
                    //changing the bigger number into the smaller number
                    mark[x] = mark[y];
                    //changing the smaller number into the bigger number
                    mark[y] = markSpot;
                }
            }

        }
        //printing the marka out to the user
        System.out.print("The ascending order of the marks is " + mark[0] + ", " + mark[1] + ", " + mark[2] + ", " + mark[3] + ", " + mark[4] + ", " + mark[5] + ", " + mark[6] + ", " + mark[7] + ", " + mark[8] + ", " + mark[9]);
    }
}
