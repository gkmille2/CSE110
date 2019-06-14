// ------------------------------------------------------------
// STUDENT NAME: Garren Miller
// FILENAME: Assignment5.java
// DESCRIPTION: Design the Geek class for implementation in Assignment5 class
// FOR: CSE 110 - Homework Assignment #5
// TIME SPENT: 2 hours
// DATE: 3/13/19
//-------------------------------------------------------------

public class Geek {

    //Declare vars
    private String geekName = "";
    private int numOfQuestions = 0;

    //Constructor
    public Geek(String name) {
        this.geekName = name;
        this.numOfQuestions = 0;
    }

    //Name getter
    public String getName() { return this.geekName; }

    //Question count getter
    public int getNumberOfQuestions() {
        return this.numOfQuestions;
    }

    //Check if integer is evenly divisible by 3
    public boolean divisibleBy3(int input) {
        this.numOfQuestions++;
        if(input % 3 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    //Check which value is closer to pi
    public double closerToPi(double val1, double val2) {
        double val1Dif = Math.abs(val1 - Math.PI);
        double val2Dif = Math.abs(val2 - Math.PI);
        this.numOfQuestions++;

        if(val1Dif < val2Dif) {
            return val1;
        }
        else {
            return val2;
        }
    }

    //Count the number of times a certain character occurs in a string
    public int countIn(String statement, char letter){
        int counter = 0;
        int index = statement.indexOf(letter);
        while(index >= 0) {
            counter++;
            index = statement.indexOf(letter, index + 1);
        }
        this.numOfQuestions++;
        return counter;
    }

    //Check if number is inbetween two additional numbers
    public boolean isBetween(int a, int b, int c) {
        this.numOfQuestions++;
        if(b > a && b < c) {
            return true;
        }
        else {
            return false;
        }
    }

    //Determine the reverse of a given integer
    public int reverseNumber(int number) {
        String numString = Integer.toString(number);
        String newNumString = "";
        int n = numString.length() - 1;

        for(int i = 0; i <= n; i++) {
            newNumString = newNumString + numString.charAt(n-i);
        }

        int newNum = Integer.parseInt(newNumString);
        this.numOfQuestions++;
        return newNum;
    }
}