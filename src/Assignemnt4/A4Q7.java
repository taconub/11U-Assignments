/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignemnt4;

import java.util.Scanner;

/**
 *
 * @author nagra2700
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        //creating the players names
        int spot = 1;
        //creating a while loop for whenever the spot is less than 100
        while (spot < 100) {
            //asking the user what roll the dice got
            System.out.println("What is the roll of the dice(2-12)?");
            //getting the dice roll
            int rollingstones = input.nextInt();
            //creating the new value for spot
            spot = spot + rollingstones;


            //basic error check
            if (rollingstones < 2 || rollingstones > 12) {
                //telling the user they lost because they didn't put in the right rolls
                System.out.println("You lost. Game terminated.");
                //ending the game if they put in the wrong rolls
                break;
            }
            //creating the snake the sends you to spot 19 from 54
            if (spot == 54) {
                spot = spot - 35;
            }
            //creating the snake the sends you to spot 48 from 90
            if (spot == 90) {
                spot = spot - 42;
            }
            //creating the snake the sends you to spot 77 from 99
            if (spot == 99) {
                spot = spot - 22;
            }
            //creating the snake the sends you to spot 35 from 9
            if (spot == 9) {
                spot = spot + 25;
            }
            //creating the snake the sends you to spot 40 from 64
            if (spot == 40) {
                spot = spot + 24;
            }
            //creating the snake the sends you to spot 67 from 86
            if (spot == 67) {
                spot = spot + 19;
            }
            //bringing the user back to spot 100 since there si==isn't any spot higher than 100
            if(spot>100){
                spot =100;
            }
            //creating a message to tell the use which spot they're at
            System.out.println("You are at spot " + spot + ".");
            //creating an if statement for when the user makes it wins
            if (spot > 99) {
                //The message that will output onto the screen when the player wins
                System.out.println("You took the ladders to rise and overcame the snakes!! You're truly the king of snakes and ladders!!!");
                if (spot == 100) {
                    break;
                }
            }

        }



    }
}
