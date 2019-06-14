// ------------------------------------------------------------
// AUTHOR: Garren Miller
// FILENAME: Lab8.java
// SPECIFICATION: Create a simple student management program
// FOR: CSE 110- Lab #8
// TIME SPENT: 1 hour
//-------------------------------------------------------------

//Imports
import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstNameInput;
        String lastNameInput;
        String majorInput;
        int creditsInput;
        int gradePointsInput;

        //Ask for first student info
        System.out.println("ENTER FIRST STUDENT INFORMATION");
        System.out.print("Enter first name: ");
        firstNameInput = in.nextLine();

        System.out.print("Enter last name: ");
        lastNameInput = in.nextLine();
        System.out.println();

        //Instantiate first student object
        Student studentObj1 = new Student(firstNameInput, lastNameInput);

        //Output first student info
        System.out.println("FIRST STUDENT INFORMATION");
        studentObj1.printInfo();

        studentObj1.setMajor("International Affairs");
        System.out.println();
        System.out.printf("%s has changed majors to %s\n\n", studentObj1.getFullName(), studentObj1.getStudentMajor());

        //Ask for second student info
        System.out.println("ENTER SECOND STUDENT INFORMATION");
        System.out.print("Enter first name: ");
        firstNameInput = in.nextLine();

        System.out.print("Enter last name: ");
        lastNameInput = in.nextLine();

        System.out.print("Enter your major: ");
        majorInput = in.nextLine();

        System.out.print("Enter your grade points: ");
        gradePointsInput = in.nextInt();

        System.out.print("Enter your total credits: ");
        creditsInput = in.nextInt();
        System.out.println();

        //Instantiate second student object
        Student studentObj2 = new Student(majorInput, firstNameInput, lastNameInput, creditsInput, gradePointsInput);

        //Output second student info
        System.out.println("SECOND STUDENT INFORMATION");
        studentObj2.printInfo();
        System.out.println();

        //Implement helper functions
        int startVal1 = 1;
        int endVal1 = 30;
        int incVal1 = 3;
        int startVal2 = 5;
        int endVal2 = 28;
        int incVal2 = 2;

        System.out.println("STUDENT HELPER FUNCTIONS");
        System.out.printf("Iterate from %d to %d with an increment of %d and find sum ", startVal1, endVal1, incVal1);
        studentObj1.loopHelper(startVal1, endVal1, incVal1);

        System.out.printf("\n\n");
        System.out.printf("Iterate from %d to %d with an increment of %d and find sum ", startVal2, endVal2, incVal2);
        studentObj1.loopHelper(startVal2, endVal2, incVal2);
    }
}
