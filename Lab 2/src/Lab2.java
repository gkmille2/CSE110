// Imports section
import java.util.Scanner;

public class Lab2 {
// ------------------------------------------------------------
// AUTHOR: Garren Miller
// FILENAME: Lab2.java
// SPECIFICATION: Implement string methods and get comfortable with the data type
// FOR: CSE 110- Lab #2
// TIME SPENT: how long it took you to complete the assignment
//-------------------------------------------------------------

    public static void main (String[] args) {
        // Declare variables that will be used in logic section
        Scanner scan = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        String fullName = "";
        int nameLength = 0;

        // BEGIN LOGIC SECTION

        // Use Scanner to ask the user for first name
        System.out.println("Please enter your first name: ");
        firstName = scan.nextLine();

        // Use Scanner to ask the user for last name
        System.out.println("Please enter your last name: ");
        lastName = scan.nextLine();

        // Create a full name by combining first and last name
        fullName = firstName + " " + lastName;

        // Convert full name to all uppercase characters
        fullName = fullName.toUpperCase();

        // Calculate the length of the fullName string
        nameLength = fullName.length();

        // Display results
        System.out.println("Full name (in capitals): " + fullName);
        System.out.println("Length of full name: " + nameLength);

        // Define two strings for comparison
        String title1 = new String("cse110");
        String title2 = "cse110";

        // Compare the strings, displaying the comparison method that works
        if (title1 == title2) {
            System.out.println("String comparison using \"==\" works");
        } else {
            System.out.println("String comparison using \"==\" does NOT work");
        }

        if (title1.equals(title2)) {
            System.out.println("String comparison using \"equals\" method works");
        } else {
            System.out.println("String comparison using \"equals\" method does NOT work");
        }


    }
}
