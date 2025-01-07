package chapter1;

import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String[] args) {


        //declaration
        String name;
        int age, BirthYear,HoursWorked;
        double salary, TakeHome;
        char position;
        double taxDeduction;
        final int CurrentYear =2025;
        //final String CompanyName = "iLAB Quality";
        final double HourlyRate = 350;
        final double Taxrate = 0.35;

        String newline = "\n";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
          name = sc.nextLine();

        System.out.println("Please enter year of birth: ");
        BirthYear = sc.nextInt();

        System.out.println("Please enter Hours Worked: ");
        HoursWorked = sc.nextInt();

        System.out.println("Please enter job position");
        position = sc.next().charAt(0);

        //Use
        age = CurrentYear - BirthYear;
        salary = HoursWorked * HourlyRate;
        taxDeduction = salary * Taxrate;
        TakeHome = salary - taxDeduction;

        System.out.println("Name: " + name + newline +
                "Age: " + age + newline +
                "Position: "+ position + newline +
                "Hours Worked: " + HoursWorked + newline +
                "Salary: " + "R"+TakeHome
        );

    }
    }
