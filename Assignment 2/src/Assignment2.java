// ------------------------------------------------------------
// STUDENT NAME: Garren Miller
// FILENAME: Assignment2.java
// DESCRIPTION: String comparison
// FOR: CSE 110 - Homework Assignment #2
// TIME SPENT: 30 minutes
// DATE: 2/5/2019
//-------------------------------------------------------------


/*Questions Section

1. System.out.println(myString.length());
2. System.out.println(myString.substring(10));
3. System.out.println(myString.substring(15,18));
4.  a. Expression evaluates to true
    b. Expression evaluates to true
    c. Expression evaluates to true
    d. Expression evaluates to true
5. Logic sequence outputs string "Hr".

*/

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        // Variable declarations
        Scanner in = new Scanner(System.in);
        String str1 = "";
        String str2 = "";
        String str3 = "";

        // User inputs
        System.out.print("Enter the first string:");
        str1 = in.next();

        System.out.print("Enter the second string:");
        str2 = in.next();

        System.out.print("Enter the third string:");
        str3 = in.next();

        // String comparison
        if(str1.compareTo(str2) < 0 && str2.compareTo(str3) < 0) {
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
        } else if(str1.compareTo(str3) < 0 && str3.compareTo(str2) < 0) {
            System.out.println(str1);
            System.out.println(str3);
            System.out.println(str2);
        } else if(str2.compareTo(str1) < 0 && str1.compareTo(str3) < 0) {
            System.out.println(str2);
            System.out.println(str1);
            System.out.println(str3);
        } else if(str2.compareTo(str3) < 0 && str3.compareTo(str1) < 0) {
            System.out.println(str2);
            System.out.println(str3);
            System.out.println(str1);
        } else if(str3.compareTo(str2) < 0 && str2.compareTo(str1) < 0) {
            System.out.println(str3);
            System.out.println(str2);
            System.out.println(str1);
        } else if(str3.compareTo(str1) < 0 && str1.compareTo(str2) < 0) {
            System.out.println(str3);
            System.out.println(str1);
            System.out.println(str2);
        }
    }
}