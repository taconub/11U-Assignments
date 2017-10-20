package Assignemnt4;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nagra2700
 */
public class A4Q1 {

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
        //output variable to screen
        System.out.println("hello " + firstname + ". How are you today. ");
    }
}
