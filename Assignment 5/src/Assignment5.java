/*----------------------------------------------------------
// AUTHOR: P. Miller
// FILENAME: Assignment5.java
// SPECIFICATION: this program checks the methods in class Geek, it is a test driver for class Geek
// FOR: CSE 110- homework #5
// TIME SPENT: 1 hour 20 mins
//--------------------------------------------------------*/

import java.util.Scanner;

public class Assignment5 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    String menuChoice = "none";
    char command = 'x';
    int intInputA = 0, intInputB = 0, intInputC = 0;
    float floatInputA = 0.0f, floatInputB = 0.0f;
    String stringInput = "";
    char charInput = 'x';
    
    // instantiate an object of type Geek
    Geek myGeek = new Geek("Bob Smith");

    displayMenu();
    do {
      // ask a user to choose a command
      System.out.print("\nPlease enter a command: ");
      menuChoice = console.nextLine().toLowerCase();
      command = menuChoice.charAt(0);

      switch (command) {
        case 'a': // display the Geek's name
          System.out.println("Geek's name: " + myGeek.getName());
          break;
        case 'b': // Display Number of questions asked so far
          System.out.println("Number of questions asked so far: " + myGeek.getNumberOfQuestions());
          break;
        case 'c': // Is number evenly divisible by 3
          System.out.print("Enter an integer: ");
          intInputA = Integer.parseInt(console.nextLine());

          if (myGeek.divisibleBy3(intInputA))
            System.out.println(intInputA + " is evenly divisible by 3");
          else
            System.out.println(intInputA + " is not evenly divisible by 3");
          break;
        case 'd': // Which of two numbers is closer to Pi
          System.out.print("Enter the first number: ");
          floatInputA = Float.parseFloat(console.nextLine());
          System.out.print("Enter the second number: ");
          floatInputB = Float.parseFloat(console.nextLine());

          System.out.println(myGeek.closerToPi(floatInputA, floatInputB) + " is closer to Pi");

          break;
        case 'e': // Count number of times a letter appears in a string
          System.out.print("Enter a statement: ");
          stringInput = console.nextLine();
          System.out.print("Enter a letter to search for: ");
          charInput = console.nextLine().charAt(0);

          myGeek.countIn(stringInput, charInput);
          System.out.println(charInput + " appears " + myGeek.countIn(stringInput, charInput) + " times");
          break;
        case 'f': // Is number between two other numbers
          System.out.println("Enter three integers: ");
          intInputA = Integer.parseInt(console.nextLine());
          intInputB = Integer.parseInt(console.nextLine());
          intInputC = Integer.parseInt(console.nextLine());
          if (myGeek.isBetween(intInputA, intInputB, intInputC))
            System.out.println(intInputB + " is between " + intInputA + " and " + intInputC);
          else
            System.out.println(intInputB + " is not between " + intInputA + " and " + intInputC);
          break;
        case 'g': // Reverse a number
          System.out.print("Enter an integer: ");
          intInputA = Integer.parseInt(console.nextLine());

          System.out.println("The digits in reverse are " + myGeek.reverseNumber(intInputA));
          break;
        case '?': // Display the menu
          displayMenu();
          break;
        case 'q': // quit the progem
          break;

        default: // invalid choice
          System.out.println("Invalid input!!!");
      } // end of switch

    } while (command != 'q');

  } // end of the main method

  public static void displayMenu() {
    System.out.println("Command Options");
     System.out.println("-----------------------------------");
     System.out.println("a) Display Geek's name");
     System.out.println("b) Display Number of questions asked so far");
     System.out.println("c) Is number evenly divisible by 3");
     System.out.println("d) Which of two numbers is closer to Pi");
     System.out.println("e) Count number of times a letter appears in a string");
     System.out.println("f) Is number between two other numbers");
     System.out.println("g) Reverse a number");
     System.out.println("?) Display this menu");
     System.out.println("q) Quit");

  } // end of the displayMenu method

} // end of class