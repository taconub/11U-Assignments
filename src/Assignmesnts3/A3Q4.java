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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new city
        City simran = new City();
        //new robot
        Robot neil = new Robot(simran, 4, 5, Direction.SOUTH);
        //placing walls
        new Wall(simran, 3, 3, Direction.WEST);
        new Wall(simran, 3, 3, Direction.SOUTH);
        new Wall(simran, 2, 3, Direction.WEST);
        new Wall(simran, 2, 3, Direction.NORTH);
        new Wall(simran, 2, 4, Direction.NORTH);
        new Wall(simran, 3, 4, Direction.SOUTH);
        new Wall(simran, 2, 4, Direction.EAST);
        new Wall(simran, 3, 4, Direction.EAST);

        new Wall(simran, 6, 3, Direction.WEST);
        new Wall(simran, 6, 3, Direction.SOUTH);
        new Wall(simran, 5, 3, Direction.WEST);
        new Wall(simran, 5, 3, Direction.NORTH);
        new Wall(simran, 5, 4, Direction.NORTH);
        new Wall(simran, 6, 4, Direction.SOUTH);
        new Wall(simran, 5, 4, Direction.EAST);
        new Wall(simran, 6, 4, Direction.EAST);

        new Wall(simran, 3, 6, Direction.WEST);
        new Wall(simran, 3, 6, Direction.SOUTH);
        new Wall(simran, 2, 6, Direction.WEST);
        new Wall(simran, 2, 6, Direction.NORTH);
        new Wall(simran, 2, 7, Direction.NORTH);
        new Wall(simran, 3, 7, Direction.SOUTH);
        new Wall(simran, 2, 7, Direction.EAST);
        new Wall(simran, 3, 7, Direction.EAST);

        new Wall(simran, 6, 6, Direction.WEST);
        new Wall(simran, 6, 6, Direction.SOUTH);
        new Wall(simran, 5, 6, Direction.WEST);
        new Wall(simran, 5, 6, Direction.NORTH);
        new Wall(simran, 5, 7, Direction.NORTH);
        new Wall(simran, 6, 7, Direction.SOUTH);
        new Wall(simran, 5, 7, Direction.EAST);
        new Wall(simran, 6, 7, Direction.EAST);

        //This is used to state what to do at a corner
        int corner = 0;
        //This is used to state what to do after a certain amount of blocks is passed
        int block = 0;

        //Tells the robot to move until 3 blocks are passed
        while (block < 3) {
            block = block + 1;
            neil.move();
        }
        //Tells the robot to turn at the 1st corner
        while (corner < 1) {
            corner = corner + 1;
            neil.turnLeft();

        }
        //Tells the robot to move until 6 blocks are passed
        while (block < 6) {
            block = block + 1;
            neil.move();
        }
        //Tells the robot to turn at the 2nd corner
        while (corner < 2) {
            corner = corner + 1;
            neil.turnLeft();
        }
        //Tells the robot to move until 9 blocks are passed
        while (block < 9) {
            block = block + 1;
            neil.move();
        }
        //Tells the robot to turn at the 3rd corner
        while (corner < 3) {
            corner = corner + 1;
            neil.turnLeft();
        }
        //Tells the robot to move until 15 blocks are passed
        while (block < 15) {
            block = block + 1;
            neil.move();
        }
        //Tells the robot to turn at the 4th corner
        while (corner < 4) {
            corner = corner + 1;
            neil.turnLeft();
        }
        //Tells the robot to move until 18 blocks are passed
        while (block < 18) {
            block = block + 1;
            neil.move();
        }
        //Tells the robot to turn at the 5th corner
        while (corner < 5) {
            corner = corner + 1;
            neil.turnLeft();
        }
        //Tells the robot to move until 21 blocks are passed
        while (block < 21) {
            block = block + 1;
            neil.move();
        }
        //Tells the robot to turn at the 6th corner
        while (corner < 6) {
            corner = corner + 1;
            neil.turnLeft();
        }
        //Tells the robot to move until 27 blocks are passed
        while (block < 27) {
            block = block + 1;
            neil.move();
        }
        //Tells the robot to turn at the 7th corner
        while (corner < 7) {
            corner = corner + 1;
            neil.turnLeft();
        }
        //Tells the robot to move until 30 blocks are passed
        while (block < 30) {
            block = block + 1;
            neil.move();
        }
        //Tells the robot to turn at the 8th corner
        while (corner < 8) {
            corner = corner + 1;
            neil.turnLeft();
        }
        //Tells the robot to move until 33 blocks are passed
        while (block < 33) {
            block = block + 1;
            neil.move();
        }
        //Tells the robot to turn at the 9th corner
        while (corner < 9) {
            corner = corner + 1;
            neil.turnLeft();
        }
        //Tells the robot to move until 39 blocks are passed
        while (block < 39) {
            block = block + 1;
            neil.move();
        }
        //Tells the robot to turn at the 10th corner
        while (corner < 10) {
            corner = corner + 1;
            neil.turnLeft();
        }
        //Tells the robot to move until 42 blocks are passed
        while (block < 42) {
            block = block + 1;
            neil.move();
        }
        //Tells the robot to turn at the 11th corner
        while (corner < 11) {
            corner = corner + 1;
            neil.turnLeft();
        }
        //Tells the robot to move until 45 blocks are passed
        while (block < 45) {
            block = block + 1;
            neil.move();
        }
        //Tells the robot to turn at the 12th corner
        while (corner < 12) {
            corner = corner + 1;
            neil.turnLeft();
        }
        //Tells the robot to move until 48 blocks are passed
        while (block < 48) {
            block = block + 1;
            neil.move();
        }
        
    }
}
