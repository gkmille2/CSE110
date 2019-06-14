// ------------------------------------------------------------
// AUTHOR: Garren Miller
// FILENAME: Lab1.java
// SPECIFICATION: Calculate test score average
// FOR: CSE 110- Lab #1
// TIME SPENT: 45 minutes
//-------------------------------------------------------------

// Prepare to get user score inputs
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int test1Points, test2Points, test3Points;      // Allocate storage for scores
        final double NUM_TESTS = 3;                     // Set a constant value for the number of tests
        double averageScore;                            // Allocate space for calculating average test score

        System.out.print("Enter the score you received on the first test:");
        test1Points = userInput.nextInt();          // Record the first test score
        System.out.print("Enter the score you received on the second test:");
        test2Points = userInput.nextInt();          // Record the second test score
        System.out.print("Enter the score you received on the third test:");
        test3Points = userInput.nextInt();          // Record the third test score

        averageScore = (test1Points + test2Points + test3Points)/NUM_TESTS;

        System.out.printf("Congratulations!  Your average test score is " + averageScore);
    }
}
