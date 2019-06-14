// ------------------------------------------------------------
// STUDENT NAME: Garren Miller
// FILENAME: GradeBook.java
// DESCRIPTION: Companion file for Assignment8.java
// FOR: CSE 110 - Homework Assignment #8
// TIME SPENT: 1 hour
// DATE: 4/21/2019
//-------------------------------------------------------------

/*
 * NOTE: This file will throw an out of bounds error if used with the supplied Assignment8.java run file.  Unless I am
 * mistaken, the problem is created in line 39 of Assignment8.java.  In this line, a char variable is instantiated and
 * the value therein is grades.getLetterGrade(index).  The error mentioned above is thrown when the user searches for a
 * student not in the supplied text file.  This is because the getIndex() method of the GradeBook class correctly
 * returns the integer value of -1 if the given student name isn't found.  However, line 39 of Assignment8.java tries
 * to use this return value as an index; since -1 isn't a valid index for an array, the error is thrown.  To remove
 * this error, I moved line 39 of Assignment8.java into the if condition as shown below:
 *
 * case 'b' : // search
 *             System.out.print("Type student name: ");
 *             String name = in.nextLine();
 *             int index = grades.getIndex(name);
 *             char grade = 0;
 *             if (index != -1) {
 *                 grade = grades.getLetterGrade(index);
 *                 System.out.println(name + " " + grade);
 *             }
 *             else
 *                 System.out.println("Student doesn't exist!");
 *             break;
 *
 * It should also be noted that the grade variable was declared outside of the if loop and assigned a nonzero value
 * inside the loop.  Also, the executable code in the if loop was surrounded by brackets.
 */

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;

public class GradeBook {

    //Declare class properties
    public final int NUM_TESTS = 4;
    private int numStudents = 0;
    private String[] studentNames;
    private char[] finalGrades;
    private double[][] studentInfo;
    private Double[] scoreHolder;
    private double[] studentAverages;

    //Object constructor
    public GradeBook(String fileName) {
        try{
            //Instantiate file reader
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            //Determine number of students
            String studentCountString = br.readLine();
            this.numStudents = Integer.parseInt(studentCountString.replaceAll("[\\D]", ""));

            //Instantiate arrays
            this.studentNames = new String[numStudents];
            this.finalGrades = new char[numStudents];
            this.studentInfo = new double[numStudents][2];
            this.studentAverages = new double[numStudents];

            //Parse each line after the first
            for(int i = 0; i < numStudents; i++){

                //Store each line of text file
                String line = br.readLine();

                //Extract name from each line
                String parsedName = line.substring(0, line.indexOf(" "));

                //Index of first space
                int spaceIndex = line.indexOf(" ");

                //Initiate array to hold raw scores
                this.scoreHolder = new Double[NUM_TESTS];

                //Parse each line and store the scores in score holder array
                for(int index = 0; index < NUM_TESTS; index++) {
                    String parsedScore = "";
                    if(spaceIndex != line.lastIndexOf(" ")) {
                        parsedScore = line.substring(spaceIndex, line.indexOf(" ", spaceIndex + 1));
                        spaceIndex = line.indexOf(" ", spaceIndex + 1);
                    } else {
                        parsedScore = line.substring(spaceIndex, line.length());
                    }

                    this.scoreHolder[index] = Double.parseDouble(parsedScore);
                }
                Arrays.sort(this.scoreHolder, Collections.reverseOrder());

                this.studentNames[i] = parsedName;
                this.assignGrades(i);
            }
        } catch(FileNotFoundException ex) {
            System.out.println("No file with that name name found!");
        } catch(IOException ex) {
            System.out.println("An error occurred while trying to read the file!");
        }
    }

    //Calculate average test score
    private double getStudentAverage(int i) {
        double averageGrade = (scoreHolder[0] + scoreHolder[1] + scoreHolder[2])/3.0;
        this.studentAverages[i] = (double)Math.round(averageGrade * 10)/10;
        return averageGrade;
    }

    //Assign letter grades
    private void assignGrades(int i) {
        double testAverage = this.getStudentAverage(i);
        char letterGrade = 0;

        if(testAverage >= 90.0) {
            letterGrade = 'A';
        } else if(testAverage >= 80.0 && testAverage <= 90.0) {
            letterGrade = 'B';
        } else if(testAverage >= 70.0 && testAverage <= 80.0) {
            letterGrade = 'C';
        } else if(testAverage >= 60.0 && testAverage <= 70.0) {
            letterGrade = 'D';
        } else if(testAverage < 60.0) {
            letterGrade = 'E';
        }
        this.finalGrades[i] = letterGrade;
    }

    //Helper function for getting student names from array
    public String getStudentName(int i) {
        return this.studentNames[i];
    }

    //Get letter grade for index
    public char getLetterGrade(int i) {
        return this.finalGrades[i];
    }

    //Get index of a student
    public int getIndex(String studentName) {
        int index = -1;
        for(int i = 0; i < this.studentNames.length; i++) {
            if(this.studentNames[i].equals(studentName)) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    //Output student names, averages and final letter grades
    public String toString() {
        String outputString = "";
        for(int i = 0; i < numStudents; i++) {
            String str = String.format("%-10s %.1f  %c \n", this.getStudentName(i), this.studentAverages[i], this.getLetterGrade(i));
            outputString = outputString + str;
        }
        return outputString;
    }
}