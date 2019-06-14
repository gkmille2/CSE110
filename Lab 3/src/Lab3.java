// ------------------------------------------------------------
// AUTHOR: Garren Miller
// FILENAME: Lab3.java
// SPECIFICATION: Calculate final grade
// FOR: CSE 110- Lab #3
// TIME SPENT: 1 hour
//-------------------------------------------------------------

// Imports section
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {

        // Variable declaration
        Scanner scan = new Scanner(System.in);
        double finalExamGrade = 50.0;
        double midtermGrade = 50.0;
        double homeworkGrade = 0.0;
        double finalGrade = 0.0;
        char letterGrade = ' ';

        // Prompt user for homeworkGrade
        System.out.print("Please input your homework grade:");

        // Store HW grade
        homeworkGrade = scan.nextDouble();

        // Prompt user for midtermGrade
        System.out.print("Please input your midterm exam grade:");

        // Store midterm exam grade
        midtermGrade = scan.nextDouble();

        // Prompt user for finalExamGrade
        System.out.print("Please input your final exam grade:");

        // Store final exam grade
        finalExamGrade = scan.nextDouble();

        // Verify user inputs
        if(0 <= homeworkGrade  && 100 >= homeworkGrade && 0 <= midtermGrade && 100 >= midtermGrade && 0 <= finalExamGrade && 200 >= finalExamGrade) {
            // Calculate finalGrade
            finalGrade = (.25/200)*(homeworkGrade) + (.25)*(midtermGrade) + (.5)*(finalExamGrade);

            // Determine letter grade based on finalGrade
            if(finalGrade >= 50) {
                System.out.println("Student passed the class");
            } else {
                System.out.println("Student failed the class");
            }
        } else {
          System.out.println("Invalid input. Homework and midterm grades should be between 0 and 100 and the final grade should be between 0 and 200");
        }
    }
}