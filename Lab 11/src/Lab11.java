// ------------------------------------------------------------
// AUTHOR: Garren Miller
// FILENAME: Lab11.java
// SPECIFICATION: Using 2-dimensional arrays
// FOR: CSE 110- Lab #11
// TIME SPENT: 1 hour
//-------------------------------------------------------------

import java.util.Scanner;
import java.util.Arrays;

public class Lab11 {
    public static void main(String[] args) {

        //Declare variables
        Scanner in = new Scanner(System.in);
        int numOfRows = 0;
        int numOfColumns = 0;

        System.out.print("Please enter the number of rows in the array: ");
        numOfRows = in.nextInt();

        System.out.print("Please enter the number of columns in the array: ");
        numOfColumns = in.nextInt();

        int[][] intArray = new int[numOfRows][numOfColumns];

        //Loop data into array
        for(int rowIndex = 0; rowIndex < numOfRows; rowIndex++) {
            for(int columnIndex = 0; columnIndex < numOfColumns; columnIndex++) {
                System.out.print("Please enter the next value: ");
                intArray[rowIndex][columnIndex] = in.nextInt();
            }
        }

        //Display data from array
        for(int rowIndex = 0; rowIndex < numOfRows; rowIndex++) {
            System.out.println();
            System.out.printf("Row %d: ", rowIndex);
            for(int columnIndex = 0; columnIndex < numOfColumns; columnIndex++) {
                System.out.printf("%d ", intArray[rowIndex][columnIndex]);
            }
        }

        //Display the row sums
        System.out.println();
        sumOfRow(intArray);
    }

    public static void sumOfRow(int[][] inputArray) {
        for(int rowCount = 0; rowCount < inputArray.length; rowCount++){
            int sumOfRow = 0;
            System.out.println();

            for(int colCount = 0; colCount < inputArray[0].length; colCount++) {
                sumOfRow = sumOfRow + inputArray[rowCount][colCount];
            }
            System.out.printf("Sum of row %d: %d", rowCount, sumOfRow);
        }
    }
}
