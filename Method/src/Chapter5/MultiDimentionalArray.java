package Chapter5;

import java.util.Scanner;

public class MultiDimentionalArray {

    public static void main(String[] args){

        final int ROW = 3; // Number of students
        final int COL = 4; // Number of tests per student
        String stName;
        int Tot; // Sum of marks for each student
        double average; // Average marks for each student
        String Remarks;
        // 2D array to hold the test marks of the students
        int[][] arTestmarks = new int[ROW][COL];

        Scanner sc = new Scanner(System.in);

        // Loop for each student
        for (int i = 0; i < arTestmarks.length; i++) {
            System.out.print("Enter Name for student " + (i + 1) + ": ");
            stName = sc.nextLine(); // Read student's name

            Tot = 0; // Total for each student

            // Loop for each test mark of the student
            for (int j = 0; j < arTestmarks[i].length; j++) {
                System.out.print("Enter Mark for test " + (j + 1) + " for " + stName + ": ");
                arTestmarks[i][j] = sc.nextInt(); // Read test mark for each student
                Tot += arTestmarks[i][j]; // Add the mark to the sum
            }

            // Calculate the average
            average = (Tot / COL);
            average = Math.round(average * 100.0) / 100.0;

            Remarks =(average>60)? "Passed" : "failed";


            System.out.println("Average mark for " + stName + " is: " + average + " And the student: "+Remarks);
        }
    }
}
