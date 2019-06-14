// ------------------------------------------------------------
// AUTHOR: Garren Miller
// FILENAME: Lab4.java
// SPECIFICATION: Practice decision-based display
// FOR: CSE 110- Lab #4
// TIME SPENT: 30 minutes
//-------------------------------------------------------------
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Please choose from the following menu:");
            System.out.println("1) Calculate the sum of integers m to n.");
            System.out.println("2) Calculate the factorial of given number.");
            System.out.println("3) Find the first digit of a given number.");
            System.out.println("4) Quit.");

            choice = input.nextInt();

            switch(choice) {
                case 1:
                    int m = 0;
                    int n = 0;
                    int sum = 0;

                    System.out.print("Please input the starting number:");
                    m = input.nextInt();

                    System.out.print("Please input the ending number:");
                    n = input.nextInt();

                    int counter1 = m;
                    while(counter1 <= n) {
                        sum = sum + counter1;
                        counter1++;
                    }

                    System.out.println("The sum of integers from " + m + " to " + n + " is: " + sum);
                    System.out.println();
                    break;
                case 2:
                    int option2Input = 0;
                    int fact = 1;

                    System.out.print("Please input the number:");
                    option2Input = input.nextInt();

                    int counter2 = 1;
                    while(counter2 <= option2Input) {
                        fact = fact * counter2;
                        counter2++;
                    }

                    System.out.println("The factorial of " + option2Input + " is " + fact);
                    System.out.println();
                    break;
                case 3:
                    int option3Input = 0;
                    int remainder = 0;

                    System.out.print("Please enter the number:");
                    option3Input = input.nextInt();

                    while(option3Input != 0) {
                        remainder = option3Input % 10;
                        option3Input = option3Input / 10;
                    }

                    System.out.println("The 1st integer of this number is " + remainder);
                    System.out.println();
                    break;
                default:
                    break;
            }
        } while(choice != 4);
    }
}