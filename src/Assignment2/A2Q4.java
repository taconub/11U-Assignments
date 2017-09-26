/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author nagra2700
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City bremelian = new City();
        Robot bremfamlamnamjam = new Robot(bremelian, 6, 4, Direction.NORTH);

        new Wall(bremelian, 5, 5, Direction.NORTH);
        new Wall(bremelian, 5, 6, Direction.NORTH);
        new Wall(bremelian, 6, 5, Direction.SOUTH);
        new Wall(bremelian, 6, 6, Direction.SOUTH);
        new Wall(bremelian, 5, 5, Direction.WEST);
        new Wall(bremelian, 6, 5, Direction.WEST);
        new Wall(bremelian, 6, 6, Direction.EAST);
        new Wall(bremelian, 5, 6, Direction.EAST);
        new Wall(bremelian, 4, 4, Direction.EAST);
        new Wall(bremelian, 4, 4, Direction.WEST);
        new Wall(bremelian, 4, 4, Direction.NORTH);
        new Wall(bremelian, 4, 4, Direction.SOUTH);
        new Wall(bremelian, 5, 6, Direction.EAST);
        new Wall(bremelian, 4, 7, Direction.EAST);
        new Wall(bremelian, 4, 7, Direction.WEST);
        new Wall(bremelian, 4, 7, Direction.NORTH);
        new Wall(bremelian, 4, 7, Direction.SOUTH);
        new Wall(bremelian, 7, 7, Direction.EAST);
        new Wall(bremelian, 7, 7, Direction.WEST);
        new Wall(bremelian, 7, 7, Direction.NORTH);
        new Wall(bremelian, 7, 7, Direction.SOUTH);
        new Wall(bremelian, 7, 4, Direction.EAST);
        new Wall(bremelian, 7, 4, Direction.WEST);
        new Wall(bremelian, 7, 4, Direction.NORTH);
        new Wall(bremelian, 7, 4, Direction.SOUTH);
        //Adding a label
        bremfamlamnamjam.setLabel("360");
        //Adding color
        bremfamlamnamjam.setColor(Color.GREEN);
        
        //When the front is clear move
        while (bremfamlamnamjam.frontIsClear()) {
            bremfamlamnamjam.move();
               
            //if the front isn't clear turn left
            if (!bremfamlamnamjam.frontIsClear()) {
                bremfamlamnamjam.turnLeft();
            }

            //if the front isn't clear turn left
            if (!bremfamlamnamjam.frontIsClear()) {
                bremfamlamnamjam.turnLeft();
            }
            //Making the robot turn left
            bremfamlamnamjam.turnLeft();
            bremfamlamnamjam.turnLeft();
            bremfamlamnamjam.turnLeft();
            
            //if the front isn't clear turn left
            if (!bremfamlamnamjam.frontIsClear()) {
                bremfamlamnamjam.turnLeft();
            }

        }


    }
}
