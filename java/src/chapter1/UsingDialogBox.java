package chapter1;

import javax.swing.*;

/*
*get input from the user using dialog boxes
* from JOption Pane class
 */
public class UsingDialogBox {

    public  static void main(String[]args){

        //declaration
        String name;
        int age, BirthYear,HoursWorked;
        double salary, TakeHome;
        char position;
        double taxDeduction;
        final int CurrentYear =2025;
       // final String CompanyName = "iLAB Quality";
        final double HourlyRate = 350;
        final double Taxrate = 0.35;

        String newline = "\n";

        //Assign

        name = JOptionPane.showInputDialog("Please enter your name");
        BirthYear= Integer.parseInt(JOptionPane.showInputDialog("Enter Year you were born in"));
        HoursWorked = Integer.parseInt(JOptionPane.showInputDialog("please enter hours worked?"));
        position = JOptionPane.showInputDialog("what position do you have in the company: ").charAt(0);


        age = CurrentYear - BirthYear;
        salary = HoursWorked * HourlyRate;
        taxDeduction = salary * Taxrate;
        TakeHome = salary - taxDeduction;

        String Output = "Name: " + name + newline + "Age: " + age + newline +  "Position: "+ position + newline +
                        "Hours Worked: " + HoursWorked + newline + "Salary: " + "R"+TakeHome;


        /*System.out.println("Name: " + name + newline +
                "Age: " + age + newline +
                "Position: "+ position + newline +
                "Hours Worked: " + HoursWorked + newline +
                "Salary: " + "R"+TakeHome
        );*/

       JOptionPane.showMessageDialog(null, Output);

    }
}
