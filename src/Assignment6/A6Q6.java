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
public class A6Q6 {

    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        System.out.println("How many marks would you like to input?");
        int markAmount = input.nextInt();
        //need as many sqaures as the amount of students in the class
        double[] mark = new double[markAmount];
        String[] marks = new String[markAmount];
        //creating place holders
        double average = 0;
        double totalMarks = 0;
        double markSpot = 0;
        //use a loop to get all the info
        for (int i = 0; i < mark.length; i++) {
            System.out.println("What's the mark of student number " + (i + 1) + "%?");
            mark[i] = input.nextDouble();
            totalMarks = mark[i] + totalMarks;
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
        //getting the avreage of all the marks using the amount of marks that were inputed and all the marks combined
        average = totalMarks / markAmount;
        //printing the average of all the marks to the user
        System.out.println("I'm happy to tell you the average of all the marks are " + average+"%.");
        //printing the lowest mark of all of the marks to the user
        System.out.println("I'm sorry to say this but the lowest mark in the class is "+ mark[0]+"%.");
        //printing the highest mark of all the marks to the user
        System.out.println("I'm excited to tell you the highest mark in the class is "+mark[markAmount-1]+"%.");
        
    }
}
