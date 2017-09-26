/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author nagra2700
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City brem = new City();
        //create a new robot
        Robot drake = new Robot(brem, 1, 1, Direction.EAST);
        //Placing walls
        new Wall(brem, 1, 1, Direction.SOUTH);
        new Wall(brem, 1, 2, Direction.SOUTH);
        new Wall(brem, 1, 3, Direction.SOUTH);
        new Wall(brem, 1, 4, Direction.SOUTH);
        new Wall(brem, 1, 5, Direction.SOUTH);
        new Wall(brem, 1, 6, Direction.SOUTH);
        new Wall(brem, 1, 7, Direction.SOUTH);
        new Wall(brem, 1, 8, Direction.SOUTH);
        new Wall(brem, 1, 9, Direction.SOUTH);
        new Wall(brem, 1, 1, Direction.EAST);
        new Wall(brem, 1, 2, Direction.EAST);
        new Wall(brem, 1, 4, Direction.EAST);
        new Wall(brem, 1, 7, Direction.EAST);
        //Placing thing
        new Thing(brem, 1, 9);

        //While drake can't pick up a thing he moves and turns
        while (!drake.canPickThing()) {
            // When front is clear he moves else he turns and moves
            if (drake.frontIsClear()) {
                drake.move();
            } else {
                drake.turnLeft();
                drake.move();
                drake.turnLeft();
                drake.turnLeft();
                drake.turnLeft();
                drake.move();
                drake.turnLeft();
                drake.turnLeft();
                drake.turnLeft();
                drake.move();
                drake.turnLeft();



            }

        }





    }
}
