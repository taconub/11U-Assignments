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
public class A7Q2 {

    public void examGrade(double markUser) {
        //creating a place holder for words
        String grade = "";
        //if the mark is
        if (markUser < 49) {
            //the letter grade is 
            grade = "F";
        }
        //if the mark is
        if (markUser < 60 && markUser > 49) {
            //the letter grade is 
            grade = "D";
        }
        //if the mark is
        if (markUser < 70 && markUser > 59) {
            //the letter grade is 
            grade = "C";
        }
        //if the mark is
        if (markUser < 80 && markUser > 69) {
            //the letter grade is 
            grade = "B";
        }
        //if the mark is
        if (markUser > 79) {
            //the letter grade is 
            grade = "A";
        }
        //outputting the letter grade to the user
        System.out.println("Your letter grade is " + grade);
    }

    public static void main(String[] args) {
        //create a scanner for input
        Scanner in = new Scanner(System.in);
        //create an object to run my code
        A7Q2 mark = new A7Q2();
        //asking the user what mark they got
        System.out.println("What's the mark you got good sir?");
        //getting the number grade
        double numberGrade = in.nextDouble();
        //using the method to get the letter grade
        mark.examGrade(numberGrade);
    }
}
