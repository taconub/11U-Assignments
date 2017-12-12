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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        //asking the user how many students are in the class
        System.out.println("How many students are in the class?");
        //getting the amount of students
        int students = input.nextInt();
        //creating a double array that will hold all the students marks
        double[] mark = new double[students];
        //creating a place holder for the average of the students marks
        double average = 0;
        //creating a place holder for all the marks added up
        double total = 0;
        //use a loop to get all the info
        for (int i = 0; i < students; i++) {
            //asking the user what the mars are
            System.out.println("What's the mark of student number " + (i + 1) + ".");
            //getting the marks
            mark[i] = input.nextDouble();
            //adding all the marks up
            total = total + mark[i];
            //dividing the total of all the marks and the amount of students to find the average
            average = total / students;

        }
        //telling the user what the class average is
        System.out.println("The class average is " + average + ".");
    }
}
