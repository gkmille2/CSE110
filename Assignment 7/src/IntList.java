// ------------------------------------------------------------
// STUDENT NAME: Garren Miller
// FILENAME: IntList.java
// DESCRIPTION: File to be used by Assignment7.java
// FOR: CSE 110 - Homework Assignment #7
// TIME SPENT: 2 hours
// DATE: 4/10/2019
//-------------------------------------------------------------

/*
* NOTE: I didn't include the increaseSize() method because it seemed like a rather unnecessary way to
* add a singular value to the array.  I was able to accomplish the desired results without doubling
* the array size, and therefore didn't feel as though I needed it.
*
* Questions:
* 1. Methods A and B are valid ways to declare an array.
* 2. String method(String[] arrayInput) {
*       String output = arrayInput[0] + arrayInput[arrayInput.length - 1];
*       return output;
*    }
* */

import java.util.Arrays;

public class IntList {
    private int[] myArray;

    public IntList(int size) {
        this.myArray = new int[size];
    }

    public void randomize() {
        int max = 20;
        int min = 1;
        int range = max - min + 1;

        for(int i = 0; i < this.myArray.length; i++) {
            this.myArray[i] = (int)(Math.random() * range) + min;
        }
    }

    public void addInt(int newInt, int index) {
        this.myArray = Arrays.copyOf(this.myArray, this.myArray.length + 1);
        for(int i = this.myArray.length - 1; i > index; i--) {
            this.myArray[i] = this.myArray[i - 1];
        }
        this.myArray[index] = newInt;
    }

    public void removeFirst(int intToRemove) {
        for(int i = 0; i < this.myArray.length; i++) {
            if(this.myArray[i] == intToRemove) {
                for(int index = i + 1; index < this.myArray.length; index++) {
                    this.myArray[index - 1] = this.myArray[index];
                }
                this.myArray = Arrays.copyOf(this.myArray, this.myArray.length - 1);
                return;
            }
        }
    }

    public String toString() {
        String output = "";
        for(int i = 0; i < this.myArray.length; i++) {
            output = output + " " + this.myArray[i];
        }

        return output;
    }

    public int[] countInts() {
        int[] countOfInts = new int[20];
        for(int i = 1; i <= 20; i++) {
            countOfInts[i - 1] = this.numOfOccurences(i);
        }
        return countOfInts;
    }

    public int numOfOccurences(int numToCheck) {
        int count = 0;
        for(int i = 0; i < this.myArray.length; i++) {
            if(this.myArray[i] == numToCheck) {
                count = count + 1;
            }
        }
        return count;
    }
}
