//-------------------------------------------------------------------------
// FILENAME:      Assignment7.java
// DESCRIPTION:   This is the test driver for CharList class. It provides a menu to the user
//                 and based on the user option performs adding, removing elements from a list
// AUTHOR:        F. Navabi
// FOR:           CSE 110 Assignment 7
// DUE DATE:
// Time SpenT:
//-------------------------------------------------------------------------

import java.util.Scanner;

public class Assignment7 {
    // -------------------------------------------------------
    // Create a list, then repeatedly print the menu and do what the
    // user asks until they quit
    // -------------------------------------------------------
    public static void main(String[] args) {
        IntList list = null;
        int newInt, oldInt;
        Scanner scan = new Scanner(System.in);

        printMenu();
        // ask a user to choose a command
        System.out.print("\nPlease enter a command or type? ");
        String choice = scan.next().toLowerCase();
        char command = choice.charAt(0);

        while (command != 'q') {

            switch (command) {
                case 'a':// This option calls the constructor and initializes the
                    // array with random characters
                    // it needs to be called first
                    System.out.print("Enter an integer for the array size? ");
                    int size = scan.nextInt();
                    list = new IntList(size);
                    list.randomize();
                    break;
                case 'b':// this option prints the list of characters
                    System.out.println(list.toString());
                    break;
                case 'c': // adds a new character to the list
                    System.out.print(
                            "Enter the new integer to add to the list (1-20): ");
                    newInt = scan.nextInt();
                    System.out.print(
                            "Enter the index where you want to add the new integer: ");
                    int index = scan.nextInt();
                    list.addInt(newInt, index);
                    break;
                case 'd':// remove the character from the list
                    System.out.print("Enter the integer to delete: ");
                    oldInt = scan.nextInt();
                    list.removeFirst(oldInt);
                    break;
                case 'e':// prints the count of the letters in the list
                    int[] temp = list.countInts();
                    for (int i = 0; i < temp.length; i++)
                        System.out.println((i + 1) + " " + temp[i]);
                    break;
                case '?':
                    printMenu();
                    break;
                case 'q':
                    break;

                default:
                    System.out.println("Invalid input");
            }
            System.out.print("Please enter a command or type? ");
            choice = scan.next().toLowerCase();
            command = choice.charAt(0);
        }
    }

    // -------------------------------------------------------
    // Print the user's choices
    // -------------------------------------------------------
    public static void printMenu() {

        System.out.println("   Menu   ");
        System.out.println("   ---------------");

        System.out.println("a: Create a new list (** do this first!! **)");
        System.out.println("b: Print the list of integers");
        System.out.println("c: Add an integer to the list");
        System.out.println("d: Remove an integer from the list");
        System.out.println("e: Count the number of integers in the list");
        System.out.println("q: Quit");
    }

}

