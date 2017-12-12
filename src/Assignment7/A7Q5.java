/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author nagra2700
 */
public class A7Q5 {
    public void chaotic(double a){
        for(int i = 0; i <a ;i++){
             int randNum = (int)(Math.random()*(5 - a + 1))+ 1;
             System.out.println(randNum);
        }
    }
    public static void main(String[] args) {
        //creating a scaner for input
        Scanner in = new Scanner(System.in);
        //creating an obkect to run my code
        A7Q5 TesterFesterLesterCresterMesterPesterYesSir = new A7Q5();
        
        System.out.println("How many lines would you like mi amigo?");
        double lines = in.nextDouble();
        TesterFesterLesterCresterMesterPesterYesSir.chaotic(lines);
    }
}
