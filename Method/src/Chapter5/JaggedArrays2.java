package Chapter5;

import java.util.Scanner;

public class JaggedArrays2 {


    public static void main(String[] args) {

        final int SIZE = 3;
        String[] Names = new String[SIZE];
        String[][]arPersons = new String[SIZE][];

        String[] arHobbies;
        int HobbyCount=0;

        String strName, strHobby;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < SIZE; i++){

       System.out.println("Enter name of a person: " + (i + 1)+ " :");
       strName = sc.nextLine();
       Names[i] = strName;

       System.out.println("How many Hobbies for : " + strName);
       HobbyCount=sc.nextInt();
       arHobbies = new String[HobbyCount];

       for(int j=0; j < arHobbies.length; j++){
           System.out.println("Enter Hobby for: "+ (j+1)+ "for "+ strName + ": ");
           strHobby = sc.next();
           arHobbies[j] = strHobby;

       }

       arPersons[i] = arHobbies; //storing array inside an array


        }
        for(int i = 0; i < arPersons.length; i++){

            System.out.println("========== NAMES============");
            System.out.print(Names[i] + "\t");

            for(int j =0; j < arPersons[i].length; j++){

                System.out.println((j + 1) + "  "+ arPersons[i][j]);

            }









        }

    }






    }
