/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignmesnts3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author nagra2700
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a new city
        City owm2dum = new City();
        //new robot
        Robot taconub = new Robot(owm2dum, 1, 4, Direction.WEST);

        //placing walls
        new Wall(owm2dum, 3, 3, Direction.WEST);
        new Wall(owm2dum, 3, 3, Direction.SOUTH);
        new Wall(owm2dum, 2, 3, Direction.WEST);
        new Wall(owm2dum, 2, 3, Direction.NORTH);
        new Wall(owm2dum, 2, 4, Direction.NORTH);
        new Wall(owm2dum, 3, 4, Direction.SOUTH);
        new Wall(owm2dum, 2, 4, Direction.EAST);
        new Wall(owm2dum, 3, 4, Direction.EAST);


        //count for loop
        for (int count = 0; count < 8; count = count + 1) {
            //than move twice, turn and than move one more time
            taconub.move();
            taconub.move();
            taconub.turnLeft();
            taconub.move();
        }



    }
}
