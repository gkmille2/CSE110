// ------------------------------------------------------------
// STUDENT NAME: Garren Miller
// FILENAME: Assignment1.java
// DESCRIPTION: Calculate current annuity value based on user inputs
// FOR: CSE 110 - Homework Assignment #1
// TIME SPENT: 1 hour
// DATE: 1/28/19
//-------------------------------------------------------------

/*
Part 1
(a). Error says that the class tempConverter is public and therefore ought to be declared in a file named
     tempConverter.java.  This happens because the compiler is expecting a class named TempConverter, but instead sees
     a class named tempConverter.
(b). Error says that the compiler was expecting a semicolon at the end of line 14.  This is because every block of logic
     like a function call or something similar must be ended with a semicolon.
(c). No error, since the double data type can fit integers, and therefore implicit type casting occurs.  However, the
     output Celsius temperature does change from -18 to -32.
(d). The compiler says that it can't locate the variable named fahrenheit when trying to print it to the console.  This
     is because the variable isn't declared as fahrenheit, so obviously it won't be found.
(e). As long as every instance of BASE is changed to base, there is no issue.  The compiler doesn't mind if constant
     values are declared in all lowercase or all uppercase.  The all uppercase rule is simply convention to increase
     human readability.
*/

// Imports
import java.util.Scanner;

public class Assignment1 {
    public static void main (String[] args) {
        // Declare all variables that will be used in logic section and initialize them to appropriate values
        Scanner userIn = new Scanner(System.in);
        double periodicPayment = 0;
        double interestRate = 0;
        double numOfPayments = 0;
        double presentAnnuity = 0;

        // User inputs
        System.out.print("Enter the periodic payment: ");
        periodicPayment = userIn.nextDouble();
        System.out.print("Enter the interest rate: ");
        interestRate = userIn.nextDouble();
        System.out.print("Enter the number of payments: ");
        numOfPayments = userIn.nextDouble();

        // Mathematical operations
        presentAnnuity = periodicPayment * (1 + (1-Math.pow(interestRate+1, numOfPayments*(-1)))/(interestRate));
        System.out.print("The current annuity is " + presentAnnuity);

    }
}
