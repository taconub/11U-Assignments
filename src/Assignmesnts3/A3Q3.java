/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignmesnts3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.awt.Color;

/**
 *
 * @author nagra2700
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new city
        City guyana = new City();
        //new robot who starts with 20 things
        Robot neil = new Robot(guyana, 1, 1, Direction.EAST, 20);
        //new label for the robot
        neil.setLabel("1-800");
        //new color for the robot
        neil.setColor(Color.lightGray);
        //when the robots moved less than 20 times move and put thing down
        for (int count = 0; count < 20; count = count + 1) {
            neil.move();
            neil.putThing();

            //when there is 15 things in the backpack, turn left and move
            if (neil.countThingsInBackpack() == 15) {
                neil.turnLeft();
                neil.turnLeft();
                neil.turnLeft();
                neil.move();
                neil.turnLeft();
                neil.turnLeft();
                neil.turnLeft();
                neil.putThing();

            }
            //when there is 10 things in the backpack, turn left and move
            if (neil.countThingsInBackpack() == 10) {
                neil.turnLeft();
                neil.move();
                neil.turnLeft();
                neil.putThing();
            }
            //when there is 5 things in the backpack, turn left and move
            if (neil.countThingsInBackpack() == 5) {
                neil.turnLeft();
                neil.turnLeft();
                neil.turnLeft();
                neil.move();
                neil.turnLeft();
                neil.turnLeft();
                neil.turnLeft();
                neil.putThing();
            }
            //when there is 0 things in the backpack, turn left and move
            if (neil.countThingsInBackpack() == 0) {
                neil.turnLeft();
                neil.move();
                neil.turnLeft();
            }
            //when there is 0 things in the backpack, check if can pick thing that way the robot doesn't die
            while (neil.countThingsInBackpack() == 0) {
                neil.canPickThing();
            }
        }
    }
}
