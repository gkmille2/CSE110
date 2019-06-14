// ------------------------------------------------------------
// STUDENT NAME: Garren Miller
// FILENAME: Assignment3.java
// DESCRIPTION: Print several variations of user input
// FOR: CSE 110 - Homework Assignment #3
// TIME SPENT: 1 hour
// DATE: 2/12/19
//-------------------------------------------------------------

/*
Questions:
1. a) x >= 0;
   b) x <= 10;
   c) x > 10;
   d) x == 0 && y == 0;
   e) x % 2 != 0;

2. a) month == 2 && date == 1;
   b) month >= 4 && date > 15;

3. a) word1.compareTo(word2) != 0;
   b) word1.compareTo(word2) > 0;
   c) word1.substring(0,2).compareTo(word2.substring(0,2)) == 0;
*/

//Imports
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userIn = "";
        String firstNameRaw = "";
        String firstName = "";
        String middleNameRaw = "";
        String middleName = "";
        String lastNameRaw = "";
        String lastName = "";
        char firstInitial = 0;
        char middleInitial = 0;
        char lastInitial = 0;
        int spaceCount = 0;

        //Gather user input
        System.out.print("Please type your first, middle and last name:");
        userIn = in.nextLine();

        //Calculate number of spaces in input
        spaceCount = userIn.length() - userIn.replace(" ", "").length();

        //Begin data manipulation
        if(spaceCount == 1) {
            //Find the space
            int spaceIndex = userIn.indexOf(" ");

            //Sanitize first name
            firstNameRaw = userIn.substring(0, spaceIndex).toLowerCase();
            firstName = firstNameRaw.substring(0,1).toUpperCase() + firstNameRaw.substring(1,firstNameRaw.length());

            //Sanitize last name
            lastNameRaw = userIn.substring(spaceIndex + 1, userIn.length()).toLowerCase();
            lastName = lastNameRaw.substring(0,1).toUpperCase() + lastNameRaw.substring(1, lastNameRaw.length());

            //Get initials
            firstInitial = firstName.charAt(0);
            lastInitial = lastName.charAt(0);

            //Output results
            System.out.printf("Initials: %15c.%c. \n", firstInitial, lastInitial);
            System.out.printf("Last Name First: %13s, %s \n", lastName, firstName);
            System.out.printf("First and Last: %14s %s", firstName, lastName);
        }
        else if(spaceCount == 2) {
            //Find both spaces
            int firstSpaceIndex = userIn.indexOf(" ");
            int lastSpaceIndex = userIn.lastIndexOf(" ");

            //Sanitize first name
            firstNameRaw = userIn.substring(0, firstSpaceIndex).toLowerCase();
            firstName = firstNameRaw.substring(0,1).toUpperCase() + firstNameRaw.substring(1,firstNameRaw.length());

            //Sanitize middle name
            middleNameRaw = userIn.substring(firstSpaceIndex + 1, lastSpaceIndex).toLowerCase();
            middleName = middleNameRaw.substring(0,1).toUpperCase() + middleNameRaw.substring(1, middleNameRaw.length());

            //Sanitize last name
            lastNameRaw = userIn.substring(lastSpaceIndex + 1, userIn.length()).toLowerCase();
            lastName = lastNameRaw.substring(0,1).toUpperCase() + lastNameRaw.substring(1, lastNameRaw.length());

            //Get initials
            firstInitial = firstName.charAt(0);
            middleInitial = middleName.charAt(0);
            lastInitial = lastName.charAt(0);

            //Output results
            System.out.printf("Initials: %15c.%c.%c. \n", firstInitial, middleInitial, lastInitial);
            System.out.printf("Last Name First: %13s, %s %c. \n", lastName, firstName, middleInitial);
            System.out.printf("First and Last: %14s %s", firstName, lastName);
        }
        else {
            System.out.print("Oops! The program isn't able to handle your input.");
        }
    }
}
