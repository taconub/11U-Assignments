/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author anmoln3597
 */
public class A7Q8 {
    public boolean allDigitsOdd(double inty){
        while(inty>10){
                 inty = inty /10;
                }       
        if(inty < 10){
                if (inty %2 == 1){
                    System.out.println("The integer has only odd digits in it.");
                }
                if(inty %2 == 0){
               System.out.println("There is at least one even digit in the integer.");
                }
                }
        return true;
    }
    
    public static void main(String[] args) {
        // create an object to run my methods
        A7Q8 methodStarter = new A7Q8();
        
        // create a scanner
        Scanner in = new Scanner(System.in);
        
        //asking the user what the integer is 
        System.out.println("What's the integer?");
        
        double integer = in.nextDouble();
        
        methodStarter.allDigitsOdd(integer);
            
        
    }
    
}
