// ------------------------------------------------------------
// AUTHOR: Garren Miller
// FILENAME: Lab5.java
// SPECIFICATION: Take a set action path based on user input
// FOR: CSE 110- Lab #5
// TIME SPENT: 1 hour
//-------------------------------------------------------------

//Imports
import java.util.Scanner;

public class Lab5 {
    public static void main(String args[]) {
        //Declare variables
        Scanner in = new Scanner(System.in);
        int userChoice = 0;

        //Begin data manipulation
        do{
            System.out.println("Please choose from the following menu");
            System.out.println();
            System.out.println("1) Print all integer numbers between two given integers");
            System.out.println("2) Generate a left triangular pattern of stars");
            System.out.println("3) Quit");
            userChoice = in.nextInt();

            switch(userChoice) {
                case 1:
                    System.out.println();

                    //Get starting value
                    System.out.print("Please input the starting integer value: ");
                    int startingInt = in.nextInt();

                    //Get ending value
                    System.out.print("Please input the ending integer value: ");
                    int endingInt = in.nextInt();
                    System.out.println();

                    //Print out each value in given range (inclusive)
                    for(int i = startingInt; i <= endingInt; i++) {
                        System.out.printf("%d ", i);
                    }
                    System.out.println();
                    System.out.println();

                    //Reset choice tracker
                    userChoice = 0;
                    break;
                case 2:

                    System.out.println();
                    //Get triangle height
                    System.out.print("Please input the height of your triangle: ");
                    int triangleHeight = in.nextInt();

                    //Starting triangle
                    String triangle = "*";

                    //Make triangle of desired height
                    for(int i = 1; i <= triangleHeight; i++) {
                        System.out.println(triangle);
                        triangle = triangle + "*";
                    }
                    System.out.println();

                    //Reset choice tracker
                    userChoice = 0;
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("You entered an invalid input.");
                    userChoice = 0;
                    break;
            }
        } while(userChoice >= 0 && userChoice <= 3);
    }
}