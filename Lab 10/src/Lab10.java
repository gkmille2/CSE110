// ------------------------------------------------------------
// AUTHOR: Garren Miller
// FILENAME: Lab10.java
// SPECIFICATION: Practice declaring and using classes
// FOR: CSE 110- Lab #10
// TIME SPENT: 1 hour
//-------------------------------------------------------------

import java.util.Scanner;
import java.util.Arrays;

public class Lab10 {
    public static void main(String[] args) {

        //Declare variables
        Scanner in = new Scanner(System.in);
        int arraySize = 0;
        double exchangeElement = 0.0;

        //Ask for array size
        System.out.print("How many elements go in the array? ");
        arraySize = in.nextInt();

        //Declare array
        double[] arrayReference = new double[arraySize];

        //Fill array
        for(int i = 0; i < arraySize; i++) {
            System.out.printf("Enter the next value: ");
            int userInput = in.nextInt();

            arrayReference[i] = userInput;
        }

        //Sort array
        Arrays.sort(arrayReference);

        //Print out sorted array
        System.out.println();
        System.out.println("The array after sorting:");
        for(int i = 0; i < arraySize; i++) {
            System.out.printf("%.1f, ", arrayReference[i]);
        }

        System.out.println();
        System.out.println();

        //Print shifted array
        System.out.println("The array after shifting left: ");
        for(int i = 1; i < arraySize; i++) {
            System.out.printf("%.1f, ", arrayReference[i]);
        }

        //Ask for new element
        System.out.println();
        System.out.println();
        System.out.print("Enter a new value to insert into the array: ");
        int appendValue = in.nextInt();
        double[] arrayReference1 = new double[arraySize + 1];

        for(int i = 0; i < arraySize; i++) {
            arrayReference1[i] = arrayReference[i];
        }

        arrayReference1[arraySize] = appendValue;
        Arrays.sort(arrayReference1);

        System.out.print("The array after inserting a value at the end: ");
        System.out.println();
        for(int i = 0; i < (arraySize + 1); i++) {
            System.out.printf("%.1f, ", arrayReference1[i]);
        }
    }
}
