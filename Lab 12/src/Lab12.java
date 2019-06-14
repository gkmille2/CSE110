// ------------------------------------------------------------
// AUTHOR: Garren Miller
// FILENAME: Lab12.java
// SPECIFICATION: Working with streams and file I/O
// FOR: CSE 110- Lab #12
// TIME SPENT: 1 hour
//-------------------------------------------------------------

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;

public class Lab12 {
    public static void main(String[] args) {
        String [][] Array1 = new String [4][3];

        try {
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);

            for(int row = 0; row < 4; row++) {
                for(int col = 0; col < 3; col++) {
                    String line = br.readLine();
                    Array1[row][col] = line;
                }
            }

            br.close();
        } catch(FileNotFoundException ex) {
            System.out.println("No file with that name name found!");
        } catch(IOException ex) {
            System.out.println("An error occurred while trying to read the file!");
        }

        for(int row = 0; row < 4; row++) {
            for(int col = 0; col < 3; col++) {
                System.out.print(Array1[row][col] + " ");
            }
            System.out.println();
        }
    }
}
