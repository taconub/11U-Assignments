/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignmesnts3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author nagra2700
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a new city
        City kumber = new City();
        //creating robot
        Robot ad = new Robot(kumber, 1, 1, Direction.EAST);
        //turning on thing count
        kumber.showThingCounts(true);
        //placing things 
        new Thing(kumber, 1, 1);
        new Thing(kumber, 1, 1);
        new Thing(kumber, 1, 1);
        new Thing(kumber, 1, 1);
        new Thing(kumber, 1, 1);
        new Thing(kumber, 1, 1);
        new Thing(kumber, 1, 1);
        new Thing(kumber, 1, 1);
        new Thing(kumber, 1, 1);
        new Thing(kumber, 1, 1);

        //move 20 times and pick things, move, drop them, turb left twice, move, and finally turn left
        for (int count = 0; count < 10; count = count + 1) {
            ad.pickThing();
            ad.move();
            ad.putThing();
            ad.turnLeft();
            ad.turnLeft();
            ad.move();
            ad.turnLeft();
            ad.turnLeft();
        }
        ad.move();

    }
}
