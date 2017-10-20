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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);

        //ask the user the speed limit
        System.out.println("What is the speed limit?");
        //get the speed limit from the user
        Double speedlimit = input.nextDouble();
        //ask for the recorded speed of the car from the user
        System.out.println("What is the recorded speed of the car?");
        //get the recorded speed of the car from the user
        Double carspeed = input.nextDouble();

        //creating strings to later put on the screen
        String notspeeding = "You weren't speeding, you're a good citizan of the law";
        String fine1 = "You're speeding and your fine ss $100, slow down next time";
        String fine2 = "You're speeding and your fine ss $270, slow down next time";
        String fine3 = "You're speeding and your fine ss $500, slow down next time";

        //Creating an if statement for when the car is speeding
        if (carspeed > speedlimit) {
            //creating an if statement if the car speed is less than 20 m/h of the speed limit
            if (carspeed - speedlimit < 21) {
                //putting out the second fine amount on to the screen
                System.out.println(fine1);
            }
            //creating an if statement if the car speed is less than 31 m/h and more than 20m/h of the speed limit
            if (carspeed - speedlimit < 31 && carspeed - speedlimit > 20) {
                //putting out the second fine amount on to the screen
                System.out.println(fine2);
            }
            //creating an if statement if the car speed is more than 30 m/h of the speed limit
            if (carspeed - speedlimit > 30) {
                //putting out the third fine amount on to the screen
                System.out.println(fine3);
            }

        } else {
            //putting the not speeding message on to the screen
            System.out.println(notspeeding);
        }
    }
}
