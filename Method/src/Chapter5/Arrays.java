package Chapter5;

public class Arrays {



    public static void main(String[] args)
    {
        int[] TestMarks = new int[5];
        TestMarks[0]= 34;
        TestMarks[4]=67;
        TestMarks[1]=36;
        TestMarks[2]=78;
        TestMarks[3]=98;

        for(int Mark : TestMarks){


            System.out.println(Mark + " ");
        }


        //array with initial values
        String[] arNames = new String[]{
                "Mike",
                "Jessica",
                "Sipho",
                "Rachael",
                "Jenny"

        };




    }
}
