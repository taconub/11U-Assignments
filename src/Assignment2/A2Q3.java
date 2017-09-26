/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author nagra2700
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating city
        City liriano=new City();
        //Creating robot
    Robot icecreamtruck=new Robot(liriano,10,2,Direction.EAST);
            //While the robot is on a street bigger than 0, he will move
            while(icecreamtruck.getStreet()>=1){
            icecreamtruck.move();
            //When the robot is not facing north, turn left
            while(icecreamtruck.getDirection()!=Direction.NORTH)
            icecreamtruck.turnLeft();
        }
            //If the robot is on an avenue bigger than 1, turn left and move
            if(icecreamtruck.getAvenue()>=1){
                icecreamtruck.turnLeft();
                icecreamtruck.move();
           }
            //while on an avenue bigger than 1, move
            while(icecreamtruck.getAvenue()>=1){
                icecreamtruck.move();
                        
            }
      
    }
}
