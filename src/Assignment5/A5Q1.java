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
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        //ask the user for a word
        System.out.println("What's the word you woud like to have translated to ubbi dubbi?");
        //Getting the word
        String word1 = input.nextLine();
        //turning all the letters in the word into lowercase
        word1 = word1.toLowerCase();
        //creating a new string that is blank
        String trans = "";
        //creating a new string for word with spaces after it so the code works
        String word = word1 + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ";
        //when there is no vowel, search the next letter
        for (int i = 0; i < word.length(); i++) {
            //if the word is exit, than end the program
            if (word.equals("exit")) {
                break;
            }
            //if any of these vowels have been found than the word will be altered
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'u' || word.charAt(i) == 'i' || word.charAt(i) == 'o') {
                //adding ub prior to the found vowel 
                trans = trans + "ub" + word.charAt(i);
                //if the next letetr is e, the word won't be changed
                if (word.charAt(i++) == 'e') {
                    //leaving the word as is
                    trans = trans + word.charAt(i);
                } else {
                    //if the next letter is not a e, the word stays a sis
                    trans = trans + word.charAt(i);
                }
            } else {
                //if the letter isn't a vowel the word will stay as is
                trans = trans + word.charAt(i);
            }
            //if any of these vowels have been found than the word will be altered
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'u' || word.charAt(i) == 'i' || word.charAt(i) == 'o') {
                //if the next letetr is a, the word won't be changed
                if (word.charAt(i++) == 'a') {
                    //leaving the word as is
                    trans = trans + word.charAt(i);
                } else {
                    //if the next letter is not a a, the word stays a sis
                    trans = trans + word.charAt(i);
                }
            } else {
            }
            //if any of these vowels have been found than the word will be altered
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'u' || word.charAt(i) == 'i' || word.charAt(i) == 'o') {
                //if the next letetr is u, the word won't be changed
                if (word.charAt(i++) == 'u') {
                    //leaving the word as is
                    trans = trans + word.charAt(i);
                } else {
                    //if the next letter is not a u, the word stays a sis
                    trans = trans + word.charAt(i);
                }
            } else {
            }
            //if any of these vowels have been found than the word will be altered
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'u' || word.charAt(i) == 'i' || word.charAt(i) == 'o') {
                //if the next letetr is o, the word won't be changed
                if (word.charAt(i++) == 'o') {
                    //leaving the word as is
                    trans = trans + word.charAt(i);
                } else {
                    //if the next letter is not a o, the word stays a sis
                    trans = trans + word.charAt(i);
                }
            } else {
            }
            //if any of these vowels have been found than the word will be altered
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'u' || word.charAt(i) == 'i' || word.charAt(i) == 'o') {
                //if the next letetr is i, the word won't be changed
                if (word.charAt(i++) == 'i') {
                    //leaving the word as is
                    trans = trans + word.charAt(i);
                } else {
                    //if the next letter is not a i, the word stays a sis
                    trans = trans + word.charAt(i);
                }
            } else {
            }
        }
        //print out the translated word
        System.out.println(trans);
    }
}
