// ------------------------------------------------------------
// AUTHOR: Garren Miller
// FILENAME: Lab6.java
// SPECIFICATION: Practice declaring and using classes
// FOR: CSE 110- Lab #6
// TIME SPENT: 1 hour
//-------------------------------------------------------------

//Imports
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        //Declare variables
        Scanner in = new Scanner(System.in);
        String firstNameInput = "";
        String lastNameInput = "";
        int birthYearInput = 0;

        //Get user input
        System.out.print("Enter the first name of the person: ");
        firstNameInput = in.nextLine();

        System.out.print("Enter the last name of the person: ");
        lastNameInput = in.nextLine();

        System.out.print("Enter the birth year of the person: ");
        birthYearInput = in.nextInt();
        if(birthYearInput <= 2019) {

            //Create a Person instance
            Person personObj = new Person(firstNameInput, lastNameInput, birthYearInput);

            //Output data to user
            System.out.println();
            System.out.printf("%s %s is %d years old in %d and will be %d years old in ten years.", personObj.firstName, personObj.lastName, personObj.getAge(2019), 2019, personObj.ageInTen);
        }
        else {
            System.out.println();
            System.out.print("You've entered an invalid birth year.  Please re-run the program.");
            System.exit(0);
        }
    }
}

class Person {
    //Object variables
    String firstNameRaw;
    String lastNameRaw;
    String firstName;
    String lastName;
    int birthYear;
    int ageInTen;

    //Object methods
    public Person(String firstNameInput, String lastNameInput, int birthYearInput) {
        this.firstNameRaw = firstNameInput.replaceAll(" ", "");
        this.lastNameRaw = lastNameInput.replaceAll(" ", "");
        this.firstName = firstNameRaw.substring(0,1).toUpperCase() + firstNameRaw.substring(1,firstNameRaw.length()).toLowerCase();
        this.lastName = lastNameRaw.substring(0,1).toUpperCase() + lastNameRaw.substring(1, lastNameRaw.length()).toLowerCase();
        this.birthYear = birthYearInput;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge(int currentYear) {
        int ageNow = currentYear - birthYear;
        this.ageInTen = ageNow + 10;
        return ageNow;
    }
}