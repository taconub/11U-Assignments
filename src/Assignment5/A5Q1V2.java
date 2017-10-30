/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author nagra2700
 */
public class A5Q1V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        //ask the user for a word
        System.out.println("What's the word you woud like to have translated?");
        //Getting the word
        String word = input.nextLine();
        //turning all the letters in the word into lowercase
        word = word.toLowerCase();

        String trans = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'o') {
                trans = trans + "ub" + word.charAt(i);
                
                if (word.charAt(i++) == 'o' ) {
                    //if there's no vowel than it will keep the word as is
                    trans = trans + word.charAt(i)+ word.charAt(i);
                
                if (word.charAt(i++) == 'a' ) 
                    //if there's no vowel than it will keep the word as is
                    trans = trans + word.charAt(i)+ word.charAt(i);
                
                if (word.charAt(i++) == 'e' ) 
                    //if there's no vowel than it will keep the word as is
                    trans = trans + word.charAt(i)+ word.charAt(i);
                
                if (word.charAt(i++) == 'u' ) 
                    //if there's no vowel than it will keep the word as is
                    trans = trans + word.charAt(i)+ word.charAt(i);
                
                if (word.charAt(i++) == 'i' ) 
                    //if there's no vowel than it will keep the word as is
                    trans = trans + word.charAt(i)+ word.charAt(i);
                }else{
                    trans=trans+word.charAt(i);
                }

            } else {
                //if there's no vowel than it will keep the word as is
                trans = trans + word.charAt(i);
                
                
            }
        }
        //print out the translated word
        System.out.println(trans);
    }
}
