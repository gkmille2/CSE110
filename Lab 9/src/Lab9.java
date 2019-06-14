// ------------------------------------------------------------
// AUTHOR: Garren Miller
// FILENAME: Lab6.java
// SPECIFICATION: Practice declaring and using classes
// FOR: CSE 110- Lab #6
// TIME SPENT: 1 hour
//-------------------------------------------------------------

import java.util.Scanner;
import java.util.Arrays;

public class Lab9 {
    public static void main(String[] args) {
        int counter = 0;
        int arrayLength = 0;
        double currentElement = 0;
        double sumOfElements = 0;
        Scanner in = new Scanner(System.in);

        //Ask for array length
        System.out.print("How many elements are in the array? ");
        arrayLength = in.nextInt();
        System.out.println();

        double[] integerArray = new double[arrayLength];

        for(int i = 0; i < arrayLength; i++) {
            System.out.print("Please enter the next value: ");
            currentElement = in.nextDouble();

            integerArray[i] = currentElement;
        }
        System.out.println();

        for(int i = 0; i < arrayLength; i++) {
            System.out.printf("%.3f  ", integerArray[i]);
            counter = counter + 1;


            if(counter >= 8) {
                System.out.println();
                counter = 0;
            }
        }

        for(int i = 0; i < arrayLength; i++) {
            sumOfElements = sumOfElements + integerArray[i];
        }

        System.out.println();
        System.out.println();
        System.out.printf("The sum of the elements is %.3f", sumOfElements);
    }
}
