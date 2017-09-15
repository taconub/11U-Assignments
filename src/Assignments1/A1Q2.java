/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author nagra2700
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Creating a city
    City locochoco=new City();
    //Creating a robot
    Robot murry=new Robot(locochoco,2,1,Direction.SOUTH);
    //Creating walls
    new Wall(locochoco,2,1,Direction.EAST);
    new Wall(locochoco,2,1,Direction.SOUTH);
    new Wall(locochoco,2,1,Direction.NORTH);
    new Wall(locochoco,2,0,Direction.NORTH);
    new Wall(locochoco,2,0,Direction.WEST);
    new Wall(locochoco,3,0,Direction.WEST);
    new Wall(locochoco,3,0,Direction.SOUTH);
    //Creating a thing
    new Thing(locochoco,3,1);
    //Making Murry turn left
    murry.turnLeft();
    murry.turnLeft();
    murry.turnLeft();
    //Making murry move
    murry.move();
    //Making Murry turn left
    murry.turnLeft();
    //Making murry move
    murry.move();
    //Making Murry turn left
    murry.turnLeft();
    //Making murry move
    murry.move();
    //Making Murry pick up the Thing
    murry.pickThing();
     //Making Murry turn left
    murry.turnLeft();
    murry.turnLeft();
     //Making murry move
    murry.move();
    //Making Murry turn left
    murry.turnLeft();
    murry.turnLeft();
    murry.turnLeft();
    //Making murry move
    murry.move();
    //Making Murry turn left
    murry.turnLeft();
    murry.turnLeft();
    murry.turnLeft();
    //Making murry move
    murry.move();
    //Making Murry drop Thing
    murry.putThing();
    }
}
