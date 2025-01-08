import java.util.Scanner;

public class Method{

    static String firstname, lastname, empNumber;
   static int age;
   static double Height;


    public static void main(String[] args){

        Messages();
        getUserDetails();
        displaydetails();



    }

    static void Messages(){


        System.out.println("welcome to methods");

    }
    static void getUserDetails(){

        Scanner sc  = new Scanner(System.in);


        System.out.println("Enter firstname");
        firstname= sc.nextLine();
        System.out.println("Enter lastname");
        lastname = sc.nextLine();
        System.out.println("Enter Employment Number");
        empNumber = sc.nextLine();
        System.out.println("Enter Age");
        age = sc.nextInt();
        System.out.println("Enter Height");
        Height = sc.nextDouble();


    }

    static void displaydetails(){

        System.out.println("firsname: " + firstname + "\n"+
                "Lastname: "+ lastname + "\n"+
                "Employement Number: " + empNumber + "\n"+
                "Age: " + age +"\n"+
                "Height: "+ Height);

    }







}

