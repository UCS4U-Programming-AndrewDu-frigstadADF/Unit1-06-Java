/** calculating and finding the mean, median and mode of 3 text files
 * 
 * Author Andrew Du-frigstad
 * version 1
 * since   2022-03-010
 * */

//imports
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Statistics {

    // calculating mean
    public static Float calcMean(int[] array) {

        // declaring variables
        float arrayTotal = 0;

        // adding all hte numbers in the array together
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex = arrayIndex + 1) {
            arrayTotal += array[arrayIndex];
        }

        // calculating the mean
        Float mean = (float) (arrayTotal / array.length);

        // return the mean
        return mean;
    }

    public static Float calcMedian(int[] array) {

        // declare variables
        float median = 0;
        float findMedian1 = 0;
        float findMedian2 = 0;

        // sort the array
        Arrays.sort(array);

        if (array.length % 2 == 0) {

            // find the median if the number is even
            findMedian1 = (float) array[array.length / 2];
            findMedian2 = (float) array[(array.length / 2) + 1];

            median = (findMedian1 + findMedian2) / 2;

        } else {
            // find the median if the number is odd
            median = (float) array[array.length / 2];
        }

        return median;
    }

    public static List<Integer> calcMode(int[] array) {

        // declaring variables
        int counter = 0;
        int biggestNum = counter;
        List<Integer> mode = new ArrayList<Integer>();

        // sorting the array
        Arrays.sort(array);

        // finding the mode
        for (int arrayIndex = 1; arrayIndex < array.length; arrayIndex = arrayIndex + 1) {
            if (array[arrayIndex] != array[arrayIndex - 1]) {

                if (counter > biggestNum) {

                    // seeing how many of a number repeats
                    biggestNum = counter;

                    // remembering the mode
                    mode.clear();
                    mode.add(array[arrayIndex - 1]);

                } else if (counter == biggestNum) {
                    mode.add(array[arrayIndex - 1]);
                }
                counter = 1;

            } else {

                counter = counter + 1;
            }
        }
        return mode;
    }

    public static void main(String[] args) throws FileNotFoundException {

        // declaring variables
        String st;
        ArrayList<String> txtList = new ArrayList<String>();
        String txtFileSelect = "";
        int checkingInt = -1;

        // getting the number of text file the user wants to use
        Scanner myObj = new Scanner(System.in);
        while (!txtFileSelect.equals("1") && !txtFileSelect.equals("2") && !txtFileSelect.equals("3")) {
            System.out.println("Which txt file: 1, 2, or 3: ");
            txtFileSelect = myObj.nextLine();
        }

        // reading the text file
        File file = new File("C:\\Users\\andye\\Downloads\\set" + txtFileSelect + ".txt");

        // printing out all the numbers in the text file
        System.out.println(file);
        try (Scanner sc = new Scanner(file)) {
            // makes it into a list kind of
            while (sc.hasNextLine()) {
                txtList.add(sc.nextLine());
            }
        }

        System.out.println(txtList);

        int[] num = new int[txtList.size()];
        for (int arrayInt = 0; arrayInt < txtList.size(); arrayInt = arrayInt + 1) {

            // try catch for the list
            try {
                // converting list index to an integer
                checkingInt = Integer.parseInt(txtList.get(arrayInt));
            } catch (NumberFormatException e) {
                checkingInt = -1;
                break;
            }

            // putting integer into array
            num[arrayInt] = checkingInt;
        }

        // printing error message
        if (checkingInt == -1) {
            System.out.println("There is a string in the text file, remove it");

            // allows the user to input a different text file when error occurs
            while (!txtFileSelect.equals("1") && !txtFileSelect.equals("2") && !txtFileSelect.equals("3")) {
                System.out.println("Which txt file: 1, 2, or 3: ");
                txtFileSelect = myObj.nextLine();
            }
        }

        // print the mean of the text file and call that method
        float mean = calcMean(num);
        System.out.println("Your mean is " + mean);

        // print the mean of the text file and call that method
        float median = calcMedian(num);
        System.out.println("Your median is " + median);

        List<Integer> mode = calcMode(num);
        System.out.println("Your median is " + mode);
    }
}