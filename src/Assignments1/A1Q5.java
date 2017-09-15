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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Creating a new city
    City commit=new City();
    //Creating new robots
    Robot IOS=new Robot(commit,0,1,Direction.WEST);
    Robot Andriod=new Robot(commit,3,3,Direction.EAST);
    //Creating walls
    new Wall(commit,3,3,Direction.SOUTH);
    new Wall(commit,3,3,Direction.EAST);
    new Wall(commit,2,3,Direction.EAST);
    new Wall(commit,2,3,Direction.NORTH);
    new Wall(commit,2,3,Direction.WEST);
    }
}
