package Chapter5;

import java.util.Random;

public class ArrayManipulation {

    public static void main(String[] args) {

        Random rnd = new Random();
        int _Random = rnd.nextInt(66) + 10;
        int[] Evenar1 = new int[20];
        int[] Oddar2 = new int[20];


        for(int i = 0; i < 20; i++){

            if(Evenar1[i] % 2 ==0){

                Evenar1[i]= _Random;
                System.out.println(_Random);


            }else{


                Oddar2[i]= _Random;
                System.out.println(_Random);
            }

        }

        for(int number : Evenar1){


            System.out.println(number);
        }




    }
}
