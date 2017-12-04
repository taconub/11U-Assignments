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
public class A2C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a new city
        City guccy=new City();
        //creating a neww robot
        Robot thisonewassupposedtohaveashortname=new Robot(guccy,2,2,Direction.EAST);
        //creating walls
        new Wall(guccy,2,1,Direction.EAST);
        new Wall(guccy,3,1,Direction.EAST);
        new Wall(guccy,4,1,Direction.EAST);
        new Wall(guccy,5,1,Direction.EAST);
        new Wall(guccy,6,1,Direction.EAST);
        new Wall(guccy,7,1,Direction.EAST);
        new Wall(guccy,8,1,Direction.EAST);
        new Wall(guccy,9,1,Direction.EAST);
        new Wall(guccy,10,1,Direction.EAST);
        new Wall(guccy,11,1,Direction.EAST);
        new Wall(guccy,2,2,Direction.EAST);
        new Wall(guccy,3,3,Direction.NORTH);
        new Wall(guccy,3,4,Direction.NORTH);
        new Wall(guccy,3,5,Direction.NORTH);
        new Wall(guccy,3,6,Direction.NORTH);
        new Wall(guccy,4,3,Direction.SOUTH); 
        new Wall(guccy,4,4,Direction.SOUTH);
        new Wall(guccy,4,5,Direction.SOUTH);
        new Wall(guccy,4,6,Direction.SOUTH);
        new Wall(guccy,3,6,Direction.EAST);
        new Wall(guccy,4,6,Direction.EAST);
        new Wall(guccy,5,2,Direction.EAST);
        new Wall(guccy,6,3,Direction.NORTH);
        new Wall(guccy,6,4,Direction.NORTH);
        new Wall(guccy,6,5,Direction.NORTH);
        new Wall(guccy,6,3,Direction.SOUTH);
        new Wall(guccy,6,5,Direction.EAST);
        new Wall(guccy,6,4,Direction.SOUTH);
        new Wall(guccy,6,5,Direction.SOUTH);
        new Wall(guccy,9,5,Direction.NORTH);
        new Wall(guccy,9,6,Direction.NORTH);
        new Wall(guccy,9,3,Direction.NORTH);
        new Wall(guccy,9,4,Direction.NORTH);
        new Wall(guccy,9,7,Direction.NORTH);
        new Wall(guccy,9,7,Direction.EAST);
        new Wall(guccy,10,3,Direction.SOUTH); 
        new Wall(guccy,10,4,Direction.SOUTH);
        new Wall(guccy,10,5,Direction.SOUTH);
        new Wall(guccy,10,6,Direction.SOUTH);
        new Wall(guccy,10,7,Direction.SOUTH);
        new Wall(guccy,10,7,Direction.EAST);
        new Wall(guccy,7,2,Direction.EAST);
        new Wall(guccy,8,2,Direction.EAST);
        new Wall(guccy,11,2,Direction.EAST);
        new Wall(guccy,11,2,Direction.SOUTH);
        
        //placing things
        new Thing(guccy,3,2);
        new Thing(guccy,3,3);
        
    }
}
