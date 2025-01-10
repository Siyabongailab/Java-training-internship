package chapter2;

public class LogicalOperators {

    public static  void main(String[] args){

        boolean A = true, B = true, C= false;
        int x =5, y = 6, z = 3;

        boolean results;

        results = (A && B);
        System.out.println(results);

        results = (A || B);
        System.out.println(results);

        results = (A || B || C);
        System.out.println(results);

        results = (C && (A || B));
        System.out.println(results);

        results = (C ||(x>z));
        System.out.println(results);


        /*you cannot have
          true || true
          F || F
         */









    }


}
