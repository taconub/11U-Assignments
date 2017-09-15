/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author nagra2700
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Creating a new city
    City Anmolville=new City();
    //Creating a new robot
    Robot anmolster=new Robot(Anmolville,0,0,Direction.SOUTH);
    //Creating a new robot
    Robot lucky=new Robot(Anmolville,0,1,Direction.SOUTH);
    //Creating walls
    new Wall(Anmolville,0,1,Direction.WEST);
    new Wall(Anmolville,1,1,Direction.WEST);
    new Wall(Anmolville,1,1,Direction.SOUTH);
    //Making the robots move
    anmolster.move();
    lucky.move();
    anmolster.move();
    //making the robots move
    anmolster.turnLeft();
    lucky.turnLeft();
    //Making the robots move
    anmolster.move();
    lucky.move();
    //Making Lucky turn
    lucky.turnLeft();
    lucky.turnLeft();
    lucky.turnLeft();
    //Making lucky move
    lucky.move();
    //Making Lucky turn
    lucky.turnLeft();
    lucky.turnLeft();
    lucky.turnLeft();
    //Making Luck move
    lucky.move();
    }
}
