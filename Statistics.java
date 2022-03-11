/** calculating and finding the mean, median and mode of 3 text files
 * 
 * Author Andrew Du-frigstad
 * version 1
 * since   2022-03-010
 * */

//imports
import java.io.*;
import java.util.Scanner;

class Statistics {

    public static void main(String[] args) {

        String st;

        Scanner myObj = new Scanner(System.in);
        System.out.println("which text file do you want?");
        String textFileSelect = myObj.nextLine();

        if (textFileSelect == "1") {

            // reading the text files
            File file1 = new File(
                    "C:\\Users\\s278552\\Everything\\Unit1-06.txt\\Unit1-06-Java\\set1.txt");

            // Creating an object of BufferedReader class
            BufferedReader br1 = new BufferedReader(new FileReader(file1));

            while ((st = br1.readLine()) != null) {
                // Print the string
                System.out.println(st);
            }

        } else if (textFileSelect == "2") {

            // reading the text files
            File file2 = new File(
                    "C:\\Users\\s278552\\Everything\\Unit1-06.txt\\Unit1-06-Java\\set2.txt");

            // Creating an object of BufferedReader class
            BufferedReader br2 = new BufferedReader(new FileReader(file2));

            while ((st = br2.readLine()) != null) {
                // Print the string
                System.out.println(st);
            }

        } else if (textFileSelect == "3") {

            // reading the text files
            File file3 = new File(
                    "C:\\Users\\s278552\\Everything\\Unit1-06.txt\\Unit1-06-Java\\set3.txt");

            // Creating an object of BufferedReader class
            BufferedReader br3 = new BufferedReader(new FileReader(file3));

            while ((st = br3.readLine()) != null) {
                // Print the string
                System.out.println(st);
            }

        } else {
            System.out.println("That is not a vlid input");
        }

        // declaring string variable

        // try catch for the list
        try {
            // converting array to an array of integers
            arrayInt = Integer.parseInt(array);
        } catch (NumberFormatException e) {
            arrayInt = -1;
        }
        // printing error message
        if (arrayInt == -1) {
            System.out.println("There is a string in the text file, remove it");
        }
    }
}
