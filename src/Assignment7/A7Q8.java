/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author anmoln3597
 */
public class A7Q8 {

    public boolean allDigitsOdd(int inty) {
        //creating a second version of the initial integer
        int ger = inty + 0;
        //if the integer is less than 0
        if (inty < 0) {
            //multiply it by - 1 to make it positive
            inty = inty * -1;
        }
        //as long as the integer is larger than 0
        while (inty > 0) {
            //breaking up the integer into the last digit
            inty = inty % 10;
            //if the last digit is even           
            if (inty % 2 == 0) {
                //telling the user there is at least one even digit in the integer
                System.out.println("There is at least one even digit in the integer.");
                return true;
            }
            //using the second integer and dividing it by ten to get rid of the last digit so another digit can be check
            inty = ger / 10;
            //dividing the secondary integer by 10
            ger = ger / 10;
        }
        //telling the user there is only odd digits in the integer
        System.out.println("There is only odd digits in the integer");    
        return false;
    }

    public static void main(String[] args) {
        // create an object to run my methods
        A7Q8 methodStarter = new A7Q8();
        // create a scanner
        Scanner in = new Scanner(System.in);
        //asking the user what the integer is 
        System.out.println("What's the integer?");
        //getting the integer
        int integer = in.nextInt();
        //using the method 
        methodStarter.allDigitsOdd(integer);

    }
}
