/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author nagra2700
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Creating city
    City Linkster=new City();
    //Creating the robot
    Robot wrack=new Robot(Linkster,3,0,Direction.EAST); 
    //Placing the thing
    new Thing(Linkster,3,1);
    //Creating the walls
    new Wall(Linkster,3,2,Direction.WEST);   
    new Wall(Linkster,3,2,Direction.NORTH);
    new Wall(Linkster,2,3,Direction.WEST);   
    new Wall(Linkster,1,3,Direction.WEST);   
    new Wall(Linkster,1,3,Direction.NORTH); 
    new Wall(Linkster,1,3,Direction.EAST);  
    new Wall(Linkster,2,4,Direction.NORTH);
    new Wall(Linkster,2,4,Direction.EAST);
    new Wall(Linkster,3,4,Direction.EAST);
    //Making Wrack move
    wrack.move();
    //Making Wrack pick up the Thing
    wrack.pickThing();
    //Making Wrack turn
    wrack.turnLeft();
    //Making Wrack move
    wrack.move();
    //Making Wrack turn
    wrack.turnLeft();
    wrack.turnLeft();
    wrack.turnLeft();
    //Making Wrack move
    wrack.move();
    //Making Wrack turn
    wrack.turnLeft();
    //Making Wrack move
    wrack.move();
    wrack.move();
    //Making Wrack turn
    wrack.turnLeft();
    wrack.turnLeft();
    wrack.turnLeft();
    //Making Wrack move
    wrack.move();
    //making Wrack drop the Thing
    wrack.putThing();
    //Making Wrack move
    wrack.move();
    //Making Wrack turn
    wrack.turnLeft();
    wrack.turnLeft();
    wrack.turnLeft();
    //Making Wrack move
    wrack.move();
    //Making Wrack turn
    wrack.turnLeft();
    //Making Wrack move
    wrack.move();
    //Making Wrack turn
    wrack.turnLeft();
    wrack.turnLeft();
    wrack.turnLeft();
    //Making Wrack move
    wrack.move();
    wrack.move();
    //Making Wrack turn
    wrack.turnLeft();
    }
}
