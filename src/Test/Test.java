/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author nagra2700
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a new city
        City mineland = new City();
        //new robot
        Robot minebuster = new Robot(mineland, 2, 2, Direction.EAST);
        //placing walls
        new Wall(mineland, 2, 4, Direction.NORTH);
        new Wall(mineland, 2, 5, Direction.NORTH);
        new Wall(mineland, 2, 6, Direction.NORTH);
        new Wall(mineland, 2, 7, Direction.NORTH);
        new Wall(mineland, 2, 8, Direction.NORTH);
        new Wall(mineland, 2, 8, Direction.EAST);
        new Wall(mineland, 2, 8, Direction.SOUTH);
        new Wall(mineland, 2, 4, Direction.SOUTH);
        new Wall(mineland, 2, 5, Direction.SOUTH);
        new Wall(mineland, 2, 6, Direction.SOUTH);
        new Wall(mineland, 2, 7, Direction.SOUTH);
        new Wall(mineland, 2, 2, Direction.WEST);
        //placing things to act as mines
        new Thing(mineland, 2, 4);
        new Thing(mineland, 2, 5);
        new Thing(mineland, 2, 6);
        new Thing(mineland, 2, 7);
        new Thing(mineland, 2, 8);
        //while the robot can pick up things, it moves
        while (!minebuster.canPickThing()) {
            minebuster.move();
            //if it's on avenue 2, it drops the thing and turns around and moves to get another mine
            if (minebuster.getAvenue() == 2) {
                minebuster.putThing();
                minebuster.turnLeft();
                minebuster.turnLeft();
                minebuster.move();
            }
            //if the robot can pick up something, it does and turns around to drop it off
            if (minebuster.canPickThing()) {
                minebuster.pickThing();
                minebuster.turnLeft();
                minebuster.turnLeft();
            }
            //if the robot is on avenue 8, it will until it can pick up a thing
            if (minebuster.getAvenue() == 8) {
                while (!minebuster.canPickThing()) {
                    minebuster.move();
                }
                //if the robots on avenue 2, it will turn left twice
                if (minebuster.getAvenue() == 2) {
                    minebuster.turnLeft();
                    minebuster.turnLeft();
                }

            }
        }
    }
}
