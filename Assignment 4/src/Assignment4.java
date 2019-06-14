// ------------------------------------------------------------
// STUDENT NAME: Garren Miller
// FILENAME: Assignment4.java
// DESCRIPTION: Provide user with up to 10 multiplication problems
// FOR: CSE 110 - Homework Assignment #4
// TIME SPENT: 2 hours
// DATE: 2/26/19
//-------------------------------------------------------------

/*
Questions:
    a). The output is the integer 16.
    b). It executes 10 times.
    c). Scanner in = new Scanner(System.in);
        int x = -1; // initialize x

        while (x < 0 || x > 100) { // insure that the loop body executes until x is valid
            System.out.print("Enter a value from 0 to 100 :");
            x = in.nextInt();
        }
*/

//Imports
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        //Declare variables
        Scanner in = new Scanner(System.in);
        int numOfProblems = 0;
        int counter = 1;
        int correctAnswers = 0;
        int incorrectAnswers = 0;
        int numOfAttempts = 0;

        //Determine how many problems are desired
        System.out.print("How many multiplication problems would you like (1 to 10)? ");
        numOfProblems = in.nextInt();

        //Generate problems
        do {
            //Generate new instance of problem class
            multProb practiceProb = new multProb();

            //Display problem to user and gather response
            System.out.printf("Problem %d: what is %d * %d?\n", counter, practiceProb.factor1, practiceProb.factor2);
            System.out.print("Your answer --> ");
            int userAnswer = in.nextInt();

            //Handle multiple attempts
            if(userAnswer != practiceProb.problemAns) {
                do {
                    System.out.printf("%d is incorrect.\n", userAnswer);
                    System.out.print("Your answer --> ");
                    userAnswer = in.nextInt();
                    numOfAttempts++;
                    incorrectAnswers++;
                } while(userAnswer != practiceProb.problemAns && numOfAttempts < 2);

                //Catch when user either gets answer right or has answered 3 times
                if(numOfAttempts >= 2) {
                    System.out.printf("%d is incorrect.\n", userAnswer);
                    System.out.printf("The correct answer is %d.\n\n", practiceProb.problemAns);
                    numOfAttempts = 0;
                    incorrectAnswers++;
                    counter++;
                } else {
                    System.out.printf("%d is correct.\n\n", userAnswer);
                    numOfAttempts = 0;
                    correctAnswers++;
                    counter++;
                }
            }
            else {
                System.out.printf("%d is correct.\n", userAnswer);
                System.out.println();
                counter++;
                correctAnswers++;
            }
        } while(counter <= numOfProblems);
        System.out.println();
        System.out.printf("You gave %d correct answers and %d incorrect answers.", correctAnswers, incorrectAnswers);
    }
}

class multProb {
    //Object properties
    int factor1;
    int factor2;
    int problemAns;
    int numOfAttempts;

    //Object constructor
    public multProb() {
        this.factor1 = this.createFactor();
        this.factor2 = this.createFactor();
        this.problemAns = this.getAns();
        this.numOfAttempts = 0;
    }

    //Create a random factor between 0 and 12
    public int createFactor() {
        int rand = (int)(Math.random()*13);
        return rand;
    }

    //Calculate the answer to a multiplication problem
    public int getAns() {
        int ans = factor1 * factor2;
        return ans;
    }
}