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
public class A7Q7 {
    public void firstDigit(int num) {
        //if the number is a negative
        while(num<0){
        //dividing the number by -1 to make it negative
        num = num / -1;
        }
        //while the number is greater or equal to ten
        while(num>=10){
        //dividing the number by ten to limit the number down to it's first digit
        num = num / 10;
        }
        //outputting the number to the user
        System.out.println("The first digit in the number is " + num);   
    }

    public static void main(String[] args) {
        //creating a scaner for input
        Scanner in = new Scanner(System.in);
        //creating an obkect to run my code
        A7Q7 methodStarter = new A7Q7();
        //asking the user what the interger is 
        System.out.println("What's the interger?");
        //getting the interger
        int first = in.nextInt();
        //using the method to output some asteriks
        methodStarter.firstDigit(first);
    }
}
