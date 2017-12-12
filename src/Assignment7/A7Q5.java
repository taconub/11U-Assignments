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
public class A7Q5 {

    public void chaotic(double line) {
        //creating an array to hold the asteriks
        String[] asterik = new String[5];
        asterik[0] = "*";
        asterik[1] = "**";
        asterik[2] = "***";
        asterik[3] = "****";
        asterik[4] = "*****";
        //using a loop as long as the variable as less than the amount of wanred lines
        for (int x = 0; x < line; x++) {
            //randomizing an interger 
            int randNum = (int) (Math.random() * (6-1));
            //outputting a specific amount lines which have a random number of asteriks
            System.out.println(asterik[randNum]);

        }
    }

    public static void main(String[] args) {
        //creating a scaner for input
        Scanner in = new Scanner(System.in);
        //creating an obkect to run my code
        A7Q5 methodStarter = new A7Q5();
        //asking the user how many lines they want
        System.out.println("How many lines would you like mi amigo?");
        //getting the amount of lines
        double lines = in.nextDouble();
        //using the method to output some asteriks
        methodStarter.chaotic(lines);
    }
}
