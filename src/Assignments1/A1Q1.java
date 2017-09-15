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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Creating a new city
    City assign = new City();
    //creating a robot
    Robot joe = new Robot (assign, 0, 2, Direction.WEST);
    //Creating walls
    new Wall (assign,1,1,Direction.WEST);
    new Wall (assign,2,1,Direction.WEST);
    new Wall (assign,1,2,Direction.EAST);
    new Wall (assign,2,2,Direction.EAST);
    new Wall (assign,2,2,Direction.SOUTH);
    new Wall (assign,2,1,Direction.SOUTH);
    new Wall (assign,1,2,Direction.NORTH);
    new Wall (assign,1,1,Direction.NORTH);
    //Making Joe move
    joe.move();
    joe.move();
    //Making Joe turn left
    joe.turnLeft();
    //Making Joe move
    joe.move();
    joe.move();
    joe.move();
    //Making Joe turn left
    joe.turnLeft();
    //Making Joe move
    joe.move();
    joe.move();
    joe.move();
    //Making Joe turn left
    joe.turnLeft();
    //Making Joe move
    joe.move();
    joe.move();
    joe.move();
    //Making Joe turn left
    joe.turnLeft();
    joe.turnLeft();
    
    
    }
}
