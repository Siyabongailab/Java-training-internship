package Chapter5;

import java.util.Scanner;

public class ParallelArrays {


    public static  void main(String[] args){

        int _size = 5;
        int[] TestMarks = new int[5];
        String[] strNames  = new String[_size];
        String stName;
        int stMark;

        //parallel is more how the  arrays are being used.
        // what makes parrallel array is that the size should be the same.

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <_size; i++){

            System.out.println("enter name for student: " + i);
            stName = sc.nextLine();
            strNames[i]= stName;

            System.out.println("enter Mark for student: " + i);
            stMark = sc.nextInt();
            TestMarks[i]= stMark;


        }

         // just make sure the student mark goes to the right student.
        for(int i =0; i <_size; i++){

            System.out.println(strNames[i] + "\t" + TestMarks[i]);
        }

    }





}
