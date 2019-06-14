/*-------------------------------------------------------------------------
// FILENAME: Assignment7.java
// SPECIFICATION:  This program allows the user to create employees' objects and performs operations for each employee.
//----------------------------------------------------------------------*/

import java.util.*;
import java.text.*;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String choice;
        char command;

        // Create a new Employee object
        System.out.print("Enter name of the employee: ");
        String name = console.nextLine();
        System.out.print("Enter salary for " + name + ": ");
        double salary = console.nextDouble();
        System.out.print("Enter number of years for " + name + ": ");
        int years = console.nextInt();

        Employee e1 = new Employee(name, salary, years);
        Employee e2 = new Employee("Bond,70000,20");

        // print the menu
        printMenu();

        do {
            // ask a user to choose a command
            System.out.print("\nPlease enter a command or type :");
            choice = console.next().toLowerCase();
            command = choice.charAt(0);

            switch (command) {
            case 'a': // print the info for each employee
                System.out.println(e1.toString());
                System.out.println(e2.toString());
                break;

            case 'b': // raise employee's salary
                System.out.print("Enter the amount of raise: ");
                double raise = console.nextDouble();
                e1.raiseSalary(raise);
                e2.raiseSalary(raise);
                System.out.println(e1);
                System.out.println(e2);
                break;
            case 'c': // increment the number of years by 1
                e1.setYears(e1.getYears() + 1);
                e2.setYears(e2.getYears() + 1);
                System.out.println("Year has been added.");
                break;

            case 'd': // find who has more experience
                Employee who = e1.moreExperience(e2);
                System.out.print(who.getName() + " has more experience.");
                break;

            case 'e': // number of employees
                System.out.println("They are " + Employee.countEmployees()
                        + " employees.");
                break;
            case 'f': // years of experience
                System.out.print("Enter years of experience: ");
                years = console.nextInt();
                e1.setYears(years);
                break;
            case '?':
                printMenu();
                break;
            case 'q':
                break;

            default:
                System.out.println("Invalid input");

            }

        } while (command != 'q');
    }// end main

    public static void printMenu() {
        System.out.print("\nCommand Options\n"
                + "-----------------------------------\n"
                + "'a': prints info \n" + "'b': raise salary\n"
                + "'c': increment the years of experience\n"
                + "'d': who has more experience\n"
                + "'e': number of employees\n" 
				+ "'f': years of experience\n"
                + "'?': Displays the help menu\n" + "'q': quits\n");

    } // end of the printMenu method

}