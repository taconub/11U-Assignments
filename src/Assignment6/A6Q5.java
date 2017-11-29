/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author nagra2700
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        System.out.println("How many marks would you like to input?");
        int markAmount = input.nextInt();
        //need as many sqaures as the amount of students in the class
        double[] mark = new double[markAmount];
        String[] marks = new String[markAmount];
        //creating place holders
        int median = 0;
        int medianEven = 0;
        double totalMedian= 0;
        double markSpot = 0;
        //use a loop to get all the info
        for (int i = 0; i < mark.length; i++) {
            System.out.println("What's the mark of  student number " + (i + 1) + "%?");
            mark[i] = input.nextDouble();
        }
        //use a loop to start the sorting
        for (int x = 0; x < mark.length - 1; x++) {
            //using a loop to sort from the number after the last number sorted
            for (int y = x + 1; y < mark.length; y++) {
                //the number in spot x is bigger than the spot y they will be siwtched with the aid of the variable
                if (mark[x] > mark[y]) {
                    //changing the place holder into the bigger number
                    markSpot = mark[x];
                    //changing the bigger number into the smaller number
                    mark[x] = mark[y];
                    //changing the smaller number into the bigger number
                    mark[y] = markSpot;
                }
            }
        }
        //if the amount of marks are odd
        if (markAmount % 2 == 1) {
            //divide the amount of marks by two so it represents the middle number of the array
            median = (markAmount) / 2;
            //output the median out of all the marks
            System.out.println("The median of the mark is " + mark[median]+"%.");
        }
        //if the amount of marks are even
        if (markAmount % 2 == 0) {
            //divide the amount of marks by two after minusing it by one to represent the lower middle number of the array
            median = (markAmount- 1) / 2;
            //divide the amount of marks by two so it represents the higher middle number of the array
            medianEven = (markAmount) / 2;
            //getting the average between the lower and higher middle number to get the true middle number
            totalMedian =(mark[median]+mark[medianEven])/2 ;
            //outputing the average of the higher and lower median
            System.out.println("The median of the mark is " + totalMedian+"%.");
        }
    }
}
