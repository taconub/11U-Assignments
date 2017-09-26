/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author nagra2700
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating a new city
        City likewise = new City();

        //Creating a new robot
        Robot pennywise = new Robot(likewise, 1, 1, Direction.EAST);

        //Placing things
        new Thing(likewise, 1, 2);
        new Thing(likewise, 1, 3);
        new Thing(likewise, 1, 4);
        new Thing(likewise, 1, 5);
        new Thing(likewise, 1, 6);
        new Thing(likewise, 1, 7);
        new Thing(likewise, 1, 8);
        new Thing(likewise, 1, 9);
        new Thing(likewise, 1, 10);
        new Thing(likewise, 1, 11);
        new Thing(likewise, 1, 12);

        //move until path is blocked
        while (pennywise.frontIsClear()) {
            //if there is something to pick up
            if (pennywise.canPickThing()) {
                pennywise.pickThing();
            }
            //move forward
            pennywise.move();
            //check if on avenue 10
            while (pennywise.getAvenue() == 10) //move forward
            {
                pennywise.move();
            }
            //check if on avenue 11
            while (pennywise.getAvenue() == 11) //move forward
            {
                pennywise.move();
            }
            //check if on avenue 12
            while (pennywise.getAvenue() == 12) //move forward
            {
                pennywise.move();
            }
            //check if on avenue 13
            if (pennywise.getAvenue() == 13) {
                break;
            }
        }



    }
}
