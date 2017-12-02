/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

/**
 *
 * @author anmoln3597
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating the max number in which the prime numbers need to be calculated in
        int max = 1001;
        //creating a temporary array that will be used to find the prime numbers
        int[] temp = new int[max];
        //creating the minimum number and also the number the array starts at
        temp[0] = 2;
        //creating a message to tell the user what the next message means
        System.out.println("All the prime numbers between 2 and 1000 are...");
        //creating a variable for later on as the number alone did not work so a place holder was used instead
        int index = 0;
        //crearing another place holder which will be used not only to find the prime numbers but also to output them
        int prime = 1;
        //creating a false boolean for it to hold the prime numbers
        boolean Primes = false;
        //while the prime number is less than or equal to the max number
        while ((prime += 2) <= max) {
            //than all the numbers are true
            Primes = true;
            //using a loop to determine the prime numbers
            for (int i = 0; i < index; i++) {
                //using a loop to run over all the numbers to narrow down the ones that aren't prime
                if (prime % temp[i] == 0) {
                    Primes = false;
                    break;
                }
            }
            //creating a loop to allow the numbers to be outputted
            if (Primes) {
                //using the temporary array to take out all of the non prime numbers
                temp[index++] = prime;
                //telling the user all the prime numbers
                System.out.println(prime + ", ");
            }
        }
    }

}
