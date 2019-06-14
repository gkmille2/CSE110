// ------------------------------------------------------------
// AUTHOR: Garren Miller
// FILENAME: Lab7.java
// SPECIFICATION: Experiment with classes and methods in Java
// FOR: CSE 110- Lab #7
// TIME SPENT: 1 hour
//-------------------------------------------------------------

import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        //Declare vars
         Scanner in = new Scanner(System.in);
         String userNameIn;
         int userNum;
         int userOddNum;

         //Ask for user input
        System.out.print("Name of the builder: ");
        userNameIn = in.nextLine();

        Builder builderObj = new Builder(userNameIn);

        //Print out username
        System.out.printf("The name of the builder is: %s \n", builderObj.getUserName());

        //Get a positive integer from the user
        System.out.print("Enter a positive integer: ");
        userNum = in.nextInt();

        //Make row
        System.out.println();
        System.out.println(builderObj.makeRow(userNum, "=") + builderObj.makeRow(userNum, "*") + builderObj.makeRow(userNum, "="));
        System.out.println();

        //Get odd integer from user
        System.out.print("Please enter a positive odd integer: ");
        userOddNum = in.nextInt();

        System.out.println();

        //Print the pyramid
        builderObj.printPyramid(userOddNum, "*");
    }
}

class Builder {
    String userName;

    //Constructor
    public Builder(String name) {
        this.userName = name;
    }

    //Name getter
    public String getUserName() {
        return this.userName;
    }

    //Make rows with given chars
    public String makeRow(int n, String s) {
        String row = "";
        for(int i = 0; i < n; i++) {
            row = row + s;
        }
        return row;
    }

    //Print a pyramid with the bottom line n chars long
    public void printPyramid(int n, String s) {
        for(int i = 1; i <= n; i = i + 2) {
            String pyramidRow = new String(new char[i]).replace('\0', '*');
            System.out.println(rowSpace(n, i) + pyramidRow);
        }
    }

    //Used in tandem with printPyramid to determine the correct spacing for each row
    public String rowSpace(int n, int i) {
        int numOfSpaces = (n-i)/2;
        String spacer = new String(new char[numOfSpaces]).replace('\0', ' ');
        return spacer;

    }
}