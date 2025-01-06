package chapter1;

public class UsingConstants {

    public static void main(String[] args){

         //declaration
        String name;
        int age;
        int BirthYear;
        double salary;
        double HoursWorked;
        char position;
        final int CurrentYear =2025;
        //final String CompanyName = "iLAB Quality";
        final double HourlyRate = 350;

        String newline = "\n";

        //assign
        name = "James";
        BirthYear = 1980;
        HoursWorked= 200;
        position= 'S';
        age = CurrentYear - BirthYear;
        salary = HoursWorked * HourlyRate;

        //use
        System.out.println("Name: " + name + newline +
                            "Age: " + age + newline +
                             "Position: "+ position + newline +
                            "Hours Worked: " + HoursWorked + newline +
                             "Salary: " + "R"+salary
                );


    }

}
