package Chapter5;

public class JaggedArrays {


    public static void main(String[] args){

  //String[] arHobby = new String[3];

  //store arrays of type string-> array of arrays
  String[][] arHobbies = new String[3][];
  String[] arSports = {"Golf", "Rugby","Tennis"};


   arHobbies[0]= arSports;
   arHobbies[1] = new String[]{"Hiking","Reading Books"};
   arHobbies[2] =new String[4];

   //chess, soccer, netball, hiking
        //storing elements for person 3
        arHobbies[2][0] ="Chess";
        arHobbies[2][1] ="Soccer";
        arHobbies[2][2] ="Hiking";
        arHobbies[2][3] ="Netball";


        for(int i=0; i<arHobbies.length; i++){

           for(int j =0; j < arHobbies[i].length; j++)
            {
                System.out.println(arHobbies[i][j] + " |");
            }

            //System.out.println(arHobbies[i][j] + " ");
        }






    }
}
