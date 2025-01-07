package chapter1;

public class GetStarted {

    public static void main(String[] args){

        System.out.println("Hello world!\n" +
                            "welcome to java training");

        // declaration

        int age;
        double height;
        float salary;
        boolean isContractor;
        String name; //string is a class and we can create objects of a string class
        char position; //(S-senior, J-junior, I-intern)

        //Assign
        age =23;
        height= 1.3;
        salary= 6000.78F;
        isContractor= false;
        name = "Mokgaetsi";
        position= 'I';

        //use
        System.out.println("Name: " + name + "\n" +
                            "Age: " + age + "\n" +
                            "Height: "+ height + "\n" +
                            "Salary: " + salary + "\n" +
                            "Contract status: " + isContractor + "\n" +
                            "Position: " + position);


    }
}
