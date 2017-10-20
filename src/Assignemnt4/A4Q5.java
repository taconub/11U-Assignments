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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);

        //asking the user what their name is 
        System.out.println("type your name?");
        //get the name from the user
        String firstname = input.nextLine();


        //asking the user what the first test is out of
        System.out.println("What's the first test out of?");
        //getting what the first test is out of
        double test1 = input.nextDouble();
        //asking what the user got on the first test
        System.out.println("What did you get on the first test?");
        //getting what the user got on the first test
        double test1mark = input.nextDouble();
        //dividing the users mark by what the test was out of to find the decimal value
        double test1decimal = test1mark / test1;
        //multiplying the decimal value by 100 to get the percentage
        double test1percent = test1decimal * 100;
        //putting the test percentage of the first test onto the screen
        System.out.println("The percenatge for your first test is " + test1percent + "%");

        //asking the user what the second test is out of
        System.out.println("What's the second test out of?");
        //getting what the second test is out of
        double test2 = input.nextDouble();
        //asking what the user got on the second test
        System.out.println("What did you get on the second test?");
        //getting what the user got on the second test
        double test2mark = input.nextDouble();
        //dividing the users mark by what the test was out of to find the decimal value
        double test2decimal = test2mark / test2;
        //multiplying the decimal value by 100 to get the percentage
        double test2percent = test2decimal * 100;
        //putting the test percentage of the first test onto the screen
        System.out.println("The percenatge for second second test is " + test2percent + "%");

        //asking the user what the third test is out of
        System.out.println("What's the third test out of?");
        //getting what the third test is out of
        double test3 = input.nextDouble();
        //asking what the user got on the third test
        System.out.println("What did you get on the third test?");
        //getting what the user got on the third test
        double test3mark = input.nextDouble();
        //dividing the users mark by what the test was out of to find the decimal value
        double test3decimal = test3mark / test3;
        //multiplying the decimal value by 100 to get the percentage
        double test3percent = test3decimal * 100;
        //putting the test percentage of the third test onto the screen
        System.out.println("The percenatge for third second test is " + test3percent + "%");

        //asking the user what the fourth test is out of
        System.out.println("What's the fourth test out of?");
        //getting what the fourth test is out of
        double test4 = input.nextDouble();
        //asking what the user got on the fourth test
        System.out.println("What did you get on the fourth test?");
        //getting what the user got on the fourth test
        double test4mark = input.nextDouble();
        //dividing the users mark by what the test was out of to find the decimal value
        double test4decimal = test4mark / test4;
        //multiplying the decimal value by 100 to get the percentage
        double test4percent = test4decimal * 100;
        //putting the test percentage of the fourth test onto the screen
        System.out.println("The percenatge for fourth second test is " + test4percent + "%");


        //asking the user what the fifth test is out of
        System.out.println("What's the fifth test out of?");
        //getting what the fifth test is out of
        double test5 = input.nextDouble();
        //asking what the user got on the fifth test
        System.out.println("What did you get on the fifth test?");
        //getting what the user got on the fifth test
        double test5mark = input.nextDouble();
        //dividing the users mark by what the test was out of to find the decimal value
        double test5decimal = test5mark / test5;
        //multiplying the decimal value by 100 to get the percentage
        double test5percent = test5decimal * 100;
        
        //putting the test percentage of the first test onto the screen
        System.out.println("The percenatge for your first test is " + test1percent + "%");
        //putting the test percentage of the first test onto the screen
        System.out.println("The percenatge for your first test is " + test2percent + "%");
        //putting the test percentage of the first test onto the screen
        System.out.println("The percenatge for your third test is " + test3percent + "%");
        //putting the test percentage of the first test onto the screen
        System.out.println("The percenatge for your fourth test is " + test4percent + "%");
        //putting the test percentage of the first test onto the screen
        System.out.println("The percenatge for your fifth test is " + test5percent + "%");
        //finding the average of all the tests percentages
        double totalaverage = test1percent + test2percent + test3percent + test4percent + test5percent;
        //putting the total average of all the tests percetage onto the screen
        System.out.println("The total average of all the tests percenantages is " + totalaverage + "%");
    }
}
