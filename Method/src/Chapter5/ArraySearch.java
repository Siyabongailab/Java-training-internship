package Chapter5;

public class ArraySearch {

    public static void main(String[] args) {


        int[] arNumbers= {6,4,12,441,81,97,34,74,63,33};
        String[] Names = {"dolly", "patrick", "Onometopia", "I","saxophone","we"};
        String Name = "";
 SearchForNumber(441, arNumbers);
 getHighest(arNumbers);
 getLowest(arNumbers);

 HIghestCharacherName(Name, Names);



    }

    static void SearchForNumber(int num, int[] ar){


        for(int i =0; i < ar.length; i++){

            if(num==ar[i]){

                System.out.println("Number: " + num + "found at position: "+i);
                break;
            }

        }
    }
        static void getHighest(int[] ar){

        int num =ar[0];
            for(int i =1; i < ar.length; i++){

                if(ar[i]> num){

                    num= ar[i];
                    System.out.println("Highest number is: " +num);
                }
            }


        }

    static void getLowest(int[] ar){

        int num =ar[0];

        for(int i =1; i < ar.length; i++){


            if(ar[i]< num){

                num= ar[i];
                System.out.println("Lowest number is: " +num);
                break;
            }
        }

    }


    static void HIghestCharacherName(String Name, String[] Names){

        int maxC = Names[0].length();
        for( int i = 1; i < Names.length; i++){

            if( maxC > Names[i].length()){

                Name = Names[i];
                System.out.println(" Name with most characters is: "+ Name);
                break;
            }


        }




    }

}
