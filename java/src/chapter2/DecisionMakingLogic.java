package chapter2;

public class DecisionMakingLogic {

    public static void main(String[] args){

    if(3>2) System.out.println("3 is greater than 2");

    if(5 !=7) System.out.println("5 is not equal to 7");

    //binary - if statement

        if(3==3){

            System.out.println("Yes, 3 is equal to 3");
        }else
        {
            System.out.println("no 3 can only be equal to 3");
        }


        int age = 25;
        if(age >=25){

            System.out.println("old enough");

        } else if(age ==21){

            System.out.println("Almost there");

        } else if (age == 16) {

            System.out.println("5 more years to go");
        }


        /*
        Ternary
        practice more ternary operators
         */

       //System.out.println((age>=18)? "Can vote" : "cannot vote");


                int _Age = 25;

            String _results = (_Age==24)? "Can vote" : "cannot vote";
            System.out.println(_results);


          // Ternary challenge
        int num = 5;
        String results = (num%2 ==0) ? "Even":
                (num%3 ==0) ? "Multiple of 3":
                        (num%5 ==0) ? "Multiple of 5":"odd";
        System.out.println(results);


    }















}
